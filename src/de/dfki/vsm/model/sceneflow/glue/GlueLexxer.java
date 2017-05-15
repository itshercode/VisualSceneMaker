/* The following code was generated by JFlex 1.4.3 on 15.05.17 15:54 */

package de.dfki.vsm.model.sceneflow.glue;

// Import Directives
import java_cup.runtime.Symbol;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 15.05.17 15:54 from the specification file
 * <tt>D:/Repositories/VisualSceneMaker/src/de/dfki/vsm/model/sceneflow/glue/lexxer.jflex</tt>
 */
public final class GlueLexxer implements java_cup.runtime.Scanner {

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
    "\10\0\1\2\1\22\1\22\1\0\1\22\1\22\22\0\1\22\1\72"+
    "\1\23\2\2\1\10\1\75\1\2\1\14\1\15\1\7\1\5\1\101"+
    "\1\6\1\4\1\100\12\1\1\102\1\2\1\76\1\71\1\77\1\74"+
    "\1\2\1\43\1\21\1\54\1\45\1\21\1\55\1\52\1\53\1\65"+
    "\5\21\1\62\1\35\1\21\1\57\1\37\1\60\1\47\1\63\4\21"+
    "\1\12\1\3\1\13\1\20\1\21\1\0\1\31\1\50\1\40\1\64"+
    "\1\27\1\30\1\46\1\56\1\44\1\67\1\51\1\32\1\61\1\34"+
    "\1\41\1\42\1\21\1\25\1\33\1\24\1\26\1\66\1\70\1\21"+
    "\1\36\1\21\1\16\1\11\1\17\1\73\41\0\140\21\uff00\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\1\23\20\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\1\0\1\34"+
    "\1\35\1\36\1\37\3\0\1\40\26\20\1\41\1\20"+
    "\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51"+
    "\1\52\1\40\1\20\1\53\6\20\1\54\5\20\1\55"+
    "\7\20\1\56\1\57\1\20\1\60\2\20\1\61\3\20"+
    "\1\62\2\20\1\63\5\20\1\64\1\20\1\65\4\20"+
    "\1\66\7\20\1\67\4\20\1\70\3\20\1\71\1\20"+
    "\1\72\7\20\1\73\11\20\1\74\1\75\11\20\1\76"+
    "\1\20\1\77\24\20\1\100\17\20\1\101\2\20\1\102"+
    "\2\20\1\103\3\20\1\104\1\105\1\106\1\20\1\107"+
    "\1\110";

