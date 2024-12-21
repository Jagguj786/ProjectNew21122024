
public class maxOf3Numbers {

	public static void main(String args[]) {
		
		int a=10,b=20,c=10;
		//int num1 =20, num2=300, num3=50;
		int max=0;
		
		max=(a>max)?a:max;
		max=(b>max)?b:max;
		max=(c>max)?c:max;
		
		// or
		 //max = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);


		
		System.out.println(max);
		
	}
}
