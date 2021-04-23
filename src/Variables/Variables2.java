
package Variables;

public class Variables2 {
//Difference between static and instance variable
	int  a=10;
	static int b=20;
	public static void main(String[] args) {
		Variables2 v=new Variables2();
		System.out.println(v.a);
		System.out.println(Variables2.b);
		System.out.println();
		v.a=30;
		Variables2.b=40;
		System.out.println(v.a);
		System.out.println(Variables2.b);
		System.out.println();
		Variables2 v1=new Variables2();
		System.out.println(v1.a);
		System.out.println(Variables2.b);
	
		
	}

}
