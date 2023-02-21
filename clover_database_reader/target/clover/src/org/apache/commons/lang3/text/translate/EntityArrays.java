/* $$ This file has been instrumented by Clover 4.1.2#20161011084623935 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.lang3.text.translate;

/**
 * Class holding various entity data for HTML and XML - generally for use with
 * the LookupTranslator.
 * All arrays are of length [*][2].
 *
 * @since 3.0
 * @version $Id$
 */
public class EntityArrays {public static class __CLR4_1_2d1td1tl3lqxsq5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,16941,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Mapping to escape <a href="https://secure.wikimedia.org/wikipedia/en/wiki/ISO/IEC_8859-1">ISO-8859-1</a>
     * characters to their named HTML 3.x equivalents.
     * @return the mapping table
     */
    public static String[][] ISO8859_1_ESCAPE() {try{__CLR4_1_2d1td1tl3lqxsq5.R.inc(16913); __CLR4_1_2d1td1tl3lqxsq5.R.inc(16914);return ISO8859_1_ESCAPE.clone(); }finally{__CLR4_1_2d1td1tl3lqxsq5.R.flushNeeded();}}
    private static final String[][] ISO8859_1_ESCAPE = {
        {"\u00a0", "&nbsp;"}, // non-breaking space
        {"\u00a1", "&iexcl;"}, // inverted exclamation mark
        {"\u00a2", "&cent;"}, // cent sign
        {"\u00a3", "&pound;"}, // pound sign
        {"\u00a4", "&curren;"}, // currency sign
        {"\u00a5", "&yen;"}, // yen sign = yuan sign
        {"\u00a6", "&brvbar;"}, // broken bar = broken vertical bar
        {"\u00a7", "&sect;"}, // section sign
        {"\u00a8", "&uml;"}, // diaeresis = spacing diaeresis
        {"\u00a9", "&copy;"}, // \u00a9 - copyright sign
        {"\u00aa", "&ordf;"}, // feminine ordinal indicator
        {"\u00ab", "&laquo;"}, // left-pointing double angle quotation mark = left pointing guillemet
        {"\u00ac", "&not;"}, // not sign
        {"\u00ad", "&shy;"}, // soft hyphen = discretionary hyphen
        {"\u00ae", "&reg;"}, // \u00ae - registered trademark sign
        {"\u00af", "&macr;"}, // macron = spacing macron = overline = APL overbar
        {"\u00b0", "&deg;"}, // degree sign
        {"\u00b1", "&plusmn;"}, // plus-minus sign = plus-or-minus sign
        {"\u00b2", "&sup2;"}, // superscript two = superscript digit two = squared
        {"\u00b3", "&sup3;"}, // superscript three = superscript digit three = cubed
        {"\u00b4", "&acute;"}, // acute accent = spacing acute
        {"\u00b5", "&micro;"}, // micro sign
        {"\u00b6", "&para;"}, // pilcrow sign = paragraph sign
        {"\u00b7", "&middot;"}, // middle dot = Georgian comma = Greek middle dot
        {"\u00b8", "&cedil;"}, // cedilla = spacing cedilla
        {"\u00b9", "&sup1;"}, // superscript one = superscript digit one
        {"\u00ba", "&ordm;"}, // masculine ordinal indicator
        {"\u00bb", "&raquo;"}, // right-pointing double angle quotation mark = right pointing guillemet
        {"\u00bc", "&frac14;"}, // vulgar fraction one quarter = fraction one quarter
        {"\u00bd", "&frac12;"}, // vulgar fraction one half = fraction one half
        {"\u00be", "&frac34;"}, // vulgar fraction three quarters = fraction three quarters
        {"\u00bf", "&iquest;"}, // inverted question mark = turned question mark
        {"\u00c0", "&Agrave;"}, // \u00c0 - uppercase A, grave accent
        {"\u00c1", "&Aacute;"}, // \u00c1 - uppercase A, acute accent
        {"\u00c2", "&Acirc;"}, // \u00c2 - uppercase A, circumflex accent
        {"\u00c3", "&Atilde;"}, // \u00c3 - uppercase A, tilde
        {"\u00c4", "&Auml;"}, // \u00c4 - uppercase A, umlaut
        {"\u00c5", "&Aring;"}, // \u00c5 - uppercase A, ring
        {"\u00c6", "&AElig;"}, // \u00c6 - uppercase AE
        {"\u00c7", "&Ccedil;"}, // \u00c7 - uppercase C, cedilla
        {"\u00c8", "&Egrave;"}, // \u00c8 - uppercase E, grave accent
        {"\u00c9", "&Eacute;"}, // \u00c9 - uppercase E, acute accent
        {"\u00ca", "&Ecirc;"}, // \u00ca - uppercase E, circumflex accent
        {"\u00cb", "&Euml;"}, // \u00cb - uppercase E, umlaut
        {"\u00cc", "&Igrave;"}, // \u00cc - uppercase I, grave accent
        {"\u00cd", "&Iacute;"}, // \u00cd - uppercase I, acute accent
        {"\u00ce", "&Icirc;"}, // \u00ce - uppercase I, circumflex accent
        {"\u00cf", "&Iuml;"}, // \u00cf - uppercase I, umlaut
        {"\u00d0", "&ETH;"}, // \u00d0 - uppercase Eth, Icelandic
        {"\u00d1", "&Ntilde;"}, // \u00d1 - uppercase N, tilde
        {"\u00d2", "&Ograve;"}, // \u00d2 - uppercase O, grave accent
        {"\u00d3", "&Oacute;"}, // \u00d3 - uppercase O, acute accent
        {"\u00d4", "&Ocirc;"}, // \u00d4 - uppercase O, circumflex accent
        {"\u00d5", "&Otilde;"}, // \u00d5 - uppercase O, tilde
        {"\u00d6", "&Ouml;"}, // \u00d6 - uppercase O, umlaut
        {"\u00d7", "&times;"}, // multiplication sign
        {"\u00d8", "&Oslash;"}, // \u00d8 - uppercase O, slash
        {"\u00d9", "&Ugrave;"}, // \u00d9 - uppercase U, grave accent
        {"\u00da", "&Uacute;"}, // \u00da - uppercase U, acute accent
        {"\u00db", "&Ucirc;"}, // \u00db - uppercase U, circumflex accent
        {"\u00dc", "&Uuml;"}, // \u00dc - uppercase U, umlaut
        {"\u00dd", "&Yacute;"}, // \u00dd - uppercase Y, acute accent
        {"\u00de", "&THORN;"}, // \u00de - uppercase THORN, Icelandic
        {"\u00df", "&szlig;"}, // \u00df - lowercase sharps, German
        {"\u00e0", "&agrave;"}, // \u00e0 - lowercase a, grave accent
        {"\u00e1", "&aacute;"}, // \u00e1 - lowercase a, acute accent
        {"\u00e2", "&acirc;"}, // \u00e2 - lowercase a, circumflex accent
        {"\u00e3", "&atilde;"}, // \u00e3 - lowercase a, tilde
        {"\u00e4", "&auml;"}, // \u00e4 - lowercase a, umlaut
        {"\u00e5", "&aring;"}, // \u00e5 - lowercase a, ring
        {"\u00e6", "&aelig;"}, // \u00e6 - lowercase ae
        {"\u00e7", "&ccedil;"}, // \u00e7 - lowercase c, cedilla
        {"\u00e8", "&egrave;"}, // \u00e8 - lowercase e, grave accent
        {"\u00e9", "&eacute;"}, // \u00e9 - lowercase e, acute accent
        {"\u00ea", "&ecirc;"}, // \u00ea - lowercase e, circumflex accent
        {"\u00eb", "&euml;"}, // \u00eb - lowercase e, umlaut
        {"\u00ec", "&igrave;"}, // \u00ec - lowercase i, grave accent
        {"\u00ed", "&iacute;"}, // \u00ed - lowercase i, acute accent
        {"\u00ee", "&icirc;"}, // \u00ee - lowercase i, circumflex accent
        {"\u00ef", "&iuml;"}, // \u00ef - lowercase i, umlaut
        {"\u00f0", "&eth;"}, // \u00f0 - lowercase eth, Icelandic
        {"\u00f1", "&ntilde;"}, // \u00f1 - lowercase n, tilde
        {"\u00f2", "&ograve;"}, // \u00f2 - lowercase o, grave accent
        {"\u00f3", "&oacute;"}, // \u00f3 - lowercase o, acute accent
        {"\u00f4", "&ocirc;"}, // \u00f4 - lowercase o, circumflex accent
        {"\u00f5", "&otilde;"}, // \u00f5 - lowercase o, tilde
        {"\u00f6", "&ouml;"}, // \u00f6 - lowercase o, umlaut
        {"\u00f7", "&divide;"}, // division sign
        {"\u00f8", "&oslash;"}, // \u00f8 - lowercase o, slash
        {"\u00f9", "&ugrave;"}, // \u00f9 - lowercase u, grave accent
        {"\u00fa", "&uacute;"}, // \u00fa - lowercase u, acute accent
        {"\u00fb", "&ucirc;"}, // \u00fb - lowercase u, circumflex accent
        {"\u00fc", "&uuml;"}, // \u00fc - lowercase u, umlaut
        {"\u00fd", "&yacute;"}, // \u00fd - lowercase y, acute accent
        {"\u00fe", "&thorn;"}, // \u00fe - lowercase thorn, Icelandic
        {"\u00ff", "&yuml;"}, // \u00ff - lowercase y, umlaut
    };

