/* The following code was generated by JFlex 1.4.3 on 23.05.14 09:46 */

package de.dfki.vsm.sfsl.parser;

import java_cup.runtime.Symbol;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 23.05.14 09:46 from the specification file
 * <tt>D:/GitHub/VisualSceneMakerGit/src/de/dfki/vsm/sfsl/parser/lexxer.jflex</tt>
 */
public class _SFSLScanner_ implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\10\0\1\1\1\14\1\14\1\0\1\14\1\14\22\0\1\14\1\72"+
    "\1\15\3\1\1\70\1\1\1\12\1\13\1\5\1\4\1\77\1\6"+
    "\1\3\1\67\12\2\1\101\1\1\1\73\1\71\1\74\1\100\1\66"+
    "\1\36\1\65\1\50\1\52\1\56\1\45\1\26\1\60\1\54\2\65"+
    "\1\47\1\65\1\55\1\62\1\16\1\65\1\41\1\22\1\57\1\33"+
    "\1\61\4\65\1\10\1\1\1\11\1\0\1\65\1\0\1\20\1\34"+
    "\1\23\1\44\1\24\1\53\1\65\1\63\1\46\1\65\1\35\1\17"+
    "\1\42\1\25\1\30\1\32\1\65\1\27\1\37\1\40\1\31\1\43"+
    "\1\64\1\65\1\21\1\51\1\75\1\7\1\76\1\1\66\0\1\1"+
    "\12\0\3\1\1\0\1\1\1\0\6\1\2\0\2\1\4\0\1\1"+
    "\1\0\1\1\5\0\1\1\2\0\2\1\1\0\1\1\1\0\1\1"+
    "\1\0\6\1\2\0\2\1\4\0\1\1\1\0\1\1\4\0\2\1"+
    "\2\0\1\1\uff00\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\1"+
    "\1\7\1\10\1\11\1\12\1\13\1\1\23\14\1\15"+
    "\1\16\1\1\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\1\0\1\30\1\0\1\31\13\14"+
    "\1\32\11\14\1\33\1\34\1\35\1\36\1\37\1\40"+
    "\2\14\1\41\1\14\1\42\20\14\1\43\1\44\3\14"+
    "\1\45\3\14\1\46\15\14\1\47\1\50\2\14\1\51"+
    "\7\14\1\52\1\53\10\14\1\54\3\14\1\55\1\56"+
    "\1\14\1\57\3\14\1\60\2\14\1\61\24\14\1\62"+
    "\11\14\1\63\13\14\1\64\13\14\1\65\6\14\1\66"+
    "\2\14\1\67\5\14\1\70\1\14\1\71\1\72\7\14"+
    "\1\73\1\74";

  private static int [] zzUnpackAction() {
    int [] result = new int[240];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\102\0\204\0\102\0\102\0\102\0\102\0\306"+
    "\0\102\0\102\0\102\0\102\0\102\0\u0108\0\u014a\0\u018c"+
    "\0\u01ce\0\u0210\0\u0252\0\u0294\0\u02d6\0\u0318\0\u035a\0\u039c"+
    "\0\u03de\0\u0420\0\u0462\0\u04a4\0\u04e6\0\u0528\0\u056a\0\u05ac"+
    "\0\u05ee\0\102\0\102\0\u0630\0\u0672\0\u06b4\0\u06f6\0\u0738"+
    "\0\102\0\102\0\102\0\102\0\102\0\u077a\0\102\0\u0108"+
    "\0\102\0\u07bc\0\u07fe\0\u0840\0\u0882\0\u08c4\0\u0906\0\u0948"+
    "\0\u098a\0\u09cc\0\u0a0e\0\u0a50\0\u018c\0\u0a92\0\u0ad4\0\u0b16"+
    "\0\u0b58\0\u0b9a\0\u0bdc\0\u0c1e\0\u0c60\0\u0ca2\0\102\0\102"+
    "\0\102\0\102\0\102\0\u077a\0\u0ce4\0\u0d26\0\u018c\0\u0d68"+
    "\0\u018c\0\u0daa\0\u0dec\0\u0e2e\0\u0e70\0\u0eb2\0\u0ef4\0\u0f36"+
    "\0\u0f78\0\u0fba\0\u0ffc\0\u103e\0\u1080\0\u10c2\0\u1104\0\u1146"+
    "\0\u1188\0\u018c\0\u018c\0\u11ca\0\u120c\0\u124e\0\u018c\0\u1290"+
    "\0\u12d2\0\u1314\0\u018c\0\u1356\0\u1398\0\u13da\0\u141c\0\u145e"+
    "\0\u14a0\0\u14e2\0\u1524\0\u1566\0\u15a8\0\u15ea\0\u162c\0\u166e"+
    "\0\u018c\0\u018c\0\u16b0\0\u16f2\0\u018c\0\u1734\0\u1776\0\u17b8"+
    "\0\u17fa\0\u183c\0\u187e\0\u18c0\0\u018c\0\u1902\0\u1944\0\u1986"+
    "\0\u19c8\0\u1a0a\0\u1a4c\0\u1a8e\0\u1ad0\0\u1b12\0\u018c\0\u1b54"+
    "\0\u1b96\0\u1bd8\0\u018c\0\u018c\0\u1c1a\0\u018c\0\u1c5c\0\u1c9e"+
    "\0\u1ce0\0\u018c\0\u1d22\0\u1d64\0\u018c\0\u1da6\0\u1de8\0\u1e2a"+
    "\0\u1e6c\0\u1eae\0\u1ef0\0\u1f32\0\u1f74\0\u1fb6\0\u1ff8\0\u203a"+
    "\0\u207c\0\u20be\0\u2100\0\u2142\0\u2184\0\u21c6\0\u2208\0\u224a"+
    "\0\u228c\0\u018c\0\u22ce\0\u2310\0\u2352\0\u2394\0\u23d6\0\u2418"+
    "\0\u245a\0\u249c\0\u24de\0\u018c\0\u2520\0\u2562\0\u25a4\0\u25e6"+
    "\0\u2628\0\u266a\0\u26ac\0\u26ee\0\u2730\0\u2772\0\u27b4\0\u018c"+
    "\0\u27f6\0\u2838\0\u287a\0\u28bc\0\u28fe\0\u2940\0\u2982\0\u29c4"+
    "\0\u2a06\0\u2a48\0\u2a8a\0\u018c\0\u2acc\0\u2b0e\0\u2b50\0\u2b92"+
    "\0\u2bd4\0\u2c16\0\u018c\0\u2c58\0\u2c9a\0\u018c\0\u2cdc\0\u2d1e"+
    "\0\u2d60\0\u2da2\0\u2de4\0\u018c\0\u2e26\0\u018c\0\u018c\0\u2e68"+
    "\0\u2eaa\0\u2eec\0\u2f2e\0\u2f70\0\u2fb2\0\u2ff4\0\u018c\0\u018c";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[240];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\2\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\3\20\1\21"+
    "\2\20\1\22\1\23\4\20\1\24\2\20\1\25\1\20"+
    "\1\26\1\27\3\20\1\30\1\31\1\32\1\33\1\20"+
    "\1\34\1\35\1\31\1\20\1\36\1\37\1\40\1\41"+
    "\4\20\1\42\1\43\1\44\1\45\1\46\1\47\1\50"+
    "\1\51\1\52\1\53\1\54\1\55\104\0\1\3\1\56"+
    "\105\0\1\57\73\0\14\60\1\61\55\60\4\0\3\60"+
    "\2\0\1\20\13\0\1\20\1\62\46\20\16\0\1\20"+
    "\13\0\50\20\16\0\1\20\13\0\30\20\1\63\17\20"+
    "\16\0\1\20\13\0\6\20\1\64\4\20\1\65\34\20"+
    "\16\0\1\20\13\0\6\20\1\66\41\20\16\0\1\20"+
    "\13\0\7\20\1\67\40\20\16\0\1\20\13\0\26\20"+
    "\1\70\21\20\16\0\1\20\13\0\11\20\1\71\36\20"+
    "\16\0\1\20\13\0\2\20\1\72\3\20\1\73\41\20"+
    "\16\0\1\20\13\0\30\20\1\74\17\20\16\0\1\20"+
    "\13\0\7\20\1\75\27\20\1\75\10\20\16\0\1\20"+
    "\13\0\2\20\1\76\45\20\16\0\1\20\13\0\1\20"+
    "\1\77\10\20\1\100\35\20\16\0\1\20\13\0\6\20"+
    "\1\101\41\20\16\0\1\20\13\0\2\20\1\102\45\20"+
    "\16\0\1\20\13\0\24\20\1\103\23\20\16\0\1\20"+
    "\13\0\30\20\1\104\17\20\16\0\1\20\13\0\30\20"+
    "\1\105\17\20\16\0\1\20\13\0\2\20\1\106\45\20"+
    "\104\0\1\107\102\0\1\110\101\0\1\111\101\0\1\112"+
    "\101\0\1\113\12\0\1\114\101\0\1\20\13\0\2\20"+
    "\1\115\45\20\16\0\1\20\13\0\33\20\1\116\14\20"+
    "\16\0\1\20\13\0\46\20\1\117\1\20\16\0\1\20"+
    "\13\0\1\20\1\120\46\20\16\0\1\20\13\0\22\20"+
    "\1\121\25\20\16\0\1\20\13\0\16\20\1\122\31\20"+
    "\16\0\1\20\13\0\26\20\1\123\21\20\16\0\1\20"+
    "\13\0\13\20\1\124\34\20\16\0\1\20\13\0\7\20"+
    "\1\125\40\20\16\0\1\20\13\0\24\20\1\126\23\20"+
    "\16\0\1\20\13\0\11\20\1\127\36\20\16\0\1\20"+
    "\13\0\21\20\1\130\26\20\16\0\1\20\13\0\6\20"+
    "\1\131\41\20\16\0\1\20\13\0\7\20\1\132\40\20"+
    "\16\0\1\20\13\0\35\20\1\133\12\20\16\0\1\20"+
    "\13\0\1\20\1\134\46\20\16\0\1\20\13\0\14\20"+
    "\1\135\33\20\16\0\1\20\13\0\24\20\1\136\23\20"+
    "\16\0\1\20\13\0\21\20\1\137\26\20\16\0\1\20"+
    "\13\0\1\20\1\140\46\20\16\0\1\20\13\0\3\20"+
    "\1\141\44\20\16\0\1\20\13\0\6\20\1\142\41\20"+
    "\16\0\1\20\13\0\1\20\1\143\46\20\16\0\1\20"+
    "\13\0\1\20\1\144\46\20\16\0\1\20\13\0\27\20"+
    "\1\145\1\20\1\146\16\20\16\0\1\20\13\0\6\20"+
    "\1\147\41\20\16\0\1\20\13\0\26\20\1\150\21\20"+
    "\16\0\1\20\13\0\12\20\1\151\35\20\16\0\1\20"+
    "\13\0\21\20\1\152\26\20\16\0\1\20\13\0\22\20"+
    "\1\153\25\20\16\0\1\20\13\0\2\20\1\154\45\20"+
    "\16\0\1\20\13\0\22\20\1\155\25\20\16\0\1\20"+
    "\13\0\2\20\1\156\45\20\16\0\1\20\13\0\21\20"+
    "\1\124\26\20\16\0\1\20\13\0\22\20\1\157\25\20"+
    "\16\0\1\20\13\0\6\20\1\160\41\20\16\0\1\20"+
    "\13\0\22\20\1\161\25\20\16\0\1\20\13\0\13\20"+
    "\1\162\34\20\16\0\1\20\13\0\4\20\1\163\43\20"+
    "\16\0\1\20\13\0\12\20\1\164\35\20\16\0\1\20"+
    "\13\0\30\20\1\165\17\20\16\0\1\20\13\0\2\20"+
    "\1\166\45\20\16\0\1\20\13\0\12\20\1\167\35\20"+
    "\16\0\1\20\13\0\25\20\1\170\22\20\16\0\1\20"+
    "\13\0\22\20\1\171\25\20\16\0\1\20\13\0\11\20"+
    "\1\172\36\20\16\0\1\20\13\0\2\20\1\173\45\20"+
    "\16\0\1\20\13\0\13\20\1\174\34\20\16\0\1\20"+
    "\13\0\3\20\1\175\44\20\16\0\1\20\13\0\12\20"+
    "\1\176\35\20\16\0\1\20\13\0\12\20\1\177\35\20"+
    "\16\0\1\20\13\0\6\20\1\200\41\20\16\0\1\20"+
    "\13\0\5\20\1\201\42\20\16\0\1\20\13\0\5\20"+
    "\1\202\42\20\16\0\1\20\13\0\11\20\1\203\36\20"+
    "\16\0\1\20\13\0\21\20\1\204\26\20\16\0\1\20"+
    "\13\0\24\20\1\205\23\20\16\0\1\20\13\0\6\20"+
    "\1\206\41\20\16\0\1\20\13\0\30\20\1\207\17\20"+
    "\16\0\1\20\13\0\1\20\1\210\46\20\16\0\1\20"+
    "\13\0\13\20\1\211\34\20\16\0\1\20\13\0\11\20"+
    "\1\212\36\20\16\0\1\20\13\0\44\20\1\213\3\20"+
    "\16\0\1\20\13\0\6\20\1\214\41\20\16\0\1\20"+
    "\13\0\17\20\1\215\30\20\16\0\1\20\13\0\21\20"+
    "\1\216\26\20\16\0\1\20\13\0\22\20\1\217\25\20"+
    "\16\0\1\20\13\0\27\20\1\220\1\20\1\221\16\20"+
    "\16\0\1\20\13\0\7\20\1\222\40\20\16\0\1\20"+
    "\13\0\22\20\1\223\25\20\16\0\1\20\13\0\22\20"+
    "\1\224\25\20\16\0\1\20\13\0\3\20\1\225\44\20"+
    "\16\0\1\20\13\0\35\20\1\226\12\20\16\0\1\20"+
    "\13\0\7\20\1\227\40\20\16\0\1\20\13\0\4\20"+
    "\1\230\13\20\1\231\27\20\16\0\1\20\13\0\22\20"+
    "\1\232\25\20\16\0\1\20\13\0\30\20\1\233\17\20"+
    "\16\0\1\20\13\0\2\20\1\234\45\20\16\0\1\20"+
    "\13\0\21\20\1\235\26\20\16\0\1\20\13\0\4\20"+
    "\1\236\16\20\1\237\6\20\1\240\1\20\1\241\6\20"+
    "\1\242\4\20\16\0\1\20\13\0\6\20\1\243\41\20"+
    "\16\0\1\20\13\0\5\20\1\244\42\20\16\0\1\20"+
    "\13\0\1\20\1\245\46\20\16\0\1\20\13\0\11\20"+
    "\1\246\36\20\16\0\1\20\13\0\21\20\1\247\26\20"+
    "\16\0\1\20\13\0\6\20\1\250\41\20\16\0\1\20"+
    "\13\0\13\20\1\251\34\20\16\0\1\20\13\0\1\20"+
    "\1\252\10\20\1\253\35\20\16\0\1\20\13\0\6\20"+
    "\1\254\41\20\16\0\1\20\13\0\2\20\1\255\45\20"+
    "\16\0\1\20\13\0\10\20\1\256\37\20\16\0\1\20"+
    "\13\0\6\20\1\257\41\20\16\0\1\20\13\0\1\20"+
    "\1\260\46\20\16\0\1\20\13\0\21\20\1\261\26\20"+
    "\16\0\1\20\13\0\22\20\1\262\25\20\16\0\1\20"+
    "\13\0\22\20\1\263\25\20\16\0\1\20\13\0\7\20"+
    "\1\264\40\20\16\0\1\20\13\0\6\20\1\265\41\20"+
    "\16\0\1\20\13\0\7\20\1\266\40\20\16\0\1\20"+
    "\13\0\6\20\1\267\41\20\16\0\1\20\13\0\1\20"+
    "\1\270\46\20\16\0\1\20\13\0\11\20\1\271\36\20"+
    "\16\0\1\20\13\0\7\20\1\272\40\20\16\0\1\20"+
    "\13\0\4\20\1\273\43\20\16\0\1\20\13\0\22\20"+
    "\1\274\25\20\16\0\1\20\13\0\34\20\1\275\13\20"+
    "\16\0\1\20\13\0\41\20\1\276\6\20\16\0\1\20"+
    "\13\0\2\20\1\277\45\20\16\0\1\20\13\0\22\20"+
    "\1\300\25\20\16\0\1\20\13\0\14\20\1\301\33\20"+
    "\16\0\1\20\13\0\13\20\1\302\34\20\16\0\1\20"+
    "\13\0\12\20\1\303\35\20\16\0\1\20\13\0\6\20"+
    "\1\304\41\20\16\0\1\20\13\0\5\20\1\305\42\20"+
    "\16\0\1\20\13\0\6\20\1\306\41\20\16\0\1\20"+
    "\13\0\30\20\1\307\17\20\16\0\1\20\13\0\11\20"+
    "\1\310\36\20\16\0\1\20\13\0\2\20\1\311\45\20"+
    "\16\0\1\20\13\0\32\20\1\312\15\20\16\0\1\20"+
    "\13\0\6\20\1\313\41\20\16\0\1\20\13\0\13\20"+
    "\1\314\34\20\16\0\1\20\13\0\10\20\1\315\37\20"+
    "\16\0\1\20\13\0\6\20\1\316\41\20\16\0\1\20"+
    "\13\0\14\20\1\317\33\20\16\0\1\20\13\0\24\20"+
    "\1\320\23\20\16\0\1\20\13\0\30\20\1\321\17\20"+
    "\16\0\1\20\13\0\1\20\1\322\46\20\16\0\1\20"+
    "\13\0\44\20\1\323\3\20\16\0\1\20\13\0\14\20"+
    "\1\324\33\20\16\0\1\20\13\0\11\20\1\325\36\20"+
    "\16\0\1\20\13\0\7\20\1\326\40\20\16\0\1\20"+
    "\13\0\22\20\1\327\25\20\16\0\1\20\13\0\6\20"+
    "\1\330\41\20\16\0\1\20\13\0\7\20\1\331\40\20"+
    "\16\0\1\20\13\0\6\20\1\332\41\20\16\0\1\20"+
    "\13\0\35\20\1\333\12\20\16\0\1\20\13\0\12\20"+
    "\1\334\35\20\16\0\1\20\13\0\6\20\1\335\41\20"+
    "\16\0\1\20\13\0\45\20\1\336\2\20\16\0\1\20"+
    "\13\0\44\20\1\337\3\20\16\0\1\20\13\0\21\20"+
    "\1\340\26\20\16\0\1\20\13\0\2\20\1\341\45\20"+
    "\16\0\1\20\13\0\13\20\1\342\34\20\16\0\1\20"+
    "\13\0\10\20\1\343\37\20\16\0\1\20\13\0\35\20"+
    "\1\344\12\20\16\0\1\20\13\0\4\20\1\345\43\20"+
    "\16\0\1\20\13\0\11\20\1\346\36\20\16\0\1\20"+
    "\13\0\14\20\1\347\33\20\16\0\1\20\13\0\11\20"+
    "\1\350\36\20\16\0\1\20\13\0\22\20\1\351\25\20"+
    "\16\0\1\20\13\0\12\20\1\352\35\20\16\0\1\20"+
    "\13\0\2\20\1\353\45\20\16\0\1\20\13\0\13\20"+
    "\1\354\34\20\16\0\1\20\13\0\22\20\1\355\25\20"+
    "\16\0\1\20\13\0\14\20\1\356\33\20\16\0\1\20"+
    "\13\0\6\20\1\357\41\20\16\0\1\20\13\0\21\20"+
    "\1\360\26\20\14\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[12342];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\4\11\1\1\5\11\24\1\2\11"+
    "\5\1\5\11\1\0\1\11\1\0\1\11\25\1\5\11"+
    "\245\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[240];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _SFSLScanner_(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public _SFSLScanner_(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 246) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 42: 
          { return new Symbol(_SFSLToken_.RANDOM);
          }
        case 61: break;
        case 37: 
          { return new Symbol(_SFSLToken_.BOOLEAN, new java.lang.Boolean(yytext()));
          }
        case 62: break;
        case 36: 
          { return new Symbol(_SFSLToken_.NULL);
          }
        case 63: break;
        case 32: 
          { return new Symbol(_SFSLToken_.FLOAT, new java.lang.Float(yytext()));
          }
        case 64: break;
        case 44: 
          { return new Symbol(_SFSLToken_.ADDLAST);
          }
        case 65: break;
        case 54: 
          { return new Symbol(_SFSLToken_.HISTORYVALUEOF);
          }
        case 66: break;
        case 31: 
          { return new Symbol(_SFSLToken_.GREATEREQUAL);
          }
        case 67: break;
        case 24: 
          { return new Symbol(_SFSLToken_.OR);
          }
        case 68: break;
        case 26: 
          { return new Symbol(_SFSLToken_.IN);
          }
        case 69: break;
        case 5: 
          { return new Symbol(_SFSLToken_.TIMES);
          }
        case 70: break;
        case 23: 
          { return new Symbol(_SFSLToken_.COLON);
          }
        case 71: break;
        case 56: 
          { return new Symbol(_SFSLToken_.HISTORYRUNTIMEOF);
          }
        case 72: break;
        case 13: 
          { return new Symbol(_SFSLToken_.AT);
          }
        case 73: break;
        case 11: 
          { /* ignore white space. */
          }
        case 74: break;
        case 8: 
          { return new Symbol(_SFSLToken_.RBRACK);
          }
        case 75: break;
        case 55: 
          { return new Symbol(_SFSLToken_.HISTORYSETDEPTH);
          }
        case 76: break;
        case 28: 
          { return new Symbol(_SFSLToken_.EQUALEQUAL);
          }
        case 77: break;
        case 15: 
          { return new Symbol(_SFSLToken_.EQUAL);
          }
        case 78: break;
        case 49: 
          { return new Symbol(_SFSLToken_.CONTAINS);
          }
        case 79: break;
        case 10: 
          { return new Symbol(_SFSLToken_.RPAREN);
          }
        case 80: break;
        case 33: 
          { return new Symbol(_SFSLToken_.NEW);
          }
        case 81: break;
        case 43: 
          { return new Symbol(_SFSLToken_.REMOVE);
          }
        case 82: break;
        case 53: 
          { return new Symbol(_SFSLToken_.PSG);
          }
        case 83: break;
        case 40: 
          { return new Symbol(_SFSLToken_.CLEAR);
          }
        case 84: break;
        case 18: 
          { return new Symbol(_SFSLToken_.GREATER);
          }
        case 85: break;
        case 47: 
          { return new Symbol(_SFSLToken_.VALUEOF);
          }
        case 86: break;
        case 2: 
          { return new Symbol(_SFSLToken_.INTEGER, new java.lang.Integer(yytext()));
          }
        case 87: break;
        case 59: 
          { return new Symbol(_SFSLToken_.HISTORYCONTAINSSTATE);
          }
        case 88: break;
        case 39: 
          { return new Symbol(_SFSLToken_.FIRST);
          }
        case 89: break;
        case 29: 
          { return new Symbol(_SFSLToken_.NOTEQUAL);
          }
        case 90: break;
        case 4: 
          { return new Symbol(_SFSLToken_.PLUS);
          }
        case 91: break;
        case 38: 
          { return new Symbol(_SFSLToken_.LAST);
          }
        case 92: break;
        case 45: 
          { return new Symbol(_SFSLToken_.DEFAULT);
          }
        case 93: break;
        case 19: 
          { return new Symbol(_SFSLToken_.LBRACE);
          }
        case 94: break;
        case 17: 
          { return new Symbol(_SFSLToken_.LESS);
          }
        case 95: break;
        case 6: 
          { return new Symbol(_SFSLToken_.MINUS);
          }
        case 96: break;
        case 50: 
          { return new Symbol(_SFSLToken_.REMOVELAST);
          }
        case 97: break;
        case 35: 
          { return new Symbol(_SFSLToken_.SIZE);
          }
        case 98: break;
        case 3: 
          { return new Symbol(_SFSLToken_.DOT);
          }
        case 99: break;
        case 34: 
          { return new Symbol(_SFSLToken_.GET);
          }
        case 100: break;
        case 52: 
          { return new Symbol(_SFSLToken_.HISTORYCLEAR);
          }
        case 101: break;
        case 51: 
          { return new Symbol(_SFSLToken_.REMOVEFIRST);
          }
        case 102: break;
        case 60: 
          { return new Symbol(_SFSLToken_.UASG);
          }
        case 103: break;
        case 21: 
          { return new Symbol(_SFSLToken_.COMMA);
          }
        case 104: break;
        case 25: 
          { return new Symbol(_SFSLToken_.STRING, new java.lang.String(yytext()));
          }
        case 105: break;
        case 30: 
          { return new Symbol(_SFSLToken_.LESSEQUAL);
          }
        case 106: break;
        case 16: 
          { return new Symbol(_SFSLToken_.NOT);
          }
        case 107: break;
        case 27: 
          { return new Symbol(_SFSLToken_.AND);
          }
        case 108: break;
        case 7: 
          { return new Symbol(_SFSLToken_.LBRACK);
          }
        case 109: break;
        case 14: 
          { return new Symbol(_SFSLToken_.DIV);
          }
        case 110: break;
        case 9: 
          { return new Symbol(_SFSLToken_.LPAREN);
          }
        case 111: break;
        case 1: 
          { System.err.println("Illegal character: "+yytext());
          }
        case 112: break;
        case 41: 
          { return new Symbol(_SFSLToken_.EMPTY);
          }
        case 113: break;
        case 22: 
          { return new Symbol(_SFSLToken_.QUESTION);
          }
        case 114: break;
        case 20: 
          { return new Symbol(_SFSLToken_.RBRACE);
          }
        case 115: break;
        case 48: 
          { return new Symbol(_SFSLToken_.ADDFIRST);
          }
        case 116: break;
        case 12: 
          { return new Symbol(_SFSLToken_.VARIABLE, new java.lang.String(yytext()));
          }
        case 117: break;
        case 57: 
          { return new Symbol(_SFSLToken_.HISTORYDEEPCLEAR);
          }
        case 118: break;
        case 46: 
          { return new Symbol(_SFSLToken_.TIMEOUT);
          }
        case 119: break;
        case 58: 
          { return new Symbol(_SFSLToken_.USG);
          }
        case 120: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
