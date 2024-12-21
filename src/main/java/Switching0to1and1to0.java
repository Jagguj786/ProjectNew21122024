
public class Switching0to1and1to0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {1,0,0,0,1,1,1,0};
		int n=array.length;
		//System.out.println(n);
		
		for(int p=0;p<=n-1;p++) {
			
			System.out.print(" "+array[p]);
			
			}
		
		for(int i=0;i<=n-1;i++) {
			
			if(array[i]==0) {
				array[i]=1;
			}
			else if(array[i]==1) {
				array[i]=0;
			}
			else {
				array[i]=array[i];
			}
		}
		
		System.out.println();
		
		for(int k=0;k<=n-1;k++) {
		//System.out.println(" ");	
		System.out.print(" "+array[k]);
		}
		
	}

}
