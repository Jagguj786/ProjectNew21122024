
public class CalculateCompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		double p=10000.5;
		double t=2;
		double r=10.5;
		
		double CI;
		
		CI=p*(Math.pow((1+r/100), t))-p;
		
		System.out.println(CI);
		
		
		
	}

}
