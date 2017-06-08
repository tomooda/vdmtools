/***
*  * WHAT
*  * FILE
*  *    $Source: /home/vdmtools/cvsroot/toolbox/code/qtgui/interpreterF.h,v $
*  * VERSION
*  *    $Revision: 1.25 $
*  * DATE
*  *    $Date: 2006/02/15 02:19:18 $
*  * AUTHOR
*  *    $Author: vdmtools $
*  * COPYRIGHT
*  *    (C) Kyushu University
***/

#ifndef __interpreterf_h__
#define __interpreterf_h__

#ifdef QT4
#include <QtGui/QtGui>
#define WFlags Qt::WindowFlags
#define QLIST QList
#define QTREEWIDGET QTreeWidget
#define QTREEWIDGETITEM QTreeWidgetItem
#else
#include <qvariant.h>
#include <qwidget.h>
#include <qlistview.h>
#include <qlayout.h>
#include <qpushbutton.h>
#include <qlistview.h>
#include <qtextedit.h>
#define QLIST QValueList
#define QTREEWIDGET QListView
#define QTREEWIDGETITEM QListViewItem
#define QTreeWidgetItem void
#endif // QT4

#include "interface2TB.h"

class BufferedQTextEdit : public QTextEdit
{
  Q_OBJECT

public:
  BufferedQTextEdit(QWidget *, const char *);
  ~BufferedQTextEdit(){};
  void addString(const QString&);
  void clearBuffer();
  void insertPrompt();

private:
  QStringList buffer;
  int curIndex;

signals:
  void returnPressed2();

protected:
  virtual void cursorUp ( bool);
  virtual void cursorDown ( bool);
  virtual void keyPressEvent( QKeyEvent *e );
  void showCurrent();
};

class interpreterW : public QWidget
{
  Q_OBJECT

public:
  interpreterW(QWidget* parent = 0, const char* name = 0, WFlags fl = 0);
  ~interpreterW();

  void write(const QString&);
  void addBreakName(const QString &, int);
  void addBreakPos(const QString &, int, int, int);
  void removeBreak(int);
  void enableBreak(int);
  void disableBreak(int);
  void gotoBtLevel(int);
  void clearDebugWindow();
  void resetWindow();
  void clearBuffer();
  void setBackTrace(const QLIST<BackTraceEntry> & bts);
  void checkBreakpointsFile();
  void removeBreakOfFile( QString & filename );
  void setBusy(bool flg);
  void setMaxLogLines(int num);
  void addString(const QString & cmd);

  void setWindowName(const char* name) { this->windowName = name; }
  const QString & getWindowName() { return this->windowName; }

signals:
  void updateButtons();
  void resetFilePosition(QString, int, int);
  void executeCommand(QString);
  void logWrite(QString);
  void enableBr(int);
  void disableBr(int);
  void deleteBr(int);

public slots:
  void toggle(bool);
  void enableBR_qt4(bool);
  void disableBR_qt4(bool);
  void deleteBR_qt4(bool);
#ifndef QT4
  void enableBR_qt3();
  void disableBR_qt3();
  void deleteBR_qt3();
#endif // QT4
  void returnPressed();

  void breakDoubleClicked_qt4(QTreeWidgetItem * item, int column);
  void breakClicked_qt4(QTreeWidgetItem * item, int colmun);
  void traceClicked_qt4(QTreeWidgetItem * item, int column);

#ifndef QT4
//  void breakDoubleClicked_qt3(QListViewItem * item, const QPoint & pnt, int c);
  void breakDoubleClicked_qt3(QListViewItem * item);
  void breakClicked_qt3(QListViewItem * item, const QPoint & pnt, int c);
  void traceClicked_qt3(QListViewItem * item, const QPoint & pnt, int c) ;
#endif // QT4

protected:
  QString removePrompt(const QString&);
  QTREEWIDGETITEM* findBreakNum(int);
  virtual bool event ( QEvent * e );

private:
  QWidget* createInterpreterLE( QWidget* parent );
  QWidget* createInLE( QWidget* parent );
  QWidget* createToggleB( QWidget* parent );
  QLayout* createTraceAndBreakPointsBox( QWidget* parent );
  QWidget* createTraceLVBox( QWidget* parent );
  QWidget* createTraceList( QWidget* parent );
  QWidget* createBreakPointsBox( QWidget* parent );
  QLayout* createButtonPart( QWidget* parent );
  QWidget* createEnableButton( QWidget* parent );
  QWidget* createDisableButton( QWidget* parent );
  QWidget* createDeleteButton( QWidget* parent );
  QWidget* createBreakPointsList( QWidget* parent );

  QTextEdit* interpreterLE;
  BufferedQTextEdit* inLE;
  QPushButton* toggleB;
  QTREEWIDGET* traceLV;
  QPushButton* enableB;
  QPushButton* disableB;
  QPushButton* deleteB;
  QTREEWIDGET* breakLV;

#ifndef QT4
  int maxlines;
#endif // QT4

  QString windowName;
  int pcount;
};

#endif // __interpreterf_h__
