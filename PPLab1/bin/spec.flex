// Korisnicki kod

%%

// Opcije i deklaracije
%class MPLexer
%function next_token
%line
%column
%debug
%type Yytoken

%eofval{
return new Yytoken( sym.EOF, null, yyline, yycolumn);
%eofval}

%{
KWTable kwTable = new KWTable();
Yytoken getKW()
{
	return new Yytoken( kwTable.find( yytext() ),
	yytext(), yyline, yycolumn );
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
= { return new Yytoken( sym.ASS, yytext(), yyline, yycolumn ); }
\|\| { return new Yytoken( sym.OR, yytext(), yyline, yycolumn ); }
&& { return new Yytoken( sym.AND, yytext(), yyline, yycolumn ); }
'<' { return new Yytoken( sym.LS, yytext(), yyline, yycolumn ); }
\<\= { return new Yytoken( sym.LE, yytext(), yyline, yycolumn ); }
== { return new Yytoken( sym.EQ, yytext(), yyline, yycolumn ); }
\!= { return new Yytoken( sym.NEQ, yytext(), yyline, yycolumn ); }
> { return new Yytoken( sym.GR, yytext(), yyline, yycolumn ); }
>= { return new Yytoken( sym.GE, yytext(), yyline, yycolumn ); }

// Separatori
\( { return new Yytoken( sym.OBR, yytext(), yyline, yycolumn ); }
\) { return new Yytoken( sym.CBR, yytext(), yyline, yycolumn ); }
\{ { return new Yytoken( sym.OCBR, yytext(), yyline, yycolumn ); }
\} { return new Yytoken( sym.CCBR, yytext(), yyline, yycolumn ); }
; { return new Yytoken( sym.SEMIC, yytext(), yyline, yycolumn ); }
, { return new Yytoken( sym.COMMA, yytext(), yyline, yycolumn ); }
\. { return new Yytoken( sym.DOT, yytext(), yyline, yycolumn ); }

// Kljucne reci
{slovo}+ { return getKW(); }

// Identifikatori
({slovo}|_)({slovo}|{cifra}|_)* { return new Yytoken(sym.ID, yytext(),yyline, yycolumn ); }

// Konstante
0#o[0-7]+ { return new Yytoken(sym.CONST, yytext(),yyline, yycolumn ); } // Oktalni brojevi
0#x({cifra}|[a-fA-F])+ { return new Yytoken(sym.CONST, yytext(),yyline, yycolumn ); } // Heksadecimalni brojevi
(0#d)?{cifra}+ { return new Yytoken(sym.CONST, yytext(),yyline, yycolumn ); } // Dekadni brojevi
0\.{cifra}*(E(\+|-){cifra}+)? { return new Yytoken(sym.CONST, yytext(),yyline, yycolumn ); } // Float vrednosti
'.' { return new Yytoken(sym.CONST, yytext(),yyline, yycolumn ); } // Karakter
true|false  { return new Yytoken(sym.CONST, yytext(),yyline, yycolumn ); } // Bool vrednosti

// Greska
. { if (yytext() != null && yytext().length() > 0) System.out.println( "ERROR: " + yytext() ); }
