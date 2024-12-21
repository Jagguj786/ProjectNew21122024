
public class FibanocciSeries {

	  public static void fibanocci(int n) {
		  
		  //int n1=0,n2=1;
		  
		  int[] num = new int[n];
		  
		  num[0]=0;
		  num[1]=1;
		  
		  System.out.println(num[0]);
		  System.out.println(num[1]);
		  
		  for(int i=2;1<=n;i++) {
			  
			
			  
			  num[i] = num[i-2]+num[i-1];
			  
			  System.out.println(num[i]);
		  }
		  
	  }
	  
	  //Or
	  
	  public static void fibanocciOtherApproach() {
		  
		  int n1=0,n2=1,n3,i,count=10;
		  
		  System.out.println(n1);
		  System.out.println(n2);
		  
		  for(i=2;i<count;i++) {
			  
			  n3=n2+n1;
			  
			  System.out.println(n3);
			  n1=n2;
			  n2=n3;
			  
		  }
		  
	  }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FibanocciSeries.fibanocciOtherApproach();
		
		
	}

}
