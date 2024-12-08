package SymbolTable;

public class Type extends SymbolNode {
	public static int INTEGER = 0;
	public static int FLOAT = 1;
	public static int CHARACTER = 2;
	public static int BOOL = 3;
	public static int UNKNOWN = 4;
	public int tkind;
	
	public Type ( String name, 
			int typeKind, 
			SymbolNode next)
	{
		super( name, SymbolNode.TYPE, null, next );
		this.tkind = typeKind;
		this.type = this;
	}
}
