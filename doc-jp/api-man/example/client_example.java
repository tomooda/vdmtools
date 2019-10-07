import org.omg.CORBA.*;
import java.io.*;

import jp.co.csk.vdm.toolbox.api.ToolboxClient;
import jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.*;
import jp.co.csk.vdm.toolbox.api.corba.VDM.*;

public class client_example 
{
  private static short client;
  private static VDMApplication app;

  private static final String VdmToolboxHomeWin=
      "C:\\Program Files\\The VDM-SL Toolbox v3.7.1\\examples";
  private static final String VppToolboxHomeWin=
      "C:\\Program Files\\The VDM++ Toolbox v6.7.17\\examples";
  private static final String VdmToolboxHome=
      "/home/vdm/toolbox/examples/sl";    
  private static final String VppToolboxHome=
      "/home/vdm/toolbox/examples/pp";
    
  public static void main(String args[])
  {
    try {
      //
      // ORB����
      //

      String os = System.getProperty("os.name", "");
      String ToolboxHome = System.getProperty("TOOLBOXHOME", "");

      if (System.getProperty("VDMPP") == null) {
          app = (new ToolboxClient ()).getVDMApplication(args,
                                                         ToolType.SL_TOOLBOX);
	  if( 0 == ToolboxHome.length() ) {
            if (os.startsWith("Windows")) 
              ToolboxHome = VdmToolboxHomeWin;
            else 
              ToolboxHome = VdmToolboxHome;	 
          }
      }
      else {
          app = (new ToolboxClient ()).getVDMApplication(args,
                                                         ToolType.PP_TOOLBOX);
	  if( 0 == ToolboxHome.length() ) {
            if (os.startsWith("Windows")) 
              ToolboxHome = VppToolboxHomeWin;
            else
              ToolboxHome = VppToolboxHome;
          }
      }
      
      // Toolbox�ɃN���C�A���g��o�^:
      
      client = app.Register();
      
      System.out.println ("registered: " + client);
            
      // �ŏ��ɁA���v���W�F�N�g���\�z���邽�߂�
      // VDMProject�C���^�[�t�F�C�X�ɑ΂���n���h�����l��:
            
      try{
        VDMProject prj = app.GetProject();
        prj.New();
                
        // �K�v�ȃt�@�C�����܂߂邽�߂Ƀv���W�F�N�g���\�z����B
        // �t�@�C����VDM Toolbox���n�����������f�B���N�g����
        // �z�u����Ă��Ȃ���΂Ȃ�Ȃ��B����ȊO�̏ꍇ��
        // �t�@�C���ɂ͐�΃p�X���g�p���ׂ��ł���

                
        if(app.Tool() == ToolType.SL_TOOLBOX){ 
          prj.AddFile(ToolboxHome + "/sort/sort.vdm");
        }
        else{
          prj.AddFile(ToolboxHome + "/sort/implsort.vpp"); 
          prj.AddFile(ToolboxHome + "/sort/sorter.vpp");
          prj.AddFile(ToolboxHome + "/sort/explsort.vpp");
          prj.AddFile(ToolboxHome + "/sort/mergesort.vpp");
          prj.AddFile(ToolboxHome + "/sort/sortmachine.vpp");
        }

        // �t�@�C���̍\�����:
        VDMParser parser = app.GetParser();
        FileListHolder fl = new FileListHolder();
        int count = prj.GetFiles(fl);
        String flist[] = fl.value;
        
        // �Q�̈قȂ���@�Ńt�@�C�����\����͂���B���́A
        // �t�@�C���ꗗ���������e�t�@�C�����ʂɍ\����͂���B
        // (�������ASL_TOOLBOX�ɑ΂��Ă͍\�z�t�@�C�����B�P�ł��邪�A
        // �����ɂ͂���ŏ\���ł��낤)
              
        System.out.println("Parsing files individually");
        for(int i=0; i<flist.length; i++){
          System.out.println(flist[i]);
          System.out.println("...Parsing...");
          if(parser.Parse(flist[i]))
            System.out.println("done.");
          else
            System.out.println("error.");
        }
              
        // �����Ă��̌シ�ׂẴt�@�C������x�ɍ\�����:
       
        System.out.println("Parsing entire list...");
        parser.ParseList(flist);
        System.out.println("done.");
        
        // �\����͒��ɃG���[���N�����ꍇ�ɂ�
        // �����Œ���:

        // �G���[�n���h���[

        VDMErrors errhandler = app.GetErrorHandler();  
        
        ErrorListHolder errs = new ErrorListHolder();
        // �G���[������o��
        int nerr = errhandler.GetErrors(errs); 
         jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.Error errlist[] = 
           errs.value;
        if(nerr>0){
        �@// �G���[�̈��:
         System.out.println("errors: ");
          for(int i=0; i<errlist.length; i++){
            System.out.println(errlist[i].fname);
            System.out.println(errlist[i].line);
            System.out.println(errlist[i].msg);
          }
        }
              
        // ���l�Ɍx����₢���킹�邱�Ƃ��ł���B
       
        // ���ׂẴ��W���[���̖��̂Ə�Ԃ��ꗗ:
       ListModules(app);
     
        // ���ׂẴ��W���[���̌^�`�F�b�N:

        VDMTypeChecker tchk = app.GetTypeChecker();
        ModuleListHolder moduleholder = new ModuleListHolder();
        prj.GetModules(moduleholder);
        String modules[] = moduleholder.value;
        System.out.println("Type checking all modules...");
        if(tchk.TypeCheckList(modules))
          System.out.println("done.");
        else
          System.out.println("errors.");
            
        // ���ׂẴ��W���[���̍ŐV��Ԃ̈ꗗ:
       ListModules(app);
              
              
        // �Ō�ɃC���^�[�v���^�[�̎g�p�@�������B 
        
        System.out.println("Interpreter tests:");
              
        VDMInterpreter interp = app.GetInterpreter();

              
        // �f���v�Z������֐��̌Ăяo��:
        EchoPrimes(20, interp, app);

        // ��Q�̕��@�Ƃ��Ė⍇����p������@������:
        // �\�[�g�����ׂ������̗���\�z����B���̂��߂�
        // VDM�l�����o�����߂�VDMFactory�ɑ΂���n���h�������߂�:
    
        VDMFactory fact = app.GetVDMFactory();
              
        app.PushTag(client); 
        // ����ȍ~�͐������ꂽ�I�u�W�F�N�g���ׂĂɃ^�O�t������
       
        VDMSequence list = fact.MkSequence(client);
        
        VDMNumeric elem;
        for(int j=0; j<20; j++){
          elem = fact.MkNumeric(client, j);
          list.ImpPrepend(elem);
        }
              
        System.out.println("The sequence to be sorted: " + 
                         list.ToAscii());

        // �Ăяo���̂��߂̈����̈ꗗ�̍\�z�B�����
        // �E���тɑS�������܂߂�Sequence�̍\�z�ł���:
       VDMSequence arg_l = fact.MkSequence(client);
              
        arg_l.ImpAppend(list);

        // ���[�U�[�C���^�[�t�F�C�X�ŃC���^�[�v���^�[��p���錋�ʂ�
        // �\�����邽�߁AVerbose ��true�ɐݒ�:
             
        interp.Verbose(true);
        interp.Debug(true);
    
        // �n�߂ɃC���^�[�v���^�[������������
       System.out.println("About to initialize the interpreter");
        interp.Initialize();
              
        VDMGeneric g;
        if(app.Tool() == ToolType.SL_TOOLBOX){
          g = interp.Apply(client, "MergeSort", arg_l);
        }
        else{ // PP_TOOLBOX
        �@// �ŏ��́A���S�ƂȂ�\�[�g�I�u�W�F�N�̐���:
          interp.EvalCmd("create o := new SortMachine()");
         
        �@// ���́A���̃I�u�W�F�N�g��� GoSorting ���\�b�h���Ăяo��:
         g = interp.Apply(client, "o.GoSorting", arg_l);
        }

        System.out.println("The sorted sequence: " + g.ToAscii());
              
        // �Ō�ɁA�Ԃ��ꂽ�񋓂�ʂ��ė񋓒��̑S�v�f��
        // ���v���v�Z���邽�߂̌J��Ԃ�:

        VDMSequence s = VDMSequenceHelper.narrow(g);
              
        VDMGenericHolder eholder = new VDMGenericHolder();
          
        int sum=0;
        for (int ii=s.First(eholder); ii != 0; ii=s.Next(eholder)) {
          VDMNumeric num = VDMNumericHelper.narrow(eholder.value);
          sum = sum + GetNumeric( num );
        }

        System.out.println("The sum of all the elements: " +  sum);
        
        EchoPrimes2(50, interp, app);
        
        app.DestroyTag(client);

        app.Unregister(client);
        System.exit(0);
      }
      catch(APIError err) {
        System.err.println("API error"+err.getMessage ());
        System.exit(1);
      }
    }
    catch
      (jp.co.csk.vdm.toolbox.api.ToolboxClient.CouldNotResolveObjectException ex) 
      {
        System.err.println(ex.getMessage());
        System.exit(1);
      }
    catch(COMM_FAILURE ex) {
      System.err.println(ex.getMessage());
      ex.printStackTrace();
      System.exit(1);
    }
  };