    /**
     * Reverse of {@link #ISO8859_1_ESCAPE()} for unescaping purposes.
     * @return the mapping table
     */
    public static String[][] ISO8859_1_UNESCAPE() {try{__CLR4_1_2d1td1tl3lqxsq5.R.inc(16915); __CLR4_1_2d1td1tl3lqxsq5.R.inc(16916);return ISO8859_1_UNESCAPE.clone(); }finally{__CLR4_1_2d1td1tl3lqxsq5.R.flushNeeded();}}
    private static final String[][] ISO8859_1_UNESCAPE = invert(ISO8859_1_ESCAPE);

    /**
     * Mapping to escape additional <a href="http://www.w3.org/TR/REC-html40/sgml/entities.html">character entity
     * references</a>. Note that this must be used with {@link #ISO8859_1_ESCAPE()} to get the full list of
     * HTML 4.0 character entities.
     * @return the mapping table
     */
    public static String[][] HTML40_EXTENDED_ESCAPE() {try{__CLR4_1_2d1td1tl3lqxsq5.R.inc(16917); __CLR4_1_2d1td1tl3lqxsq5.R.inc(16918);return HTML40_EXTENDED_ESCAPE.clone(); }finally{__CLR4_1_2d1td1tl3lqxsq5.R.flushNeeded();}}
    private static final String[][] HTML40_EXTENDED_ESCAPE = {
        // <!-- Latin Extended-B -->
        {"\u0192", "&fnof;"}, // latin small f with hook = function= florin, U+0192 ISOtech -->
        // <!-- Greek -->
        {"\u0391", "&Alpha;"}, // greek capital letter alpha, U+0391 -->
        {"\u0392", "&Beta;"}, // greek capital letter beta, U+0392 -->
        {"\u0393", "&Gamma;"}, // greek capital letter gamma,U+0393 ISOgrk3 -->
        {"\u0394", "&Delta;"}, // greek capital letter delta,U+0394 ISOgrk3 -->
        {"\u0395", "&Epsilon;"}, // greek capital letter epsilon, U+0395 -->
        {"\u0396", "&Zeta;"}, // greek capital letter zeta, U+0396 -->
        {"\u0397", "&Eta;"}, // greek capital letter eta, U+0397 -->
        {"\u0398", "&Theta;"}, // greek capital letter theta,U+0398 ISOgrk3 -->
        {"\u0399", "&Iota;"}, // greek capital letter iota, U+0399 -->
        {"\u039a", "&Kappa;"}, // greek capital letter kappa, U+039A -->
        {"\u039b", "&Lambda;"}, // greek capital letter lambda,U+039B ISOgrk3 -->
        {"\u039c", "&Mu;"}, // greek capital letter mu, U+039C -->
        {"\u039d", "&Nu;"}, // greek capital letter nu, U+039D -->
        {"\u039e", "&Xi;"}, // greek capital letter xi, U+039E ISOgrk3 -->
        {"\u039f", "&Omicron;"}, // greek capital letter omicron, U+039F -->
        {"\u03a0", "&Pi;"}, // greek capital letter pi, U+03A0 ISOgrk3 -->
        {"\u03a1", "&Rho;"}, // greek capital letter rho, U+03A1 -->
        // <!-- there is no Sigmaf, and no U+03A2 character either -->
        {"\u03a3", "&Sigma;"}, // greek capital letter sigma,U+03A3 ISOgrk3 -->
        {"\u03a4", "&Tau;"}, // greek capital letter tau, U+03A4 -->
        {"\u03a5", "&Upsilon;"}, // greek capital letter upsilon,U+03A5 ISOgrk3 -->
        {"\u03a6", "&Phi;"}, // greek capital letter phi,U+03A6 ISOgrk3 -->
        {"\u03a7", "&Chi;"}, // greek capital letter chi, U+03A7 -->
        {"\u03a8", "&Psi;"}, // greek capital letter psi,U+03A8 ISOgrk3 -->
        {"\u03a9", "&Omega;"}, // greek capital letter omega,U+03A9 ISOgrk3 -->
        {"\u03b1", "&alpha;"}, // greek small letter alpha,U+03B1 ISOgrk3 -->
        {"\u03b2", "&beta;"}, // greek small letter beta, U+03B2 ISOgrk3 -->
        {"\u03b3", "&gamma;"}, // greek small letter gamma,U+03B3 ISOgrk3 -->
        {"\u03b4", "&delta;"}, // greek small letter delta,U+03B4 ISOgrk3 -->
        {"\u03b5", "&epsilon;"}, // greek small letter epsilon,U+03B5 ISOgrk3 -->
        {"\u03b6", "&zeta;"}, // greek small letter zeta, U+03B6 ISOgrk3 -->
        {"\u03b7", "&eta;"}, // greek small letter eta, U+03B7 ISOgrk3 -->
        {"\u03b8", "&theta;"}, // greek small letter theta,U+03B8 ISOgrk3 -->
        {"\u03b9", "&iota;"}, // greek small letter iota, U+03B9 ISOgrk3 -->
        {"\u03ba", "&kappa;"}, // greek small letter kappa,U+03BA ISOgrk3 -->
        {"\u03bb", "&lambda;"}, // greek small letter lambda,U+03BB ISOgrk3 -->
        {"\u03bc", "&mu;"}, // greek small letter mu, U+03BC ISOgrk3 -->
        {"\u03bd", "&nu;"}, // greek small letter nu, U+03BD ISOgrk3 -->
        {"\u03be", "&xi;"}, // greek small letter xi, U+03BE ISOgrk3 -->
        {"\u03bf", "&omicron;"}, // greek small letter omicron, U+03BF NEW -->
        {"\u03c0", "&pi;"}, // greek small letter pi, U+03C0 ISOgrk3 -->
        {"\u03c1", "&rho;"}, // greek small letter rho, U+03C1 ISOgrk3 -->
        {"\u03c2", "&sigmaf;"}, // greek small letter final sigma,U+03C2 ISOgrk3 -->
        {"\u03c3", "&sigma;"}, // greek small letter sigma,U+03C3 ISOgrk3 -->
        {"\u03c4", "&tau;"}, // greek small letter tau, U+03C4 ISOgrk3 -->
        {"\u03c5", "&upsilon;"}, // greek small letter upsilon,U+03C5 ISOgrk3 -->
        {"\u03c6", "&phi;"}, // greek small letter phi, U+03C6 ISOgrk3 -->
        {"\u03c7", "&chi;"}, // greek small letter chi, U+03C7 ISOgrk3 -->
        {"\u03c8", "&psi;"}, // greek small letter psi, U+03C8 ISOgrk3 -->
        {"\u03c9", "&omega;"}, // greek small letter omega,U+03C9 ISOgrk3 -->
        {"\u03d1", "&thetasym;"}, // greek small letter theta symbol,U+03D1 NEW -->
        {"\u03d2", "&upsih;"}, // greek upsilon with hook symbol,U+03D2 NEW -->
        {"\u03d6", "&piv;"}, // greek pi symbol, U+03D6 ISOgrk3 -->
        // <!-- General Punctuation -->
        {"\u2022", "&bull;"}, // bullet = black small circle,U+2022 ISOpub -->
        // <!-- bullet is NOT the same as bullet operator, U+2219 -->
        {"\u2026", "&hellip;"}, // horizontal ellipsis = three dot leader,U+2026 ISOpub -->
        {"\u2032", "&prime;"}, // prime = minutes = feet, U+2032 ISOtech -->
        {"\u2033", "&Prime;"}, // double prime = seconds = inches,U+2033 ISOtech -->
        {"\u203e", "&oline;"}, // overline = spacing overscore,U+203E NEW -->
        {"\u2044", "&frasl;"}, // fraction slash, U+2044 NEW -->
        // <!-- Letterlike Symbols -->
        {"\u2118", "&weierp;"}, // script capital P = power set= Weierstrass p, U+2118 ISOamso -->
        {"\u2111", "&image;"}, // blackletter capital I = imaginary part,U+2111 ISOamso -->
        {"\u211c", "&real;"}, // blackletter capital R = real part symbol,U+211C ISOamso -->
        {"\u2122", "&trade;"}, // trade mark sign, U+2122 ISOnum -->
        {"\u2135", "&alefsym;"}, // alef symbol = first transfinite cardinal,U+2135 NEW -->
        // <!-- alef symbol is NOT the same as hebrew letter alef,U+05D0 although the
        // same glyph could be used to depict both characters -->
        // <!-- Arrows -->
        {"\u2190", "&larr;"}, // leftwards arrow, U+2190 ISOnum -->
        {"\u2191", "&uarr;"}, // upwards arrow, U+2191 ISOnum-->
        {"\u2192", "&rarr;"}, // rightwards arrow, U+2192 ISOnum -->
        {"\u2193", "&darr;"}, // downwards arrow, U+2193 ISOnum -->
        {"\u2194", "&harr;"}, // left right arrow, U+2194 ISOamsa -->
        {"\u21b5", "&crarr;"}, // downwards arrow with corner leftwards= carriage return, U+21B5 NEW -->
        {"\u21d0", "&lArr;"}, // leftwards double arrow, U+21D0 ISOtech -->
        // <!-- ISO 10646 does not say that lArr is the same as the 'is implied by'
        // arrow but also does not have any other character for that function.
        // So ? lArr canbe used for 'is implied by' as ISOtech suggests -->
        {"\u21d1", "&uArr;"}, // upwards double arrow, U+21D1 ISOamsa -->
        {"\u21d2", "&rArr;"}, // rightwards double arrow,U+21D2 ISOtech -->
        // <!-- ISO 10646 does not say this is the 'implies' character but does not
        // have another character with this function so ?rArr can be used for
        // 'implies' as ISOtech suggests -->
        {"\u21d3", "&dArr;"}, // downwards double arrow, U+21D3 ISOamsa -->
        {"\u21d4", "&hArr;"}, // left right double arrow,U+21D4 ISOamsa -->
        // <!-- Mathematical Operators -->
        {"\u2200", "&forall;"}, // for all, U+2200 ISOtech -->
        {"\u2202", "&part;"}, // partial differential, U+2202 ISOtech -->
        {"\u2203", "&exist;"}, // there exists, U+2203 ISOtech -->
        {"\u2205", "&empty;"}, // empty set = null set = diameter,U+2205 ISOamso -->
        {"\u2207", "&nabla;"}, // nabla = backward difference,U+2207 ISOtech -->
        {"\u2208", "&isin;"}, // element of, U+2208 ISOtech -->
        {"\u2209", "&notin;"}, // not an element of, U+2209 ISOtech -->
        {"\u220b", "&ni;"}, // contains as member, U+220B ISOtech -->
        // <!-- should there be a more memorable name than 'ni'? -->
        {"\u220f", "&prod;"}, // n-ary product = product sign,U+220F ISOamsb -->
        // <!-- prod is NOT the same character as U+03A0 'greek capital letter pi'
        // though the same glyph might be used for both -->
        {"\u2211", "&sum;"}, // n-ary summation, U+2211 ISOamsb -->
        // <!-- sum is NOT the same character as U+03A3 'greek capital letter sigma'
        // though the same glyph might be used for both -->
        {"\u2212", "&minus;"}, // minus sign, U+2212 ISOtech -->
        {"\u2217", "&lowast;"}, // asterisk operator, U+2217 ISOtech -->
        {"\u221a", "&radic;"}, // square root = radical sign,U+221A ISOtech -->
        {"\u221d", "&prop;"}, // proportional to, U+221D ISOtech -->
        {"\u221e", "&infin;"}, // infinity, U+221E ISOtech -->
        {"\u2220", "&ang;"}, // angle, U+2220 ISOamso -->
        {"\u2227", "&and;"}, // logical and = wedge, U+2227 ISOtech -->
        {"\u2228", "&or;"}, // logical or = vee, U+2228 ISOtech -->
        {"\u2229", "&cap;"}, // intersection = cap, U+2229 ISOtech -->
        {"\u222a", "&cup;"}, // union = cup, U+222A ISOtech -->
        {"\u222b", "&int;"}, // integral, U+222B ISOtech -->
        {"\u2234", "&there4;"}, // therefore, U+2234 ISOtech -->
        {"\u223c", "&sim;"}, // tilde operator = varies with = similar to,U+223C ISOtech -->
        // <!-- tilde operator is NOT the same character as the tilde, U+007E,although
        // the same glyph might be used to represent both -->
        {"\u2245", "&cong;"}, // approximately equal to, U+2245 ISOtech -->
        {"\u2248", "&asymp;"}, // almost equal to = asymptotic to,U+2248 ISOamsr -->
        {"\u2260", "&ne;"}, // not equal to, U+2260 ISOtech -->
        {"\u2261", "&equiv;"}, // identical to, U+2261 ISOtech -->
        {"\u2264", "&le;"}, // less-than or equal to, U+2264 ISOtech -->
        {"\u2265", "&ge;"}, // greater-than or equal to,U+2265 ISOtech -->
        {"\u2282", "&sub;"}, // subset of, U+2282 ISOtech -->
        {"\u2283", "&sup;"}, // superset of, U+2283 ISOtech -->
        // <!-- note that nsup, 'not a superset of, U+2283' is not covered by the
        // Symbol font encoding and is not included. Should it be, for symmetry?
        // It is in ISOamsn --> <!ENTITY nsub", "8836"},
        // not a subset of, U+2284 ISOamsn -->
        {"\u2286", "&sube;"}, // subset of or equal to, U+2286 ISOtech -->
        {"\u2287", "&supe;"}, // superset of or equal to,U+2287 ISOtech -->
        {"\u2295", "&oplus;"}, // circled plus = direct sum,U+2295 ISOamsb -->
        {"\u2297", "&otimes;"}, // circled times = vector product,U+2297 ISOamsb -->
        {"\u22a5", "&perp;"}, // up tack = orthogonal to = perpendicular,U+22A5 ISOtech -->
        {"\u22c5", "&sdot;"}, // dot operator, U+22C5 ISOamsb -->
        // <!-- dot operator is NOT the same character as U+00B7 middle dot -->
        // <!-- Miscellaneous Technical -->
        {"\u2308", "&lceil;"}, // left ceiling = apl upstile,U+2308 ISOamsc -->
        {"\u2309", "&rceil;"}, // right ceiling, U+2309 ISOamsc -->
        {"\u230a", "&lfloor;"}, // left floor = apl downstile,U+230A ISOamsc -->
        {"\u230b", "&rfloor;"}, // right floor, U+230B ISOamsc -->
        {"\u2329", "&lang;"}, // left-pointing angle bracket = bra,U+2329 ISOtech -->
        // <!-- lang is NOT the same character as U+003C 'less than' or U+2039 'single left-pointing angle quotation
        // mark' -->
        {"\u232a", "&rang;"}, // right-pointing angle bracket = ket,U+232A ISOtech -->
        // <!-- rang is NOT the same character as U+003E 'greater than' or U+203A
        // 'single right-pointing angle quotation mark' -->
        // <!-- Geometric Shapes -->
        {"\u25ca", "&loz;"}, // lozenge, U+25CA ISOpub -->
        // <!-- Miscellaneous Symbols -->
        {"\u2660", "&spades;"}, // black spade suit, U+2660 ISOpub -->
        // <!-- black here seems to mean filled as opposed to hollow -->
        {"\u2663", "&clubs;"}, // black club suit = shamrock,U+2663 ISOpub -->
        {"\u2665", "&hearts;"}, // black heart suit = valentine,U+2665 ISOpub -->
        {"\u2666", "&diams;"}, // black diamond suit, U+2666 ISOpub -->

        // <!-- Latin Extended-A -->
        {"\u0152", "&OElig;"}, // -- latin capital ligature OE,U+0152 ISOlat2 -->
        {"\u0153", "&oelig;"}, // -- latin small ligature oe, U+0153 ISOlat2 -->
        // <!-- ligature is a misnomer, this is a separate character in some languages -->
        {"\u0160", "&Scaron;"}, // -- latin capital letter S with caron,U+0160 ISOlat2 -->
        {"\u0161", "&scaron;"}, // -- latin small letter s with caron,U+0161 ISOlat2 -->
        {"\u0178", "&Yuml;"}, // -- latin capital letter Y with diaeresis,U+0178 ISOlat2 -->
        // <!-- Spacing Modifier Letters -->
        {"\u02c6", "&circ;"}, // -- modifier letter circumflex accent,U+02C6 ISOpub -->
        {"\u02dc", "&tilde;"}, // small tilde, U+02DC ISOdia -->
        // <!-- General Punctuation -->
        {"\u2002", "&ensp;"}, // en space, U+2002 ISOpub -->
        {"\u2003", "&emsp;"}, // em space, U+2003 ISOpub -->
        {"\u2009", "&thinsp;"}, // thin space, U+2009 ISOpub -->
        {"\u200c", "&zwnj;"}, // zero width non-joiner,U+200C NEW RFC 2070 -->
        {"\u200d", "&zwj;"}, // zero width joiner, U+200D NEW RFC 2070 -->
        {"\u200e", "&lrm;"}, // left-to-right mark, U+200E NEW RFC 2070 -->
        {"\u200f", "&rlm;"}, // right-to-left mark, U+200F NEW RFC 2070 -->
        {"\u2013", "&ndash;"}, // en dash, U+2013 ISOpub -->
        {"\u2014", "&mdash;"}, // em dash, U+2014 ISOpub -->
        {"\u2018", "&lsquo;"}, // left single quotation mark,U+2018 ISOnum -->
        {"\u2019", "&rsquo;"}, // right single quotation mark,U+2019 ISOnum -->
        {"\u201a", "&sbquo;"}, // single low-9 quotation mark, U+201A NEW -->
        {"\u201c", "&ldquo;"}, // left double quotation mark,U+201C ISOnum -->
        {"\u201d", "&rdquo;"}, // right double quotation mark,U+201D ISOnum -->
        {"\u201e", "&bdquo;"}, // double low-9 quotation mark, U+201E NEW -->
        {"\u2020", "&dagger;"}, // dagger, U+2020 ISOpub -->
        {"\u2021", "&Dagger;"}, // double dagger, U+2021 ISOpub -->
        {"\u2030", "&permil;"}, // per mille sign, U+2030 ISOtech -->
        {"\u2039", "&lsaquo;"}, // single left-pointing angle quotation mark,U+2039 ISO proposed -->
        // <!-- lsaquo is proposed but not yet ISO standardized -->
        {"\u203a", "&rsaquo;"}, // single right-pointing angle quotation mark,U+203A ISO proposed -->
        // <!-- rsaquo is proposed but not yet ISO standardized -->
        {"\u20ac", "&euro;"}, // -- euro sign, U+20AC NEW -->
    };

