% This is a nuweb document to be processed by nuweb. -*- mode: text -*-

%% ID
%%   $Id: tb_version.w,v 1.114 2006/05/23 00:05:04 vdmtools Exp $
%% COPYRIGHT
%%   Kyushu University


\documentclass{article}
\usepackage{toolbox}
\usepackage{latexsym}

\begin{document}

% Comment: at-sign is the command prefix and must be duplicated (@@)
% where is is needed verbatim.

\docdef{Version Functions}
{The VDM Tool Group}
{960918}
{tb\_version.w}
{Code documentation}
{In developement}
{Restricted}
{\copyright\ Kyushu University}
{\item[V1.0] First version}
{}

\tableofcontents
\newpage

\section{Introduction}

Various version numbers are used by the Toolbox code: by FlexLM when
retriving a license, by the Toolbox for identifying itself to the
user, by the resources included into the Windows Toolbox executables
and by the Windows installation programs for identifying which version
is being installed.

The version information embedded in the Windows Toolbox executable can
be used by the installation program to determine if an already
installed executable was an older release that could be overwritten;
but as each release will be installed in a directory whose name
include the version this is not relevant at the moment.

The windows resource file contains a version field made up of 4 16 bit
words, such that a version conceptually is a 64 bit entity. As this
maps nicely to the versions we so far have used to identify the
toolbox, this has been chosen as the basic internal version format.

A version identification is in the toolbox code represented by a
four-tuple $(a,b,c,d)$ where a is the major version number, b is the
minor version number, c is the subminor version number and d is the
subsubminor version. a is incremented for a completely new tool with
most things changed. b is incremented when new (user visible) features
have been added or incompatible changes has been made to distributed
libraries, c is incremented for bug fixes and internal changes and d
is zero for public releases otherwise a letter 'a', 'b', \dots for
internal releases, which are distributed to a customer.

This table illustrates how the internal representation is mapped and
displayed to the user.
\begin{center}
\begin{tabular}{ll}
  (3,0,0,0)  & 3.0 \\
  (3,0,0,'a')  & 3.0a \\
  (3,0,1,0)  & 3.0.1 \\
  (3,0,1,0)  & 3.0.1a \\
  (3,1,0,0)  & 3.1 \\
  (3,2,0,'b')  & 3.2b \\
  (3,3,1,0)  & 3.3.1 \\
  (3,4,2,'c')  & 3.4.2c \\
\end{tabular}
\end{center}

A class \texttt{TB\_Version} has been invented to contain the toolbox
title and version, which are given as parameters to the class
constructor.


\section{Version Definition}
\label{sec:VersionDef}

