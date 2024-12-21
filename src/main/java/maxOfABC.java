
public class maxOfABC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int a=0,b=0,c=10;
		
		
		if((a>b)&(a>c)) {
			System.out.println("A is the max");
		}
		else if((b>a)&(b>c)) {
			System.out.println("B is the max");
		}
		else if((c>a)&(c>b)) {
			System.out.println("C is the max");
		}
		else {
			System.out.println("atleast any 2 or 3 variables are equal");
		}
	}

}
