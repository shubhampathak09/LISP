package dp;

public class GenerateBalancedParantheisis {
	
	
	public static void generate(int op,int cl,String res)
	{
		
		if(op==0&&cl==0)
		{
			
			System.out.println(res);
			return;
			
		}
		
		if(op!=0)
		{
			
			String r1=res;
			r1=r1+'(';
			generate(op-1,cl,r1);
			
		}
		
		// cl op<cl 2 3
		
		if(op<cl)
		{
			String r2=res;
			r2=r2+')';
			generate(op,cl-1,r2);
		}
	}
	
	public static void main(String[] args)
	{
		
		int n=4;
		
		int op=n,cl=n;
		
		String ans="";
		
		generate(op,cl,ans);
		
		
	}

}
