
public class checkforLeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int y=2024;
		
		
		
		if((y%4==0) && (y%100!=0) || (y%400==0)) {
			
			System.out.println("Leap year");
		}
		else {
			System.out.println("Not a Leap year");
		}

	}

}
