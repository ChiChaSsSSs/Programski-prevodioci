import java.util.HashMap;

public class Smene {
	public static HashMap<Integer, int[]> tabelaSmena = new HashMap<>();
	
	static {
		tabelaSmena.put(1, new int[] {TableSymbols.loop, TableSymbols.openBracket, TableSymbols.Expression, TableSymbols.closedBracket,
				TableSymbols.openCurlyBracket, TableSymbols.Statement, TableSymbols.redo, TableSymbols.openBracket, TableSymbols.Expression,
				TableSymbols.closedBracket, TableSymbols.semiColon, TableSymbols.Statement, TableSymbols.closedCurlyBracket});
		tabelaSmena.put(2, new int[] {TableSymbols.AndExpression, TableSymbols.ExpressionPrim});
		tabelaSmena.put(3, new int[] {TableSymbols.orSign, TableSymbols.AndExpression, TableSymbols.ExpressionPrim});
		tabelaSmena.put(4, new int[] {});
		tabelaSmena.put(5, new int[] {TableSymbols.Term, TableSymbols.AndExpressionPrim});
		tabelaSmena.put(6, new int[] {TableSymbols.andSign, TableSymbols.Term, TableSymbols.AndExpressionPrim});
		tabelaSmena.put(7, new int[] {});
		tabelaSmena.put(8, new int[] {TableSymbols.ID});
		tabelaSmena.put(9, new int[] {TableSymbols.CONST});
		tabelaSmena.put(10, new int[] {TableSymbols.RedoLoop});
		tabelaSmena.put(11, new int[] {TableSymbols.ID, TableSymbols.EQUAL, TableSymbols.Expression});
	}
}