This is the place where the versions are defined for the various VDM
Toolboxes.  The sixth argument is the tool type (VDM-SL, VDM-SL Lite or VDM++) used
by the Tcl/Tk interpreter.
@d Version Definitions @{
//************************************************************
#define MAJOR 9
#define MINOR 0
#define SUBMINOR 7
#define SUBSUBMINOR 0 //L'b' // 0, L'a', L'b'
#define SUBSUBMINORRT L'b'  // 0, L'a', L'b'
const TB_Version tb_version_sl(L"The VDM-SL Toolbox",
                               L"VDM-SL Toolbox",
                                MAJOR, MINOR, SUBMINOR, SUBSUBMINOR,
                                TB_Version::vdmsl);
const TB_Version tb_version_sll(L"The VDM-SL Toolbox Lite",
                                L"VDM-SL Toolbox Lite",
                                MAJOR, MINOR, SUBMINOR, SUBSUBMINOR,
                                TB_Version::vdmsllite);
const TB_Version tb_version_pp(L"The VDM++ Toolbox",
                               L"VDM++ Toolbox",
                               MAJOR, MINOR, SUBMINOR, SUBSUBMINOR,
                               TB_Version::vdmpp);
const TB_Version tb_version_ppl(L"The VDM++ Toolbox Lite",
                                L"VDM++ Toolbox Lite",
                                MAJOR, MINOR, SUBMINOR, SUBSUBMINOR,
                                TB_Version::vdmpplite);
const TB_Version tb_version_rt(L"The VDM++ VICE Toolbox",
                               L"VDM++ VICE Toolbox",
                               MAJOR, MINOR, SUBMINOR, SUBSUBMINORRT,
                               TB_Version::vice);
const TB_Version tb_version_rtl(L"The VDM++ VICE Toolbox Lite",
                                L"VDM++ VICE Toolbox Lite",
                                MAJOR, MINOR, SUBMINOR, SUBSUBMINORRT,
                                TB_Version::vicelite);

#ifdef VDMSL
#  ifdef LITE
const TB_Version& tb_version = tb_version_sll;
#  else
const TB_Version& tb_version = tb_version_sl;
#  endif // LITE
#endif //VDMSL

#ifdef VDMPP
# ifdef VICE
#ifdef LITE
const TB_Version& tb_version = tb_version_rtl;
#else
const TB_Version& tb_version = tb_version_rt;
#endif // LITE
# else
# ifdef LITE
const TB_Version& tb_version = tb_version_ppl;
# else
const TB_Version& tb_version = tb_version_pp;
#endif // LITE
# endif //VICE
#endif //VDMPP
//************************************************************
@}


\section{Method Definitions}
\label{sec:Methods}

The method \texttt{FormatVersionId} is used for turning the internal
representation into a string representation as in the above table. The
method \texttt{GetVersionId} is the public method which returns the
same string. The method \texttt{GiveToolVersionDate} returns the
string prefixed with ``v'' and suffixed with the date of the toolbox
build. The method \texttt{GetVersionIdForFLEXlm} returns only the
first two number of the versions, which is what the FLEXlm functions
expects.  The method \texttt{GetVersionComponents} can be used to
retrieve the four numbers which make up the version.

@O tb_version.cc
@{@<This file is generated@>
/***
*  * WHAT
*  *    Version Identification
*  * FILE
*  *    $Id: tb_version.w,v 1.114 2006/05/23 00:05:04 vdmtools Exp $
***/


#include <iostream>
#include <sstream>

#include "tb_version.h"
#include "metaiv.h"
#include "date.h"

#if !defined(VDMSL) && !defined(VDMPP)
#error VDMSL nor VDMPP is defined
#endif

@<Version Definitions@>

TB_Version::TB_Version(const wchar_t *tit,
                       const wchar_t *startmenutooltit,
                       ushrt maj, ushrt min, ushrt submin, wchar_t subsubmin,
                       TB_Type tbtp) :
  title(tit),
  startmenutooltitle(startmenutooltit),
  majorxx(maj), minorxx(min), subminor(submin), subsubminor(subsubmin),
  tb_type(tbtp)
{
}

std::wstring TB_Version::FormatVersionId(bool compressed) const
{
  std::wstring dot;
  if (compressed)
    dot = L"";
  else
    dot = L".";

  wostringstream s;
  s << Int(majorxx).ascii();
  s << dot << Int(minorxx).ascii();

  if (subminor != 0)
    s << dot << Int(subminor).ascii();

  if (subsubminor != 0)
    s << Char(subsubminor).GetValue();

  return s.str();
}

std::wstring TB_Version::GiveToolTitle () const
{
  std::wstring res (title);
  if(isDebug())
    res += L" Debug";
  return res;
}

std::wstring TB_Version::GiveStartMenuToolTitle () const
{
  std::wstring res (startmenutooltitle);
  if(isDebug())
    res += L" Debug";
  res += L" v" + GetVersionId();
  return res;
}

std::wstring TB_Version::GetVersionId() const
{
  return FormatVersionId(false);
}

std::wstring TB_Version::GetShortVersionId() const
{
  return FormatVersionId(true);
}

std::wstring TB_Version::GetExtraComment() const
{
  std::wstring res;
  if(isLite())
    res += L"-Lite";
  return res;
}

std::wstring TB_Version::GiveToolVersionDate () const
{
  return  L"v" + GetVersionId() + L" - " + date;
}

// Only return a.b
//std::wstring TB_Version::GetVersionIdForFLEXlm() const
//{
//  std::wstring s;
//  s += Int(majorxx).ascii();
//  s += L"." + Int(minorxx).ascii();
//  return s;
//}

void TB_Version::GetVersionComponents(unsigned short &a,
                                      unsigned short &b,
                                      unsigned short &c,
                                      unsigned short &d) const
{
  a = majorxx;
  b = minorxx;
  c = subminor;
  d = subsubminor;
}

// Return Toolbox type: vdmsl, vdmsllite, vdmpp, vdmppl or vice
TB_Version::TB_Type
TB_Version::GetToolType() const
{
  return tb_type;
}

bool TB_Version::isLite() const
{
#ifdef LITE
  return true;
#else
  return false;
#endif // LITE
}

bool TB_Version::isDLModuleEnabled() const
{
//  if( isLite() ) return false;
#ifdef DL_MODULE_ENABLED
  return true;
#else
  return false;
#endif // DL_MODULE_ENABLED
}

bool TB_Version::isDebug() const
{
#ifdef _MSC_VER
#ifdef WINDEBUG
  return true;
#else
  return false;
#endif // WINDEBUG
#else
  return false;
#endif // _MSC_VER
}

bool TB_Version::canCG() const
{
  return !isLite();
}

bool TB_Version::canJavaCG() const
{
  return !isLite();
}

bool TB_Version::canJ2V() const
{
  return !isLite();
}

@}

