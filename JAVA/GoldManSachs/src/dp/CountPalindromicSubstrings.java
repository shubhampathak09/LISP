package dp;

public class CountPalindromicSubstrings {
	
	
	public static int countpalindromicSubstring(String s)
	{
		int count=0;
		
		int n=s.length();
		
		boolean[][] dp=new boolean[n][n];
		
		int i,j;
		for(int g=0;g<s.length();g++)
		{
			
			
			for(i=0,j=g;j<n;i++,j++)
			{
				
				if(g==0)
				{
					
					dp[i][j]=true;
					
				}else if(g==1)
				{
					if(s.charAt(i)==s.charAt(j))
					{
						dp[i][j]=true;
					}
					
				}else
				{
				
					if(s.charAt(i)==s.charAt(j)&&dp[i+1][j-1]==true)
					{
						dp[i][j]=true;
					}
				}
				
				if(dp[i][j]==true)
					count++;
				
			}
			
		}
		
		
		return count;
	}
	
	
	public static void main(String[] args)
	{
		
		
		
		String str="aaa";
		
		int ans=countpalindromicSubstring(str);
		
		System.out.println("Total palindromic substrings are "+ans);
	}

}
