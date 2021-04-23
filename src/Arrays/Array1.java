package Arrays;

public class Array1 {

	public static void main(String[] args) {
		//method 1
		int[] a=new int[10];
		a[0]=11;
		a[1]=12;
		a[2]=13;
		a[3]=14;
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		//method 2
				int[] a1= {11,12,13,14,15};
				
				for(int i=0;i<a1.length;i++)
				{
					System.out.print(a1[i]+",");
				}
		
	}

}