  private static int [] zzUnpackAction() {
    int [] result = new int[242];
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
    "\0\0\0\103\0\206\0\103\0\311\0\u010c\0\103\0\103"+
    "\0\u014f\0\103\0\103\0\103\0\103\0\103\0\103\0\103"+
    "\0\u0192\0\103\0\u01d5\0\u0218\0\u025b\0\u029e\0\u02e1\0\u0324"+
    "\0\u0367\0\u03aa\0\u03ed\0\u0430\0\u0473\0\u04b6\0\u04f9\0\u053c"+
    "\0\u057f\0\u05c2\0\u0605\0\u0648\0\u068b\0\u06ce\0\u0711\0\u0754"+
    "\0\103\0\u0797\0\u07da\0\u081d\0\u0860\0\103\0\103\0\103"+
    "\0\u08a3\0\103\0\103\0\103\0\103\0\u01d5\0\u08e6\0\u0929"+
    "\0\103\0\u096c\0\u09af\0\u09f2\0\u0a35\0\u0a78\0\u0abb\0\u0afe"+
    "\0\u0b41\0\u0b84\0\u0bc7\0\u0c0a\0\u0c4d\0\u0c90\0\u0cd3\0\u0d16"+
    "\0\u0d59\0\u0d9c\0\u0ddf\0\u0e22\0\u0e65\0\u0ea8\0\u0eeb\0\u0192"+
    "\0\u0f2e\0\103\0\103\0\103\0\103\0\103\0\103\0\103"+
    "\0\103\0\u08a3\0\u01d5\0\u0f71\0\u0192\0\u0fb4\0\u0ff7\0\u103a"+
    "\0\u107d\0\u10c0\0\u1103\0\u0192\0\u1146\0\u1189\0\u11cc\0\u120f"+
    "\0\u1252\0\u0192\0\u1295\0\u12d8\0\u131b\0\u135e\0\u13a1\0\u13e4"+
    "\0\u1427\0\u0192\0\u0192\0\u146a\0\u0192\0\u14ad\0\u14f0\0\u0192"+
    "\0\u1533\0\u1576\0\u15b9\0\u0192\0\u15fc\0\u163f\0\u0192\0\u1682"+
    "\0\u16c5\0\u1708\0\u174b\0\u178e\0\u0192\0\u17d1\0\u0192\0\u1814"+
    "\0\u1857\0\u189a\0\u18dd\0\u0192\0\u1920\0\u1963\0\u19a6\0\u19e9"+
    "\0\u1a2c\0\u1a6f\0\u1ab2\0\u0192\0\u1af5\0\u1b38\0\u1b7b\0\u1bbe"+
    "\0\u0192\0\u1c01\0\u1c44\0\u1c87\0\u0192\0\u1cca\0\u0192\0\u1d0d"+
    "\0\u1d50\0\u1d93\0\u1dd6\0\u1e19\0\u1e5c\0\u1e9f\0\u0192\0\u1ee2"+
    "\0\u1f25\0\u1f68\0\u1fab\0\u1fee\0\u2031\0\u2074\0\u20b7\0\u20fa"+
    "\0\u0192\0\u0192\0\u213d\0\u2180\0\u21c3\0\u2206\0\u2249\0\u228c"+
    "\0\u22cf\0\u2312\0\u2355\0\u0192\0\u2398\0\u0192\0\u23db\0\u241e"+
    "\0\u2461\0\u24a4\0\u24e7\0\u252a\0\u256d\0\u25b0\0\u25f3\0\u2636"+
    "\0\u2679\0\u26bc\0\u26ff\0\u2742\0\u2785\0\u27c8\0\u280b\0\u284e"+
    "\0\u2891\0\u28d4\0\u0192\0\u2917\0\u295a\0\u299d\0\u29e0\0\u2a23"+
    "\0\u2a66\0\u2aa9\0\u2aec\0\u2b2f\0\u2b72\0\u2bb5\0\u2bf8\0\u2c3b"+
    "\0\u2c7e\0\u2cc1\0\u0192\0\u2d04\0\u2d47\0\u0192\0\u2d8a\0\u2dcd"+
    "\0\u0192\0\u2e10\0\u2e53\0\u2e96\0\u0192\0\u0192\0\u0192\0\u2ed9"+
    "\0\u0192\0\u0192";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[242];
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
    "\1\2\1\3\2\2\1\4\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\3\21\1\25\1\21\1\26"+
    "\1\27\1\30\1\31\1\21\1\32\1\33\1\34\2\21"+
    "\1\35\2\21\1\36\1\37\2\21\1\40\1\41\2\21"+
    "\1\42\1\43\3\21\1\44\1\45\1\46\2\21\1\47"+
    "\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57"+
    "\1\60\104\0\1\3\2\0\1\61\103\0\1\62\103\0"+
    "\1\63\70\0\1\64\14\0\1\65\72\0\1\21\17\0"+
    "\1\21\2\0\45\21\13\0\2\66\1\67\13\66\1\70"+
    "\1\0\2\66\1\71\57\66\1\0\1\21\17\0\1\21"+
    "\2\0\1\21\1\72\43\21\13\0\1\21\17\0\1\21"+
    "\2\0\2\21\1\73\2\21\1\74\1\75\36\21\13\0"+
    "\1\21\17\0\1\21\2\0\15\21\1\76\27\21\13\0"+
    "\1\21\17\0\1\21\2\0\1\77\31\21\1\100\12\21"+
    "\13\0\1\21\17\0\1\21\2\0\2\21\1\101\1\102"+
    "\41\21\13\0\1\21\17\0\1\21\2\0\6\21\1\103"+
    "\36\21\13\0\1\21\17\0\1\21\2\0\1\104\44\21"+
    "\13\0\1\21\17\0\1\21\2\0\6\21\1\105\23\21"+
    "\1\106\12\21\13\0\1\21\17\0\1\21\2\0\24\21"+
    "\1\107\20\21\13\0\1\21\17\0\1\21\2\0\10\21"+
    "\1\110\34\21\13\0\1\21\17\0\1\21\2\0\10\21"+
    "\1\111\34\21\13\0\1\21\17\0\1\21\2\0\15\21"+
    "\1\112\27\21\13\0\1\21\17\0\1\21\2\0\20\21"+
    "\1\113\24\21\13\0\1\21\17\0\1\21\2\0\15\21"+
    "\1\114\27\21\13\0\1\21\17\0\1\21\2\0\5\21"+
    "\1\115\37\21\13\0\1\21\17\0\1\21\2\0\20\21"+
    "\1\116\24\21\13\0\1\21\17\0\1\21\2\0\15\21"+
    "\1\117\27\21\13\0\1\21\17\0\1\21\2\0\10\21"+
    "\1\120\34\21\13\0\1\21\17\0\1\21\2\0\5\21"+
    "\1\121\37\21\103\0\1\122\17\0\1\123\62\0\1\124"+
    "\1\0\1\125\15\0\1\126\171\0\1\127\76\0\1\130"+
    "\102\0\1\131\12\0\1\132\102\0\2\66\1\67\13\66"+
    "\1\70\1\0\2\66\1\133\57\66\20\0\1\66\63\0"+
    "\1\21\17\0\1\21\2\0\2\21\1\134\42\21\13\0"+
    "\1\21\17\0\1\21\2\0\10\21\1\135\34\21\13\0"+
    "\1\21\17\0\1\21\2\0\6\21\1\136\36\21\13\0"+
    "\1\21\17\0\1\21\2\0\15\21\1\137\27\21\13\0"+
    "\1\21\17\0\1\21\2\0\10\21\1\140\34\21\13\0"+
    "\1\21\17\0\1\21\2\0\1\21\1\141\43\21\13\0"+
    "\1\21\17\0\1\21\2\0\15\21\1\142\27\21\13\0"+
    "\1\21\17\0\1\21\2\0\6\21\1\143\36\21\13\0"+
    "\1\21\17\0\1\21\2\0\44\21\1\144\13\0\1\21"+
    "\17\0\1\21\2\0\5\21\1\145\37\21\13\0\1\21"+
    "\17\0\1\21\2\0\15\21\1\146\27\21\13\0\1\21"+
    "\17\0\1\21\2\0\5\21\1\147\37\21\13\0\1\21"+
    "\17\0\1\21\2\0\5\21\1\150\37\21\13\0\1\21"+
    "\17\0\1\21\2\0\43\21\1\151\1\21\13\0\1\21"+
    "\17\0\1\21\2\0\1\152\44\21\13\0\1\21\17\0"+
    "\1\21\2\0\24\21\1\153\20\21\13\0\1\21\17\0"+
    "\1\21\2\0\15\21\1\154\27\21\13\0\1\21\17\0"+
    "\1\21\2\0\7\21\1\155\35\21\13\0\1\21\17\0"+
    "\1\21\2\0\10\21\1\156\34\21\13\0\1\21\17\0"+
    "\1\21\2\0\10\21\1\157\34\21\13\0\1\21\17\0"+
    "\1\21\2\0\35\21\1\160\7\21\13\0\1\21\17\0"+
    "\1\21\2\0\2\21\1\161\42\21\13\0\1\21\17\0"+
    "\1\21\2\0\1\21\1\162\43\21\13\0\1\21\17\0"+
    "\1\21\2\0\3\21\1\163\41\21\13\0\1\21\17\0"+
    "\1\21\2\0\7\21\1\134\35\21\13\0\1\21\17\0"+
    "\1\21\2\0\5\21\1\164\37\21\13\0\1\21\17\0"+
    "\1\21\2\0\22\21\1\165\22\21\13\0\1\21\17\0"+
    "\1\21\2\0\20\21\1\166\24\21\13\0\1\21\17\0"+
    "\1\21\2\0\1\21\1\167\43\21\13\0\1\21\17\0"+
    "\1\21\2\0\6\21\1\170\36\21\13\0\1\21\17\0"+
    "\1\21\2\0\12\21\1\171\32\21\13\0\1\21\17\0"+
    "\1\21\2\0\16\21\1\172\26\21\13\0\1\21\17\0"+
    "\1\21\2\0\7\21\1\173\35\21\13\0\1\21\17\0"+
    "\1\21\2\0\1\21\1\174\43\21\13\0\1\21\17\0"+
    "\1\21\2\0\3\21\1\175\41\21\13\0\1\21\17\0"+
    "\1\21\2\0\6\21\1\176\36\21\13\0\1\21\17\0"+
    "\1\21\2\0\6\21\1\177\36\21\13\0\1\21\17\0"+
    "\1\21\2\0\1\200\44\21\13\0\1\21\17\0\1\21"+
    "\2\0\1\201\44\21\13\0\1\21\17\0\1\21\2\0"+
    "\40\21\1\202\4\21\13\0\1\21\17\0\1\21\2\0"+
    "\3\21\1\203\41\21\13\0\1\21\17\0\1\21\2\0"+
    "\24\21\1\204\20\21\13\0\1\21\17\0\1\21\2\0"+
    "\1\205\44\21\13\0\1\21\17\0\1\21\2\0\10\21"+
    "\1\206\34\21\13\0\1\21\17\0\1\21\2\0\1\207"+
    "\44\21\13\0\1\21\17\0\1\21\2\0\13\21\1\210"+
    "\3\21\1\211\1\21\1\212\23\21\13\0\1\21\17\0"+
    "\1\21\2\0\17\21\1\213\25\21\13\0\1\21\17\0"+
    "\1\21\2\0\7\21\1\214\35\21\13\0\1\21\17\0"+
    "\1\21\2\0\14\21\1\215\30\21\13\0\1\21\17\0"+
    "\1\21\2\0\15\21\1\216\27\21\13\0\1\21\17\0"+
    "\1\21\2\0\15\21\1\217\27\21\13\0\1\21\17\0"+
    "\1\21\2\0\5\21\1\220\37\21\13\0\1\21\17\0"+
    "\1\21\2\0\15\21\1\221\27\21\13\0\1\21\17\0"+
    "\1\21\2\0\15\21\1\222\27\21\13\0\1\21\17\0"+
    "\1\21\2\0\6\21\1\223\36\21\13\0\1\21\17\0"+
    "\1\21\2\0\22\21\1\224\22\21\13\0\1\21\17\0"+
    "\1\21\2\0\14\21\1\225\30\21\13\0\1\21\17\0"+
    "\1\21\2\0\14\21\1\226\30\21\13\0\1\21\17\0"+
    "\1\21\2\0\20\21\1\227\24\21\13\0\1\21\17\0"+
    "\1\21\2\0\14\21\1\230\30\21\13\0\1\21\17\0"+
    "\1\21\2\0\1\231\44\21\13\0\1\21\17\0\1\21"+
    "\2\0\14\21\1\232\30\21\13\0\1\21\17\0\1\21"+
    "\2\0\1\21\1\233\43\21\13\0\1\21\17\0\1\21"+
    "\2\0\20\21\1\234\24\21\13\0\1\21\17\0\1\21"+
    "\2\0\35\21\1\235\7\21\13\0\1\21\17\0\1\21"+
    "\2\0\2\21\1\236\42\21\13\0\1\21\17\0\1\21"+
    "\2\0\3\21\1\237\41\21\13\0\1\21\17\0\1\21"+
    "\2\0\3\21\1\240\41\21\13\0\1\21\17\0\1\21"+
    "\2\0\1\241\44\21\13\0\1\21\17\0\1\21\2\0"+
    "\5\21\1\242\37\21\13\0\1\21\17\0\1\21\2\0"+
    "\1\243\44\21\13\0\1\21\17\0\1\21\2\0\25\21"+
    "\1\244\17\21\13\0\1\21\17\0\1\21\2\0\12\21"+
    "\1\245\32\21\13\0\1\21\17\0\1\21\2\0\10\21"+
    "\1\246\34\21\13\0\1\21\17\0\1\21\2\0\1\247"+
    "\44\21\13\0\1\21\17\0\1\21\2\0\10\21\1\250"+
    "\34\21\13\0\1\21\17\0\1\21\2\0\20\21\1\251"+
    "\24\21\13\0\1\21\17\0\1\21\2\0\6\21\1\252"+
    "\36\21\13\0\1\21\17\0\1\21\2\0\20\21\1\253"+
    "\24\21\13\0\1\21\17\0\1\21\2\0\13\21\1\254"+
    "\31\21\13\0\1\21\17\0\1\21\2\0\13\21\1\255"+
    "\14\21\1\256\2\21\1\257\3\21\1\260\5\21\13\0"+
    "\1\21\17\0\1\21\2\0\7\21\1\261\35\21\13\0"+
    "\1\21\17\0\1\21\2\0\3\21\1\262\41\21\13\0"+
    "\1\21\17\0\1\21\2\0\15\21\1\263\27\21\13\0"+
    "\1\21\17\0\1\21\2\0\15\21\1\264\27\21\13\0"+
    "\1\21\17\0\1\21\2\0\15\21\1\265\27\21\13\0"+
    "\1\21\17\0\1\21\2\0\14\21\1\266\30\21\13\0"+
    "\1\21\17\0\1\21\2\0\3\21\1\267\41\21\13\0"+
    "\1\21\17\0\1\21\2\0\6\21\1\270\6\21\1\271"+
    "\27\21\13\0\1\21\17\0\1\21\2\0\2\21\1\272"+
    "\42\21\13\0\1\21\17\0\1\21\2\0\5\21\1\273"+
    "\37\21\13\0\1\21\17\0\1\21\2\0\10\21\1\274"+
    "\34\21\13\0\1\21\17\0\1\21\2\0\22\21\1\275"+
    "\22\21\13\0\1\21\17\0\1\21\2\0\10\21\1\276"+
    "\34\21\13\0\1\21\17\0\1\21\2\0\3\21\1\277"+
    "\41\21\13\0\1\21\17\0\1\21\2\0\1\300\44\21"+
    "\13\0\1\21\17\0\1\21\2\0\3\21\1\301\41\21"+
    "\13\0\1\21\17\0\1\21\2\0\10\21\1\302\34\21"+
    "\13\0\1\21\17\0\1\21\2\0\10\21\1\303\34\21"+
    "\13\0\1\21\17\0\1\21\2\0\6\21\1\304\36\21"+
    "\13\0\1\21\17\0\1\21\2\0\17\21\1\305\25\21"+
    "\13\0\1\21\17\0\1\21\2\0\10\21\1\306\34\21"+
    "\13\0\1\21\17\0\1\21\2\0\21\21\1\307\23\21"+
    "\13\0\1\21\17\0\1\21\2\0\5\21\1\310\37\21"+
    "\13\0\1\21\17\0\1\21\2\0\1\311\44\21\13\0"+
    "\1\21\17\0\1\21\2\0\34\21\1\312\10\21\13\0"+
    "\1\21\17\0\1\21\2\0\2\21\1\313\42\21\13\0"+
    "\1\21\17\0\1\21\2\0\14\21\1\314\30\21\13\0"+
    "\1\21\17\0\1\21\2\0\3\21\1\315\41\21\13\0"+
    "\1\21\17\0\1\21\2\0\3\21\1\316\41\21\13\0"+
    "\1\21\17\0\1\21\2\0\1\21\1\317\43\21\13\0"+
    "\1\21\17\0\1\21\2\0\5\21\1\320\37\21\13\0"+
    "\1\21\17\0\1\21\2\0\20\21\1\321\24\21\13\0"+
    "\1\21\17\0\1\21\2\0\3\21\1\322\41\21\13\0"+
    "\1\21\17\0\1\21\2\0\1\323\44\21\13\0\1\21"+
    "\17\0\1\21\2\0\13\21\1\324\12\21\1\325\16\21"+
    "\13\0\1\21\17\0\1\21\2\0\16\21\1\326\26\21"+
    "\13\0\1\21\17\0\1\21\2\0\21\21\1\327\7\21"+
    "\1\330\13\21\13\0\1\21\17\0\1\21\2\0\20\21"+
    "\1\331\24\21\13\0\1\21\17\0\1\21\2\0\35\21"+
    "\1\332\7\21\13\0\1\21\17\0\1\21\2\0\36\21"+
    "\1\333\6\21\13\0\1\21\17\0\1\21\2\0\14\21"+
    "\1\334\30\21\13\0\1\21\17\0\1\21\2\0\1\21"+
    "\1\335\43\21\13\0\1\21\17\0\1\21\2\0\1\336"+
    "\44\21\13\0\1\21\17\0\1\21\2\0\3\21\1\337"+
    "\41\21\13\0\1\21\17\0\1\21\2\0\6\21\1\340"+
    "\36\21\13\0\1\21\17\0\1\21\2\0\10\21\1\341"+
    "\34\21\13\0\1\21\17\0\1\21\2\0\3\21\1\342"+
    "\41\21\13\0\1\21\17\0\1\21\2\0\4\21\1\343"+
    "\40\21\13\0\1\21\17\0\1\21\2\0\1\21\1\344"+
    "\43\21\13\0\1\21\17\0\1\21\2\0\15\21\1\345"+
    "\27\21\13\0\1\21\17\0\1\21\2\0\32\21\1\346"+
    "\12\21\13\0\1\21\17\0\1\21\2\0\3\21\1\347"+
    "\41\21\13\0\1\21\17\0\1\21\2\0\5\21\1\350"+
    "\37\21\13\0\1\21\17\0\1\21\2\0\7\21\1\351"+
    "\35\21\13\0\1\21\17\0\1\21\2\0\36\21\1\352"+
    "\6\21\13\0\1\21\17\0\1\21\2\0\20\21\1\353"+
    "\24\21\13\0\1\21\17\0\1\21\2\0\2\21\1\354"+
    "\42\21\13\0\1\21\17\0\1\21\2\0\16\21\1\355"+
    "\26\21\13\0\1\21\17\0\1\21\2\0\1\356\44\21"+
    "\13\0\1\21\17\0\1\21\2\0\4\21\1\357\40\21"+
    "\13\0\1\21\17\0\1\21\2\0\16\21\1\360\26\21"+
    "\13\0\1\21\17\0\1\21\2\0\16\21\1\361\26\21"+
    "\13\0\1\21\17\0\1\21\2\0\1\362\44\21\12\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[12060];
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
    "\1\0\1\11\1\1\1\11\2\1\2\11\1\1\7\11"+
    "\1\1\1\11\26\1\1\11\4\1\3\11\1\0\4\11"+
    "\3\0\1\11\30\1\10\11\231\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[242];
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
  public GlueLexxer(java.io.Reader in) {
      // Do nothing here
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public GlueLexxer(java.io.InputStream in) {
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
    while (i < 178) {
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
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
        // Do Nothing
  yyclose();
    }
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
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
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
        case 6: 
          { return new Symbol(GlueFields.TIMES);
          }
        case 73: break;
        case 16: 
          { return new Symbol(GlueFields.IDENTIFIER, yytext());
          }
        case 74: break;
        case 49: 
          { return new Symbol(GlueFields.OBJECT_LITERAL, null);
          }
        case 75: break;
        case 30: 
          { return new Symbol(GlueFields.ARROW);
          }
        case 76: break;
        case 58: 
          { return new Symbol(GlueFields.DOUBLE);
          }
        case 77: break;
        case 43: 
          { return new Symbol(GlueFields.FUN);
          }
        case 78: break;
        case 11: 
          { return new Symbol(GlueFields.LPAREN);
          }
        case 79: break;
        case 47: 
          { return new Symbol(GlueFields.BOOLEAN_LITERAL, Boolean.valueOf(yytext()));
          }
        case 80: break;
        case 3: 
          { return new Symbol(GlueFields.DOT);
          }
        case 81: break;
        case 17: 
          { /* Ignore white space characters with glue language lexer */
          }
        case 82: break;
        case 71: 
          { return new Symbol(GlueFields.UnblockSceneGroup);
          }
        case 83: break;
        case 45: 
          { return new Symbol(GlueFields.INT);
          }
        case 84: break;
        case 22: 
          { return new Symbol(GlueFields.AND);
          }
        case 85: break;
        case 54: 
          { return new Symbol(GlueFields.CLASS);
          }
        case 86: break;
        case 8: 
          { return new Symbol(GlueFields.OR);
          }
        case 87: break;
        case 70: 
          { return new Symbol(GlueFields.HistoryRunTimeOf);
          }
        case 88: break;
        case 33: 
          { return new Symbol(GlueFields.InState);
          }
        case 89: break;
        case 10: 
          { return new Symbol(GlueFields.RBRACK);
          }
        case 90: break;
        case 31: 
          { return new Symbol(GlueFields.OROR);
          }
        case 91: break;
        case 38: 
          { return new Symbol(GlueFields.QSTMINUS);
          }
        case 92: break;
        case 19: 
          { return new Symbol(GlueFields.NOT);
          }
        case 93: break;
        case 65: 
          { return new Symbol(GlueFields.HistoryValueOf);
          }
        case 94: break;
        case 23: 
          { return new Symbol(GlueFields.LESS);
          }
        case 95: break;
        case 72: 
          { return new Symbol(GlueFields.UnblockSceneScript);
          }
        case 96: break;
        case 60: 
          { return new Symbol(GlueFields.Contains);
          }
        case 97: break;
        case 42: 
          { return new Symbol(GlueFields.FLOAT_LITERAL, Float.valueOf(yytext()));
          }
        case 98: break;
        case 29: 
          { return new Symbol(GlueFields.DEC);
          }
        case 99: break;
        case 55: 
          { return new Symbol(GlueFields.STRING);
          }
        case 100: break;
        case 14: 
          { return new Symbol(GlueFields.RBRACE);
          }
        case 101: break;
        case 15: 
          { return new Symbol(GlueFields.XOR);
          }
        case 102: break;
        case 46: 
          { return new Symbol(GlueFields.VAR);
          }
        case 103: break;
        case 9: 
          { return new Symbol(GlueFields.LBRACK);
          }
        case 104: break;
        case 20: 
          { return new Symbol(GlueFields.LNOT);
          }
        case 105: break;
        case 39: 
          { return new Symbol(GlueFields.ANDAND);
          }
        case 106: break;
        case 69: 
          { return new Symbol(GlueFields.HistoryClearFlat);
          }
        case 107: break;
        case 2: 
          { return new Symbol(GlueFields.INTEGER_LITERAL, Integer.valueOf(yytext()));
          }
        case 108: break;
        case 52: 
          { return new Symbol(GlueFields.FLOAT);
          }
        case 109: break;
        case 24: 
          { return new Symbol(GlueFields.GREATER);
          }
        case 110: break;
        case 5: 
          { return new Symbol(GlueFields.MINUS);
          }
        case 111: break;
        case 64: 
          { return new Symbol(GlueFields.PlayDialogAct);
          }
        case 112: break;
        case 57: 
          { return new Symbol(GlueFields.Random);
          }
        case 113: break;
        case 18: 
          { return new Symbol(GlueFields.EQUAL);
          }
        case 114: break;
        case 56: 
          { return new Symbol(GlueFields.OBJECT);
          }
        case 115: break;
        case 34: 
          { return new Symbol(GlueFields.EQUALEQUAL);
          }
        case 116: break;
        case 13: 
          { return new Symbol(GlueFields.LBRACE);
          }
        case 117: break;
        case 27: 
          { return new Symbol(GlueFields.COLON);
          }
        case 118: break;
        case 66: 
          { return new Symbol(GlueFields.HistorySetDepth);
          }
        case 119: break;
        case 48: 
          { return new Symbol(GlueFields.LONG);
          }
        case 120: break;
        case 4: 
          { return new Symbol(GlueFields.PLUS);
          }
        case 121: break;
        case 67: 
          { return new Symbol(GlueFields.HistoryContains);
          }
        case 122: break;
        case 28: 
          { return new Symbol(GlueFields.INC);
          }
        case 123: break;
        case 40: 
          { return new Symbol(GlueFields.LESSEQUAL);
          }
        case 124: break;
        case 68: 
          { return new Symbol(GlueFields.HistoryClearDeep);
          }
        case 125: break;
        case 21: 
          { return new Symbol(GlueFields.QUESTION);
          }
        case 126: break;
        case 35: 
          { return new Symbol(GlueFields.NOTMINUS);
          }
        case 127: break;
        case 32: 
          { return new Symbol(GlueFields.STRING_LITERAL, yytext());
          }
        case 128: break;
        case 36: 
          { return new Symbol(GlueFields.NOTEQUAL);
          }
        case 129: break;
        case 41: 
          { return new Symbol(GlueFields.GREATEREQUAL);
          }
        case 130: break;
        case 62: 
          { return new Symbol(GlueFields.PlayAction);
          }
        case 131: break;
        case 26: 
          { return new Symbol(GlueFields.COMMA);
          }
        case 132: break;
        case 63: 
          { return new Symbol(GlueFields.StopAction);
          }
        case 133: break;
        case 37: 
          { return new Symbol(GlueFields.NOTTILDE);
          }
        case 134: break;
        case 50: 
          { return new Symbol(GlueFields.CHAR);
          }
        case 135: break;
        case 44: 
          { return new Symbol(GlueFields.NEW);
          }
        case 136: break;
        case 61: 
          { return new Symbol(GlueFields.PlayScene);
          }
        case 137: break;
        case 12: 
          { return new Symbol(GlueFields.RPAREN);
          }
        case 138: break;
        case 25: 
          { return new Symbol(GlueFields.DIV);
          }
        case 139: break;
        case 7: 
          { return new Symbol(GlueFields.MOD);
          }
        case 140: break;
        case 51: 
          { return new Symbol(GlueFields.BOOL);
          }
        case 141: break;
        case 53: 
          { return new Symbol(GlueFields.SHORT);
          }
        case 142: break;
        case 1: 
          { System.err.println("Illegal character: '" + yytext() + "'");
          }
        case 143: break;
        case 59: 
          { return new Symbol(GlueFields.Timeout);
          }
        case 144: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              {     // Return NULL At End Of File
    return null;
    // Return EOF Token At File End                                    
    //return create(GlueFields.EOF);
 }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
