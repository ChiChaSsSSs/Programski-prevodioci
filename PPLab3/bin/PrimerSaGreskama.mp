main() {
    int a, b
	a = 5;
	b = 10;
	loop (a && b) 
	{
		a = a;
		redo (a != b);
		b = b;
	}
}