    /**
     * Reverse of {@link #HTML40_EXTENDED_ESCAPE()} for unescaping purposes.
     * @return the mapping table
     */
    public static String[][] HTML40_EXTENDED_UNESCAPE() {try{__CLR4_1_2d1td1tl3lqxsq5.R.inc(16919); __CLR4_1_2d1td1tl3lqxsq5.R.inc(16920);return HTML40_EXTENDED_UNESCAPE.clone(); }finally{__CLR4_1_2d1td1tl3lqxsq5.R.flushNeeded();}}
    private static final String[][] HTML40_EXTENDED_UNESCAPE = invert(HTML40_EXTENDED_ESCAPE);

    /**
     * Mapping to escape the basic XML and HTML character entities.
     *
     * Namely: {@code " & < >}
     * @return the mapping table
     */
    public static String[][] BASIC_ESCAPE() {try{__CLR4_1_2d1td1tl3lqxsq5.R.inc(16921); __CLR4_1_2d1td1tl3lqxsq5.R.inc(16922);return BASIC_ESCAPE.clone(); }finally{__CLR4_1_2d1td1tl3lqxsq5.R.flushNeeded();}}
    private static final String[][] BASIC_ESCAPE = {
        {"\"", "&quot;"}, // " - double-quote
        {"&", "&amp;"},   // & - ampersand
        {"<", "&lt;"},    // < - less-than
        {">", "&gt;"},    // > - greater-than
    };

