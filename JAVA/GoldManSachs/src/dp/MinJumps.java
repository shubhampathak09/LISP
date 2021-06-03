package dp;

public class MinJumps {

	public static void main(String[] args)
	{
//		
//		int[] arr= {1,3,6,1,0,9};
//		
//		
//		Integer[]dp=new Integer[arr.length+1];
//		
//		
//		dp[arr.length]=1;
//		
//		
//		int n=arr.length;
//		
//		for(int i=n-1;i>=0;i--)
//		{
//			
//			if(arr[i]>0)
//			{
//				int min=Integer.MAX_VALUE;
//				for(int j=1;j<=arr[i];j++)
//				{
//					if(i+j<dp.length&&dp[i+j]!=null)
//					{
//						min=Math.min(min, dp[i+j]);
//					}
//				}
//				dp[i]=1+min;
//			}
//			
//		}
//		
//		System.out.println(dp[0]);
//		
//	}
	
		
		int[] a= {1,3,6,1,0,9};
		
		Integer[] dp=new Integer[a.length];
		
		      int n=dp.length;
	          dp[n-1]=0;
		
		
	         for(int i=n-2;i>=0;i--)
	         {
	        	 
	        	 if(a[i]>0)
	        	 {
	        		 int min=Integer.MAX_VALUE;
	        		 for(int j=1;j<=a[i];j++)
	        		 {
	        			 if(i+j<n&&dp[i+j]!=null)
	        			 {
	        				 min=Math.min(min, dp[i+j]);
	        			 }
	        		 }
	        		 
	        		 if(min!=Integer.MAX_VALUE)
	        		 {
	        			 dp[i]=1+min;
	        		 }
	        		 else
	        		 {
	        			 dp[i]=null;
	        		 }
	        	 }
	        	 
	         }
	         
	         System.out.println(dp[0]);
	}
	
}
