
//----------------------------------------------------
// The following code was generated by CUP v0.10k
// Sat Dec 07 22:18:22 CET 2024
//----------------------------------------------------

import java_cup.runtime.*;
import java.io.*;
import java.util.*;
import SymbolTable.*;

/** CUP v0.10k generated parser.
  * @version Sat Dec 07 22:18:22 CET 2024
  */
public class MPParser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public MPParser() {super();}

  /** Constructor which sets the default scanner. */
  public MPParser(java_cup.runtime.Scanner s) {super(s);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\045\000\002\002\004\000\002\003\006\000\002\004" +
    "\006\000\002\005\004\000\002\005\002\000\002\006\005" +
    "\000\002\020\003\000\002\020\005\000\002\013\003\000" +
    "\002\013\003\000\002\013\003\000\002\013\003\000\002" +
    "\007\004\000\002\007\003\000\002\010\003\000\002\010" +
    "\006\000\002\010\003\000\002\011\017\000\002\014\005" +
    "\000\002\014\003\000\002\015\005\000\002\015\003\000" +
    "\002\016\005\000\002\016\003\000\002\012\003\000\002" +
    "\012\003\000\002\012\003\000\002\012\003\000\002\012" +
    "\003\000\002\012\003\000\002\017\003\000\002\017\003" +
    "\000\002\017\005\000\002\021\003\000\002\021\003\000" +
    "\002\021\003\000\002\021\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\103\000\004\004\005\001\002\000\004\002\105\001" +
    "\002\000\004\005\006\001\002\000\004\006\007\001\002" +
    "\000\004\007\011\001\002\000\004\002\000\001\002\000" +
    "\020\007\ufffd\013\ufffd\014\ufffd\015\ufffd\016\ufffd\020\ufffd" +
    "\032\ufffd\001\002\000\020\007\011\013\014\014\025\015" +
    "\026\016\016\020\020\032\023\001\002\000\004\032\100" +
    "\001\002\000\004\032\ufff9\001\002\000\014\007\ufff1\010" +
    "\ufff1\020\ufff1\021\ufff1\032\ufff1\001\002\000\004\032\ufff6" +
    "\001\002\000\012\007\011\010\077\020\020\032\023\001" +
    "\002\000\004\005\062\001\002\000\020\007\ufffe\013\ufffe" +
    "\014\ufffe\015\ufffe\016\ufffe\020\ufffe\032\ufffe\001\002\000" +
    "\012\007\ufff4\010\ufff4\020\ufff4\032\ufff4\001\002\000\004" +
    "\017\027\001\002\000\014\007\ufff3\010\ufff3\020\ufff3\021" +
    "\ufff3\032\ufff3\001\002\000\004\032\ufff8\001\002\000\004" +
    "\032\ufff7\001\002\000\016\005\036\032\040\033\042\034" +
    "\031\035\034\036\035\001\002\000\026\006\uffe2\011\uffe2" +
    "\022\uffe2\023\uffe2\024\uffe2\025\uffe2\026\uffe2\027\uffe2\030" +
    "\uffe2\031\uffe2\001\002\000\026\006\uffdf\011\uffdf\022\uffdf" +
    "\023\uffdf\024\uffdf\025\uffdf\026\uffdf\027\uffdf\030\uffdf\031" +
    "\uffdf\001\002\000\012\006\uffee\011\uffee\022\uffee\023\057" +
    "\001\002\000\006\011\061\022\055\001\002\000\026\006" +
    "\uffde\011\uffde\022\uffde\023\uffde\024\uffde\025\uffde\026\uffde" +
    "\027\uffde\030\uffde\031\uffde\001\002\000\026\006\uffdd\011" +
    "\uffdd\022\uffdd\023\uffdd\024\uffdd\025\uffdd\026\uffdd\027\uffdd" +
    "\030\uffdd\031\uffdd\001\002\000\016\005\036\032\040\033" +
    "\042\034\031\035\034\036\035\001\002\000\026\006\uffea" +
    "\011\uffea\022\uffea\023\uffea\024\045\025\047\026\044\027" +
    "\051\030\046\031\050\001\002\000\026\006\uffe3\011\uffe3" +
    "\022\uffe3\023\uffe3\024\uffe3\025\uffe3\026\uffe3\027\uffe3\030" +
    "\uffe3\031\uffe3\001\002\000\012\006\uffec\011\uffec\022\uffec" +
    "\023\uffec\001\002\000\026\006\uffe0\011\uffe0\022\uffe0\023" +
    "\uffe0\024\uffe0\025\uffe0\026\uffe0\027\uffe0\030\uffe0\031\uffe0" +
    "\001\002\000\016\005\036\032\040\033\042\034\031\035" +
    "\034\036\035\001\002\000\016\005\uffe7\032\uffe7\033\uffe7" +
    "\034\uffe7\035\uffe7\036\uffe7\001\002\000\016\005\uffe9\032" +
    "\uffe9\033\uffe9\034\uffe9\035\uffe9\036\uffe9\001\002\000\016" +
    "\005\uffe5\032\uffe5\033\uffe5\034\uffe5\035\uffe5\036\uffe5\001" +
    "\002\000\016\005\uffe8\032\uffe8\033\uffe8\034\uffe8\035\uffe8" +
    "\036\uffe8\001\002\000\016\005\uffe4\032\uffe4\033\uffe4\034" +
    "\uffe4\035\uffe4\036\uffe4\001\002\000\016\005\uffe6\032\uffe6" +
    "\033\uffe6\034\uffe6\035\uffe6\036\uffe6\001\002\000\012\006" +
    "\uffeb\011\uffeb\022\uffeb\023\uffeb\001\002\000\006\006\054" +
    "\022\055\001\002\000\026\006\uffe1\011\uffe1\022\uffe1\023" +
    "\uffe1\024\uffe1\025\uffe1\026\uffe1\027\uffe1\030\uffe1\031\uffe1" +
    "\001\002\000\016\005\036\032\040\033\042\034\031\035" +
    "\034\036\035\001\002\000\012\006\uffef\011\uffef\022\uffef" +
    "\023\057\001\002\000\016\005\036\032\040\033\042\034" +
    "\031\035\034\036\035\001\002\000\012\006\uffed\011\uffed" +
    "\022\uffed\023\uffed\001\002\000\014\007\ufff2\010\ufff2\020" +
    "\ufff2\021\ufff2\032\ufff2\001\002\000\016\005\036\032\040" +
    "\033\042\034\031\035\034\036\035\001\002\000\006\006" +
    "\064\022\055\001\002\000\004\007\065\001\002\000\010" +
    "\007\011\020\020\032\023\001\002\000\004\021\067\001" +
    "\002\000\004\005\070\001\002\000\016\005\036\032\040" +
    "\033\042\034\031\035\034\036\035\001\002\000\006\006" +
    "\072\022\055\001\002\000\004\011\073\001\002\000\010" +
    "\007\011\020\020\032\023\001\002\000\004\010\075\001" +
    "\002\000\014\007\ufff0\010\ufff0\020\ufff0\021\ufff0\032\ufff0" +
    "\001\002\000\012\007\ufff5\010\ufff5\020\ufff5\032\ufff5\001" +
    "\002\000\016\002\uffff\007\uffff\010\uffff\020\uffff\021\uffff" +
    "\032\uffff\001\002\000\006\011\ufffb\012\ufffb\001\002\000" +
    "\006\011\103\012\102\001\002\000\004\032\104\001\002" +
    "\000\020\007\ufffc\013\ufffc\014\ufffc\015\ufffc\016\ufffc\020" +
    "\ufffc\032\ufffc\001\002\000\006\011\ufffa\012\ufffa\001\002" +
    "\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\103\000\004\003\003\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\004\007\001\001" +
    "\000\002\001\001\000\004\005\011\001\001\000\016\004" +
    "\014\006\020\007\016\010\021\011\023\013\012\001\001" +
    "\000\004\020\100\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\010\004\014\010\075\011\023" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\014\014\032\015\031\016\040\017" +
    "\036\021\027\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\014\014\052\015\031\016\040\017\036" +
    "\021\027\001\001\000\004\012\042\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\006\017\051" +
    "\021\027\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\012\015\055\016\040\017\036\021\027\001\001" +
    "\000\002\001\001\000\010\016\057\017\036\021\027\001" +
    "\001\000\002\001\001\000\002\001\001\000\014\014\062" +
    "\015\031\016\040\017\036\021\027\001\001\000\002\001" +
    "\001\000\002\001\001\000\010\004\014\010\065\011\023" +
    "\001\001\000\002\001\001\000\002\001\001\000\014\014" +
    "\070\015\031\016\040\017\036\021\027\001\001\000\002" +
    "\001\001\000\002\001\001\000\010\004\014\010\073\011" +
    "\023\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$MPParser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$MPParser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$MPParser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** User initialization code. */
  public void user_init() throws java.lang.Exception
    {

	symbolTable = new SymbolTable();

    }


	public int errNo = 0;
	public int warnNo = 0;
	SymbolTable symbolTable; 

   public static void main( String[] args )
   {
      try
	  {
		   FileReader file = new FileReader( args[0] );
		   java_cup.runtime.Scanner scanner = new MPLexer( file );
		   MPParser parser = new MPParser( scanner );
		   parser.parse();
		   parser.checkWarnings();
		   if ( parser.errNo==0 && parser.warnNo==0 )
		   		System.out.println("Analiza zavrsena. U kodu nema gresaka." );
 		   else
 				System.out.println("Analiza zavrsena. Broj gresaka: " + parser.errNo + " Broj upozorenja: " + parser.warnNo ); 
	  }
	  catch( Exception e )
	  {
		   e.printStackTrace();
	  }
   }
   public void checkWarnings()
   {
   		SymbolNode current = symbolTable.getVariables();
 		while ( current != null )
 		{
 			Variable var = ( Variable ) current;
 			if ( var.last_def == -1 && var.last_use == -1 )
 			{
 				System.out.println("Upozorenje: Promenljiva " + var.name + "je deklarisana, ali se ne koristi."); 
				warnNo++;
			}
 			else if ( var.last_def > var.last_use )
 			{
 				System.out.println("Upozorenje: Vrednost dodeljena prom. " + var.name + " u liniji " + var.last_def + " se nigde ne koristi." );
				warnNo++;
 			}
 		current = current.next;
 		}
 	}
	public void syntax_error(Symbol cur_token)
 	{

 	}

 	public int getLine()
 	{
 		return (( MPLexer) getScanner()).getLine();
 	}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$MPParser$actions {
  private final MPParser parser;

  /** Constructor */
  CUP$MPParser$actions(MPParser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$MPParser$do_action(
    int                        CUP$MPParser$act_num,
    java_cup.runtime.lr_parser CUP$MPParser$parser,
    java.util.Stack            CUP$MPParser$stack,
    int                        CUP$MPParser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$MPParser$result;

      /* select the action based on the action number */
      switch (CUP$MPParser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // ConstantValue ::= BOOLCONST 
            {
              Constant RESULT = null;
		int cleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right;
		Boolean c = (Boolean)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).value;
		
			RESULT = new Constant( parser.symbolTable.getType("bool"), c);
		
              CUP$MPParser$result = new java_cup.runtime.Symbol(15/*ConstantValue*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // ConstantValue ::= CHARCONST 
            {
              Constant RESULT = null;
		int cleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right;
		Character c = (Character)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).value;
		
			RESULT = new Constant( parser.symbolTable.getType("char"), c);
		
              CUP$MPParser$result = new java_cup.runtime.Symbol(15/*ConstantValue*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // ConstantValue ::= FLOATCONST 
            {
              Constant RESULT = null;
		int cleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right;
		Float c = (Float)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).value;
		
			RESULT = new Constant( parser.symbolTable.getType("float"), c);
		
              CUP$MPParser$result = new java_cup.runtime.Symbol(15/*ConstantValue*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // ConstantValue ::= INTCONST 
            {
              Constant RESULT = null;
		int cleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right;
		Integer c = (Integer)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).value;
		
			RESULT = new Constant( parser.symbolTable.getType("integer"), c);
		
              CUP$MPParser$result = new java_cup.runtime.Symbol(15/*ConstantValue*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // Term ::= OBR Expression CBR 
            {
              Type RESULT = null;
		int eleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).right;
		Type e = (Type)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).value;
		
			RESULT = e;
		
              CUP$MPParser$result = new java_cup.runtime.Symbol(13/*Term*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // Term ::= ConstantValue 
            {
              Type RESULT = null;
		int kleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left;
		int kright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right;
		Constant k = (Constant)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).value;
		
			RESULT = k.type;
		
              CUP$MPParser$result = new java_cup.runtime.Symbol(13/*Term*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // Term ::= ID 
            {
              Type RESULT = null;
		int imeleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left;
		int imeright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right;
		String ime = (String)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).value;
		
			Variable var = parser.symbolTable.getVar(ime);
			if (var == null)
			{
				System.out.println("Greska u liniji: " + parser.getLine() + ", Promenljiva: " + ime + " nije deklarisana!");
				parser.errNo++;	
				RESULT = parser.symbolTable.getType("unknown" );
			}
			else
			{
				RESULT = var.type;
				if (var.last_def == -1)
				{
					System.out.println("Greska u liniji: " + parser.getLine() + ", Promenljiva: " + ime + " nije inicijalizovana!");
					parser.errNo++;	
				}
			}
		
              CUP$MPParser$result = new java_cup.runtime.Symbol(13/*Term*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // RelOp ::= GE 
            {
              Object RESULT = null;
		
		
              CUP$MPParser$result = new java_cup.runtime.Symbol(8/*RelOp*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // RelOp ::= GR 
            {
              Object RESULT = null;
		
		
              CUP$MPParser$result = new java_cup.runtime.Symbol(8/*RelOp*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // RelOp ::= NEQ 
            {
              Object RESULT = null;
		
		
              CUP$MPParser$result = new java_cup.runtime.Symbol(8/*RelOp*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // RelOp ::= EQ 
            {
              Object RESULT = null;
		
		
              CUP$MPParser$result = new java_cup.runtime.Symbol(8/*RelOp*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // RelOp ::= LE 
            {
              Object RESULT = null;
		
		
              CUP$MPParser$result = new java_cup.runtime.Symbol(8/*RelOp*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // RelOp ::= LS 
            {
              Object RESULT = null;
		
		
              CUP$MPParser$result = new java_cup.runtime.Symbol(8/*RelOp*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // RelExpression ::= Term 
            {
              Type RESULT = null;
		int tleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right;
		Type t = (Type)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).value;
		
			RESULT = t;
		
              CUP$MPParser$result = new java_cup.runtime.Symbol(12/*RelExpression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // RelExpression ::= Term RelOp Term 
            {
              Type RESULT = null;
		int t1left = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left;
		int t1right = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).right;
		Type t1 = (Type)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).value;
		int t2left = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left;
		int t2right = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right;
		Type t2 = (Type)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).value;
		
			if ((t1.tkind != Type.INTEGER && t1.tkind != Type.FLOAT) || (t2.tkind != Type.INTEGER && t2.tkind != Type.FLOAT))
			{
				System.out.println("Greska u liniji: " + parser.getLine() + ", Relacioni operatori se mogu primeniti samo nad operandima numerickog tipa!");
				parser.errNo++;	
			}
			RESULT = parser.symbolTable.getType("bool");
		
              CUP$MPParser$result = new java_cup.runtime.Symbol(12/*RelExpression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // AndExpression ::= RelExpression 
            {
              Type RESULT = null;
		int rleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left;
		int rright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right;
		Type r = (Type)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).value;
		
			RESULT = r;
		
              CUP$MPParser$result = new java_cup.runtime.Symbol(11/*AndExpression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // AndExpression ::= AndExpression AND RelExpression 
            {
              Type RESULT = null;
		int aleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).right;
		Type a = (Type)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left;
		int rright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right;
		Type r = (Type)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).value;
		
			if (a.tkind != Type.BOOL || r.tkind != Type.BOOL)
			{
				System.out.println("Greska u liniji: " + parser.getLine() + ", Logicki operatori se mogu primeniti samo nad operandima logickog tipa!");
				parser.errNo++;	
			}
			RESULT = parser.symbolTable.getType("bool");
		
              CUP$MPParser$result = new java_cup.runtime.Symbol(11/*AndExpression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // Expression ::= AndExpression 
            {
              Type RESULT = null;
		int aleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right;
		Type a = (Type)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).value;
		
			RESULT = a;
		
              CUP$MPParser$result = new java_cup.runtime.Symbol(10/*Expression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // Expression ::= Expression OR AndExpression 
            {
              Type RESULT = null;
		int eleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).right;
		Type e = (Type)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).value;
		int aleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right;
		Type a = (Type)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).value;
		
			if (e.tkind != Type.BOOL || a.tkind != Type.BOOL)
			{
				System.out.println("Greska u liniji: " + parser.getLine() + ", Logicki operatori se mogu primeniti samo nad operandima logickog tipa!");
				parser.errNo++;	
			}
			RESULT = parser.symbolTable.getType("bool");
		
              CUP$MPParser$result = new java_cup.runtime.Symbol(10/*Expression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // RedoLoop ::= LOOP OBR Expression CBR OCBR Statement REDO OBR Expression CBR SEMIC Statement CCBR 
            {
              Object RESULT = null;
		int e1left = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-10)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-10)).right;
		Type e1 = (Type)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-10)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-4)).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-4)).right;
		Type e2 = (Type)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-4)).value;
		
			if (e1.tkind != Type.BOOL || e2.tkind != Type.BOOL)
			{
				System.out.println("Greska u liniji: " + parser.getLine() + ", izrazi u zagradama moraju biti logickog tipa!");
				parser.errNo++;		
			}
		
              CUP$MPParser$result = new java_cup.runtime.Symbol(7/*RedoLoop*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-12)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // Statement ::= Block 
            {
              Object RESULT = null;
		
		
              CUP$MPParser$result = new java_cup.runtime.Symbol(6/*Statement*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // Statement ::= ID ASS Expression SEMIC 
            {
              Object RESULT = null;
		int imeleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-3)).left;
		int imeright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-3)).right;
		String ime = (String)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-3)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).right;
		Type e = (Type)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).value;
		
			Variable var = parser.symbolTable.getVar(ime);
			if (var == null)
			{
				System.out.println("Greska u liniji: " + parser.getLine() + ", Promenljiva: " + ime + " nije deklarisana!");
				parser.errNo++;				
			}
			else
			{
				var.last_def = parser.getLine();
				if ( var.type.tkind != e.tkind )
                {
                    System.out.println( "Greska u liniji " + parser.getLine() + ": Neslaganje tipa u naredbi dodele." );
                    parser.errNo++;
                }
			}
		
              CUP$MPParser$result = new java_cup.runtime.Symbol(6/*Statement*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-3)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // Statement ::= RedoLoop 
            {
              Object RESULT = null;
		
		
              CUP$MPParser$result = new java_cup.runtime.Symbol(6/*Statement*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // StatementList ::= Statement 
            {
              Object RESULT = null;
		
		
              CUP$MPParser$result = new java_cup.runtime.Symbol(5/*StatementList*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // StatementList ::= StatementList Statement 
            {
              Object RESULT = null;
		
		
              CUP$MPParser$result = new java_cup.runtime.Symbol(5/*StatementList*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // TypeExp ::= BOOL 
            {
              Type RESULT = null;
		
			RESULT = parser.symbolTable.getType("bool");
		
              CUP$MPParser$result = new java_cup.runtime.Symbol(9/*TypeExp*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // TypeExp ::= FLOAT 
            {
              Type RESULT = null;
		
			RESULT = parser.symbolTable.getType("float");
		
              CUP$MPParser$result = new java_cup.runtime.Symbol(9/*TypeExp*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // TypeExp ::= CHAR 
            {
              Type RESULT = null;
		
			RESULT = parser.symbolTable.getType("char");
		
              CUP$MPParser$result = new java_cup.runtime.Symbol(9/*TypeExp*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // TypeExp ::= INT 
            {
              Type RESULT = null;
		
			RESULT = parser.symbolTable.getType("integer");
		
              CUP$MPParser$result = new java_cup.runtime.Symbol(9/*TypeExp*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // NameList ::= NameList COMMA ID 
            {
              ArrayList RESULT = null;
		int nizleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left;
		int nizright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).right;
		ArrayList niz = (ArrayList)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).value;
		int imeleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left;
		int imeright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right;
		String ime = (String)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).value;
		
			RESULT = niz;
			RESULT.add(ime);
		
              CUP$MPParser$result = new java_cup.runtime.Symbol(14/*NameList*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // NameList ::= ID 
            {
              ArrayList RESULT = null;
		int imeleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left;
		int imeright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right;
		String ime = (String)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).value;
		
			RESULT = new ArrayList();
			RESULT.add(ime);
		
              CUP$MPParser$result = new java_cup.runtime.Symbol(14/*NameList*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // VarDecl ::= TypeExp NameList SEMIC 
            {
              Object RESULT = null;
		int tleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).right;
		Type t = (Type)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).value;
		int nizleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left;
		int nizright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).right;
		ArrayList niz = (ArrayList)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).value;
		
			for (int i = 0; i < niz.size(); i++)
			{
				String ime = (String) niz.get(i);
				if (!parser.symbolTable.addVar(ime, t))
				{
					System.out.println("Greska u liniji: " + parser.getLine() + ", Promenljiva: " + ime + " je vec deklarisana!");
					parser.errNo++;
				}
			}
		
              CUP$MPParser$result = new java_cup.runtime.Symbol(4/*VarDecl*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // Declarations ::= 
            {
              Object RESULT = null;
		
		
              CUP$MPParser$result = new java_cup.runtime.Symbol(3/*Declarations*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // Declarations ::= Declarations VarDecl 
            {
              Object RESULT = null;
		
		
              CUP$MPParser$result = new java_cup.runtime.Symbol(3/*Declarations*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // Block ::= OCBR Declarations StatementList CCBR 
            {
              Object RESULT = null;
		
		
              CUP$MPParser$result = new java_cup.runtime.Symbol(2/*Block*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-3)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // Program ::= MAIN OBR CBR Block 
            {
              Object RESULT = null;
		
		
              CUP$MPParser$result = new java_cup.runtime.Symbol(1/*Program*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-3)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= Program EOF 
            {
              Object RESULT = null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).value;
		RESULT = start_val;
              CUP$MPParser$result = new java_cup.runtime.Symbol(0/*$START*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          /* ACCEPT */
          CUP$MPParser$parser.done_parsing();
          return CUP$MPParser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}