    /**
     * Reverse of {@link #BASIC_ESCAPE()} for unescaping purposes.
     * @return the mapping table
     */
    public static String[][] BASIC_UNESCAPE() {try{__CLR4_1_2d1td1tl3lqxsq5.R.inc(16923); __CLR4_1_2d1td1tl3lqxsq5.R.inc(16924);return BASIC_UNESCAPE.clone(); }finally{__CLR4_1_2d1td1tl3lqxsq5.R.flushNeeded();}}
    private static final String[][] BASIC_UNESCAPE = invert(BASIC_ESCAPE);

    /**
     * Mapping to escape the apostrophe character to its XML character entity.
     * @return the mapping table
     */
    public static String[][] APOS_ESCAPE() {try{__CLR4_1_2d1td1tl3lqxsq5.R.inc(16925); __CLR4_1_2d1td1tl3lqxsq5.R.inc(16926);return APOS_ESCAPE.clone(); }finally{__CLR4_1_2d1td1tl3lqxsq5.R.flushNeeded();}}
    private static final String[][] APOS_ESCAPE = {
        {"'", "&apos;"}, // XML apostrophe
    };

    /**
     * Reverse of {@link #APOS_ESCAPE()} for unescaping purposes.
     * @return the mapping table
     */
    public static String[][] APOS_UNESCAPE() {try{__CLR4_1_2d1td1tl3lqxsq5.R.inc(16927); __CLR4_1_2d1td1tl3lqxsq5.R.inc(16928);return APOS_UNESCAPE.clone(); }finally{__CLR4_1_2d1td1tl3lqxsq5.R.flushNeeded();}}
    private static final String[][] APOS_UNESCAPE = invert(APOS_ESCAPE);

