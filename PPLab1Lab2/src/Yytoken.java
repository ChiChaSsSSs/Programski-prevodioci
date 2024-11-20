class Yytoken {
	public int index;
	public String text;
	public int line;
	public int colon;
	
	public Yytoken(int i, String t, int l, int c) {
		index = i;
		text = t;
		line = l;
		colon = c;
	}

	public String toString() {
		return "Index: : " + index 
				+ "\nText : " + text 
				+ "\nLine : " + line 
				+ "\nColon. : " + colon;
	}
}