  public static void ListModules(VDMApplication app){
        
    try{
      // ���̊֐��̓��W���[���Ƃ����̏�Ԃ��ꗗ�ɂ���B
      // �v���W�F�N�g�n���h��
        
      VDMProject prj = app.GetProject();
      
      // ���W���[�����|�W�g��
      VDMModuleRepos repos = app.GetModuleRepos();
          
      ModuleListHolder ml = new ModuleListHolder();
      prj.GetModules(ml);
      String mlist[] = ml.value;
      System.out.println("Modules:");
          
      for(int i=0; i<mlist.length; i++){
              
     �@ // ���̍\���̓��W���[����Ԃ̕ێ��Ɏg�p�����:
       ModuleStatusHolder stateholder = new ModuleStatusHolder();
        // i�Ԗڂ̃��W���[���̏�Ԃ𓾂�
        repos.Status(stateholder, mlist[i]);  
        ModuleStatus stat = stateholder.value;
        
        // ��Ԃ��������B
        System.out.println(mlist[i]);
        System.out.println("SyntaxChecked: " + stat.SyntaxChecked);
        System.out.println("TypeChecked: " + stat.TypeChecked);
        System.out.println("Code generated: " + stat.CodeGenerated);
        System.out.println("PrettyPrinted: " + stat.PrettyPrinted);
      }
    }
    catch(APIError err) {
      System.err.println("API error");
      System.exit(1);
    }
  }
    

