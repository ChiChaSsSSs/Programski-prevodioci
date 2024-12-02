// Korisnicki kod
import java_cup.runtime.*;

%%

// Opcije i deklaracije
%class MPLexer
%cup
%line
%column

%eofval{
	return new Symbol( sym.EOF);
%eofval}

%{
	public int getLine()
	{
		return yyline;
	}
%}

// Dodatno stanje za komentar
%xstate KOMENTAR
// Makroi
slovo = [a-zA-Z]
cifra = [0-9]

%%

// Pravila

% { yybegin( KOMENTAR ); }
<KOMENTAR>~% { yybegin( YYINITIAL ); }

[\t\n\r ] { ; } // Beli simboli

// Operatori
= { return new Symbol( sym.ASS ); }
\|\| { return new Symbol( sym.OR ); }
&& { return new Symbol( sym.AND ); }
'<' { return new Symbol( sym.LS ); }
\<\= { return new Symbol( sym.LE ); }
== { return new Symbol( sym.EQ ); }
\!= { return new Symbol( sym.NEQ ); }
> { return new Symbol( sym.GR ); }
>= { return new Symbol( sym.GE ); }

// Separatori
\( { return new Symbol( sym.OBR ); }
\) { return new Symbol( sym.CBR ); }
\{ { return new Symbol( sym.OCBR ); }
\} { return new Symbol( sym.CCBR ); }
; { return new Symbol( sym.SEMIC ); }
, { return new Symbol( sym.COMMA ); }

// Kljucne reci
"main" { return new Symbol(sym.MAIN ); }
"int" { return new Symbol(sym.INT ); }
"char" { return new Symbol(sym.CHAR ); }
"float" { return new Symbol(sym.FLOAT ); }
"bool" { return new Symbol(sym.BOOL ); }
"loop" { return new Symbol(sym.LOOP ); }
"redo" { return new Symbol(sym.REDO ); }

// Identifikatori
({slovo}|_)({slovo}|{cifra}|_)* { return new Symbol(sym.ID ); }

// Konstante
0#o[0-7]+ { return new Symbol( sym.CONST ); } // Oktalni brojevi
0#x({cifra}|[a-fA-F])+ { return new Symbol( sym.CONST ); } // Heksadecimalni brojevi
(0#d)?{cifra}+ { return new Symbol( sym.CONST ); } // Dekadni brojevi
0\.{cifra}*(E(\+|-){cifra}+)? { return new Symbol(sym.CONST ); } // Float vrednosti
'.' { return new Symbol( sym.CONST ); } // Karakter
true|false  { return new Symbol( sym.CONST ); } // Bool vrednosti

// Greska
. { if (yytext() != null && yytext().length() > 0) System.out.println( "ERROR: " + yytext() ); }
