/*HELLO WORLD IN INHERITANCE
 BY SOUMYA CHAKRABORTY*/
class words {
	protected String z;
	public void hello(String x, String y) {
		z = x + " " + y + "!";
		System.out.println(z);
	}
}
public class Main extends words {
	public static void main(String[] args) {
		String a = "Hello";
		String b = "World";
		Main probj = new Main();
		probj.hello(a, b);
	}
} //Hello World!
