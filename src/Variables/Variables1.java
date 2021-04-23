package Variables;

public class Variables1 {
	int a=10;
	static int b=20,n;
	public void a() {
		int c=30;
		System.out.println(a+b);
		System.out.println(a+c);
		System.out.println(n);
	}
	public void b() 
	{
	
		a=40;
		System.out.println(a);
	}
	public static void main(String[] args) {
		Variables1 v=new Variables1();
		v.a();
		v.b();
		

	}

}