    /**
     * Mapping to escape the Java control characters.
     *
     * Namely: {@code \b \n \t \f \r}
     * @return the mapping table
     */
    public static String[][] JAVA_CTRL_CHARS_ESCAPE() {try{__CLR4_1_2d1td1tl3lqxsq5.R.inc(16929); __CLR4_1_2d1td1tl3lqxsq5.R.inc(16930);return JAVA_CTRL_CHARS_ESCAPE.clone(); }finally{__CLR4_1_2d1td1tl3lqxsq5.R.flushNeeded();}}
    private static final String[][] JAVA_CTRL_CHARS_ESCAPE = {
        {"\b", "\\b"},
        {"\n", "\\n"},
        {"\t", "\\t"},
        {"\f", "\\f"},
        {"\r", "\\r"}
    };

    /**
     * Reverse of {@link #JAVA_CTRL_CHARS_ESCAPE()} for unescaping purposes.
     * @return the mapping table
     */
    public static String[][] JAVA_CTRL_CHARS_UNESCAPE() {try{__CLR4_1_2d1td1tl3lqxsq5.R.inc(16931); __CLR4_1_2d1td1tl3lqxsq5.R.inc(16932);return JAVA_CTRL_CHARS_UNESCAPE.clone(); }finally{__CLR4_1_2d1td1tl3lqxsq5.R.flushNeeded();}}
    private static final String[][] JAVA_CTRL_CHARS_UNESCAPE = invert(JAVA_CTRL_CHARS_ESCAPE);

    /**
     * Used to invert an escape array into an unescape array
     * @param array String[][] to be inverted
     * @return String[][] inverted array
     */
    public static String[][] invert(final String[][] array) {try{__CLR4_1_2d1td1tl3lqxsq5.R.inc(16933);
        __CLR4_1_2d1td1tl3lqxsq5.R.inc(16934);final String[][] newarray = new String[array.length][2];
        __CLR4_1_2d1td1tl3lqxsq5.R.inc(16935);for(int i = 0; (((i<array.length)&&(__CLR4_1_2d1td1tl3lqxsq5.R.iget(16936)!=0|true))||(__CLR4_1_2d1td1tl3lqxsq5.R.iget(16937)==0&false)); i++) {{
            __CLR4_1_2d1td1tl3lqxsq5.R.inc(16938);newarray[i][0] = array[i][1];
            __CLR4_1_2d1td1tl3lqxsq5.R.inc(16939);newarray[i][1] = array[i][0];
        }
        }__CLR4_1_2d1td1tl3lqxsq5.R.inc(16940);return newarray;
    }finally{__CLR4_1_2d1td1tl3lqxsq5.R.flushNeeded();}}

}
