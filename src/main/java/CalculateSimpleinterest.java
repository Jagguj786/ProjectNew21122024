import java.util.Scanner;

public class CalculateSimpleinterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		 Scanner input = new Scanner(System.in);

		 System.out.print("Enter principal amount");
         double principal = input.nextDouble();

		 System.out.print("ENter Rate of Interest");
         double rate = input.nextDouble();

		 System.out.print("Enter time period in years");
		 double time = input.nextDouble();

		 double simpleInterest = (principal * rate * time) / 100;

		 System.out.println("Simple Interest: " + simpleInterest);

		 input.close();
	}

}
