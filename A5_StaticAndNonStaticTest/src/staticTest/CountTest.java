package staticTest;

public class CountTest {
public static int i=0;//non static->111

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CountTest a = new CountTest();
CountTest b = new CountTest();
CountTest c = new CountTest();
a.count();
b.count();
c.count();
	}

	public void count() {
		
	  i=i+1;
		System.out.println(i);
	}
	
}