\section{tb\_version.h}

The header file declares the class and declares a const object
\texttt{tb\_version} which is the object to reference when tool title
and version is needed.

@O tb_version.h
@{@<This file is generated@>
// Purpose: Identify toolbox version.
//
// $Id: tb_version.w,v 1.114 2006/05/23 00:05:04 vdmtools Exp $

#ifndef __tb_version_h__
#define __tb_version_h__

#include <wchar.h>
#include <string>

class TB_Version
{
public:
  enum TB_Type { vdmsl, vdmsllite, vdmpp, vdmpplite, vice, vicelite };
  typedef TB_Type TB_Type;
private:
  typedef unsigned short ushrt;
  const wchar_t * title;
  const wchar_t * startmenutooltitle;
  ushrt majorxx, minorxx, subminor, subsubminor;
  TB_Type tb_type;
public:
  TB_Version(const wchar_t *tit,
             const wchar_t *startmenutooltit,
             ushrt maj, ushrt min, ushrt submin, wchar_t subsubmin,
             TB_Type tbtp);

  std::wstring FormatVersionId(bool compressed) const;
  std::wstring GetVersionId() const;
  std::wstring GetShortVersionId() const;
  std::wstring GetExtraComment() const;
  std::wstring GiveToolTitle () const;
  std::wstring GiveStartMenuToolTitle () const;
  std::wstring GiveToolVersionDate () const;
  void GetVersionComponents(unsigned short &a, unsigned short &b, unsigned short &c, unsigned short &d) const;
  TB_Type GetToolType () const;

  bool isLite() const;
  bool isDLModuleEnabled() const;
  bool isDebug() const;
  bool canCG() const;
  bool canJavaCG() const;
  bool canJ2V() const;
};

extern const TB_Version& tb_version;
extern const TB_Version tb_version_sll;
extern const TB_Version tb_version_sl;
extern const TB_Version tb_version_pp;
extern const TB_Version tb_version_ppl;
extern const TB_Version tb_version_rt;
extern const TB_Version tb_version_rtl;

#endif // __tb_version_h__
@}

@d This file is generated
@{/* This file is generated from tb_version.w. Do not modify! */ @}


\end{document}













