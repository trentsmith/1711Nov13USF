package day2demo;

public class ConstructorDemo {

	int x;
	int y;
	int a, b;
	
	//ConstructorDemo cd = new ConstructorDemo();
	public ConstructorDemo() {
		//implicitly calls super();
		x = 0;
		y = 10;
		a = b = 5;
	}
	
	public ConstructorDemo(int x) {
		this.x = x;
	}
	
	public ConstructorDemo(int y, int a, int b) {
		this(10);
		this.y = y;
		this.a = a;
		this.b = b;
	}
	
	public ConstructorDemo(int x, int y, int a, int b) {
		super();
		this.x = x;
		this.y = y;
		this.a = a;
		this.b = b;
	}
}