  public static void EchoPrimes(int n, VDMInterpreter interp, 
                                  VDMApplication app)
  {
    try{
      // ���ȉ��̑f���̗�𐶐���
      // �����stdout�ɂ��̂܂ܑ���Ԃ��B
        
      app.PushTag(client);
            
      // ���� Generic �̓C���^�[�v���^�[����̌��ʂ�ێ����邱�Ƃ�
      // �p����B
      VDMGeneric g;
        
      // 20�ȉ��̑f�����v�Z����̂ɂ�EvalExpression��p����
           
      String expr = "[e|e in set {1,...,"+n+"} &"+
                    " exists1 x in set {2,...,e} & e mod x = 0]";
      g = interp.EvalExpression(client,expr);
            
      if(g.IsSequence()){
        System.out.println("All primes below " + n + ": " + 
                           g.ToAscii());
      }
            
      VDMSequence s = VDMSequenceHelper.narrow(g);
      
      VDMGenericHolder eholder = new VDMGenericHolder();
            
      int sum=0;
      for (int ii=s.First(eholder); ii != 0; ii=s.Next(eholder)) {
        VDMNumeric num = VDMNumericHelper.narrow(eholder.value);
        sum = sum + GetNumeric( num );
      }
      System.out.println("The sum of all the primes: " + sum);
      app.DestroyTag(client); // �d�グ...
   }
    catch(APIError err) {
      System.err.println("API error");
      System.exit(1);
    }
  }
    
  public static void EchoPrimes2(int n, VDMInterpreter interp, 
                                 VDMApplication app)
  {
    // ���ȉ��̑f���̗�𐶐���
    // ���̗��stdout�ւ��̂܂ܑ���Ԃ��B  
  �@// �ǉ��Ƃ��āAVDM�l�S�̂�toolbox����N���C�A���g���ֈڍs��
    // �����jp.co.csk.vdm.toolbox.VDM�ɐ錾����Ă���
  �@// "real"��Java�l�ɕϊ����邽�߂�
  �@// �ǂ�GetCPPValue���g�p�ł��邩�A�����̊֐��������Ă���
        
    try{
      app.PushTag(client);
      
      // ���� VDMGeneric �̓C���^�[�v���^�[����̌��ʂ̕ێ��� 
      // �g�p�����B
      VDMGeneric g;
        
      // EvalExpression���g�p��20�ȉ��̑f�����v�Z����
            
      String expr = "[e|e in set {1,...,"+n+"} &" +
                    " exists1 x in set {2,...,e} & e mod x = 0]";
      g = interp.EvalExpression(client,expr);
        
      if(g.IsSequence()){
        System.out.println("All primes below " + n + ": " + g.ToAscii());
      }
            
      VDMSequence s = VDMSequenceHelper.narrow(g);
            
      // real Java VDM �l�ɕϊ�!
            
      java.util.LinkedList sj = 
          new java.util.LinkedList ();
            
      VDMGenericHolder eholder = new VDMGenericHolder();
            
      // Generic g �� "real" Java Sequence �l�ɕϊ�����
            
      for (int ii=s.First(eholder); ii != 0; ii=s.Next(eholder)) {
        VDMNumeric num = VDMNumericHelper.narrow(eholder.value);
        sj.add(Integer.valueOf( GetNumeric( num ) ));
      }
            
      int sum=0;
      for (java.util.Iterator itr = sj.iterator(); 
           itr.hasNext();){
          Integer i = (Integer) itr.next ();
          sum = sum + i.intValue();
      }
      
      System.out.println("The sum of all the primes: " + sum);
      app.DestroyTag(client); // �d�グ...
    }
    catch(APIError err) {
      System.err.println("API error");
      System.exit(1);
    }
  }

  public static int GetNumeric( VDMNumeric num )
  {
    byte[] b1 = num.GetCPPValue();
    try
    {
      InputStream is = new ByteArrayInputStream( b1 );
      int type = is.read(); 
      int c = -1;
      int last = -1;
      String str = "";
      while( true )
      {
        c = is.read();
        if ( ( c == -1 ) || ( c == ',' ) )
        {
          last = c;
          break;
        }
        str += Character.toString( (char)c );
      }
      return Integer.parseInt( str );
    }
    catch( Exception e )
    {
      return 0;
    }
  } 
}






