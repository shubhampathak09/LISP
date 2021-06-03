package dp;

public class MinCostPath {

	
	public static int mcp(int[][] matrix)
	{
		int ans=0;
		
		
		int[][] dp=new int[matrix.length][matrix[0].length];
		
		int n=dp.length;
		int m=dp[0].length;
	    
		dp[n-1][m-1]=matrix[matrix.length-1][matrix[0].length-1];
		
		
		for(int i=m-2;i>=0;i--)
		dp[n-1][i]=matrix[n-1][i]+dp[n-1][i+1];
		
		for(int i=n-2;i>=0;i--)
		dp[i][n-1]=matrix[i][n-1]+dp[i+1][n-1];
			
		
		for(int i=n-2;i>=0;i--)
		{
			for(int j=n-2;j>=0;j--)
			{
			 
					dp[i][j]=Math.min(dp[i+1][j+1], Math.min(dp[i+1][j], dp[i][j+1]))+matrix[i][j];
	 
				
			}
		}
		
		ans=dp[0][0];
		
		return ans;
	}
	
	public static void main(String[] args)
	{
		
		
		
		int[][] cost= {{1,2,3},{4,8,2},{1,5,3}};
		 
		
		int result=mcp(cost);
		
		
		System.out.println(result);
		
	}
}
