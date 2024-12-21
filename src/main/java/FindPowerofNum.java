import java.util.Scanner;

public class FindPowerofNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base and power values");
		
		int base=sc.nextInt();
		
		int power=sc.nextInt();
		
		double p = Math.pow(base, power);
		System.out.println(p);
	}

}
