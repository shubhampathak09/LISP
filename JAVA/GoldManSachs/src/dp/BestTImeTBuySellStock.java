package dp;

import java.util.Scanner;

public class BestTImeTBuySellStock {
	
	public static int maxprofit()
	{
		
		return 0;
	}
	
	public static void main(String[] args)
	{
	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			
			a[i]=sc.nextInt();
			
		}
		
		
	 int lsf=Integer.MAX_VALUE;
	 
	 int opf=0;   /// profit overall 
	 int pist=0;   // current days profit
	 
	 for(int i=0;i<n;i++)
	 {
		 if(a[i]<lsf)
		 {
			 lsf=a[i];
		 }
		 pist=a[i]-lsf;
		 if(opf<pist)
		 {
			 opf=pist; // obverall profit;
		 }
	 }
	 
	 System.out.println(opf);
	 
	}

}
