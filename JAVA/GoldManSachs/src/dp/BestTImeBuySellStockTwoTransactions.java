package dp;

public class BestTImeBuySellStockTwoTransactions {

	
	public static void main(String[] args)
	{
		
		
		int a[]= {3,3,5,0,0,3,1,4};
		
		int n=a.length;
		
		
		
		 
		int mxpist=0;
		
		int least=a[0];
		
		int[] dp=new int[n];
		
		dp[0]=0;
		
		for(int i=1;i<n;i++)
		{
			
			
			if(a[i]<least)
			{
				least=a[i];
			}
			
			mxpist=a[i]-least;
			
			if(mxpist>dp[i-1])
			{
				dp[i]=mxpist;
			}
			else
				dp[i]=dp[i-1];
		}
		
		int greater=a[n-1];
		
		int[] dp1=new int[n];
		
		dp[n-1]=0;
		
		int mxpbt=0;
		
		
		for(int i=n-2;i>=0;i--)
		{
		 
			if(a[i]>greater)
			{
				greater=a[i];
			}
			mxpbt=greater-a[i];
			if(mxpbt>dp[i+1])
			{
			dp1[i]=mxpbt;
			}
			else {
				dp1[i]=dp1[i+1];
			}
				
		}
		
		int ans=0;
		for(int i=0;i<n;i++)
		{
			
			ans=Math.max(ans, dp[i]+dp1[i]);
		}
		
		System.out.println(ans);
		
	}
	
}


// good tough question