package dp;

public class BuySellStockInfiTransactionAndFee {

	
	
	//  10 15 17 20 16 18 22 20 22 20 23 25
	
	// bsp  ssp
	
	// bsbsb-profit      bsbs ->profit
 	
	// sell stock with transactions fees is 3
	
	// bsp=0  ssp=0
	
	
	public static int solve(int [] a,int k)
	{
		
		int bsp=-1*a[0];  //negetive
		int ssp=0;
		
		
		
		for(int i=1;i<a.length;i++)
		{
			
			int cbsp=Math.max(ssp-a[i],bsp); //bsp
			int cssp=Math.max(ssp,a[i]+bsp-k); //k transaction fee
		    
		   bsp=cbsp;
		   ssp=cssp;
					
		}
		
		
		return Math.max(bsp, ssp);
	}
	
	public static void main(String[] args)
	{
		
		int[]a= {10, 15, 17, 20, 16, 18,22,20, 22, 20, 23, 25};
		
		
		int k=3;
		
		int ans=solve(a,k);
		
		System.out.println(ans);
	}
}
