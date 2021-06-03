package dp;

public class BestTImeBuySellStockKTransactions {

	
	public static void main(String[] args)
	{
		
		int[] prices= {3,2,6,5,0,3};
		
		int k=2;
		
		int n=prices.length;
		
		// findtransactions
		
		int dp[][]=new int[k+1][n];
		
		
		for(int t=1;t<=k;t++)
		{
			
			for(int d=1;d<n;d++)
			{
				
				dp[t][d]=dp[t][d-1];
				int ans=0;
				for(int i=0;i<d;i++)
				{
					ans=Math.max(ans, dp[t-1][i]+prices[d]-prices[i]);
				}
				dp[t][d]=Math.max(ans, dp[t][d]);
			}
		}
		
		int result=dp[k][n-1];
		
		System.out.println(result);
		
	}
	
	
	
	
}
