import java.util.Stack;
import java.util.HashMap;
import java.io.IOException;

public class SyntaxTable {
	private static final int ACCEPT = 0;
	private static final int POP = -1;
	private static final int ERROR = -2;
	private Stack<Integer> s;
	private int [][] table;
	private HashMap<Integer, int[]> smene;
	private MPLexer lexer;
	private boolean greska, prepoznat;
	private Yytoken nextToken;
	
	public SyntaxTable(MPLexer l) {
		try {
			s = new Stack<Integer>();
			s.push(TableSymbols.EOF);
			s.push(TableSymbols.RedoLoop);
			smene = Smene.tabelaSmena;
			lexer = l;
			greska = prepoznat = false;
			nextToken = lexer.next_token();
			initiateTable();
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	private void initiateTable() {
		table = new int[20][13];
		
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 13; j++) {
					table[i][j] = ERROR;
			}
		}	
		
		table[0][0] = 1;
		table[1][9] = 2;
		table[1][10] = 2;
		table[2][7] = 3;
		table[2][2] = 4;
		table[2][4] = 4;
		table[2][5] = 4;
		table[3][9] = 5;
		table[3][10] = 5;
		table[4][8] = 6;
		table[4][2] = 7;
		table[4][4] = 7;
		table[4][5] = 7;
		table[4][7] = 7;
		table[5][9] = 8;
		table[5][10] = 9;
		table[6][0] = 10;
		table[6][9] = 11;
		
		for (int i = 0; i <= 11; i++)
			table[i + 7][i] = POP;
		table[19][12] = ACCEPT;
	}
	
	public boolean analyseSyntax() {
		try {
			do {
				int stackID = s.peek() - 1;
				int inputID = nextToken.index;
				if (stackID < 0 || stackID > 19 || inputID < 0 || inputID > 12)
					break;
				switch(table[stackID][inputID]) {
				case POP:
					System.out.println("Uspesno prepoznato: " + nextToken.text);
					s.pop();
					nextToken = lexer.next_token();
					break;
				case ACCEPT:
					prepoznat = true;
					break;
				case ERROR:
					greska = true;
					break;
				default:
					int sledecaSmena = table[stackID][inputID];
					s.pop();
					int[] zaStek = smene.get(sledecaSmena);
					for (int i = zaStek.length - 1; i >= 0; i--)
						s.push(zaStek[i]);
				}
			} while(!(prepoznat || greska));
		}
		catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		return prepoznat;
	}
}
