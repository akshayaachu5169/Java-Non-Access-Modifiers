package staticTest;

import java.util.Hashtable;

public class StaticTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
add();
//cal();
//sub();
StaticTest1 a = new StaticTest1();//object creation
StaticTest1 b = new StaticTest1();
//StaticTest1 c = new StaticTest1();
b.sub();

a.sub();
//a.add();
	}
public static void add() {
	
	System.out.println("addition");
	}
	public void sub() { 
		System.out.println("subtraction");
		cal();
	}
	public void cal() {
		System.out.println("call");
	}
}



