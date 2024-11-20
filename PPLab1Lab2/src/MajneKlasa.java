import java.io.*;

public class MajneKlasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			if (args.length == 0)
				throw new Exception("Nema argumenti!");
			else
			{
				Reader r = new FileReader(args[0]);
				SyntaxTable st = new SyntaxTable(new MPLexer(r));
				if (st.analyseSyntax())
					System.out.println("Prepoznavanje uspesno!");
				else
					System.out.println("Prepoznavanje neuspesno!");
			}
		}
		catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
