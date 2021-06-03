package dp;

public class BuySellStackWithInfiTransactionsAndCoolDown {

	
	public static int solve(int[] a)
	{
		
		int bst=-1*a[0];
		int sst=0;
		int cstate=0;
		
		for(int i=1;i<a.length;i++)
		{
			
			
			int cbst=Math.max(bst, cstate-a[i]);
			int csst=Math.max(sst, a[i]+bst);
			int ccstate=Math.max(cstate, sst);
			
			bst=cbst;
			sst=csst;
			cstate=ccstate;
			
		}
		
		
		return Math.max(bst, Math.max(sst, cstate));
	}
	
	
	
	public static void main(String[] args)
	{
		
		int[]a= {1,2,3,0,2};
		
		int ans=solve(a);
		
		System.out.println(ans);
		
	}
}
