
public class CalculateAvgUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] num = {10,20,30,42,56};
		
		int n=num.length;
		//System.out.println(n);
		int sum=0;
		for(int i=0;i<=n-1;i++) {
			
			sum=sum+num[i];
		}
		
		double avg=sum/n;
		System.out.println(avg);
	}

}
