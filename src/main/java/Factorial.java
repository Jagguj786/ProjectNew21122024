import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Please enter a number");
     int n = sc.nextInt();
     System.out.println(n);
     //int n=6;
     
     //int factorial = 1;
     
//     for(int i=n;n>0;n--) {
//    	 
//    	 factorial = factorial*n;
//    	 
//     }
     int factorial = 1;
     
     for(int i=1;i<=n;i++) {
    	 
    	 factorial = factorial*i;
    	 
     }
		System.out.println(factorial);
		
	}

}
