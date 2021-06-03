package dp;

import java.util.Arrays;
import java.util.Scanner;

public class RussianDollEnvelope {

	
	
	static class Envelope implements Comparable<Envelope>
	{
		int h;
		int w;
		
		Envelope(int w,int h)
		{
			this.w=w;
			this.h=h;
		}
		
		public int compareTo(Envelope o)
		{
			return this.w-o.w;
		}
	}
	
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int n=Integer.parseInt(sc.nextLine());
		
		Envelope[] envelop=new Envelope[n];
		
		
		for(int i=0;i<n;i++)
		{
			String line=sc.nextLine();
			String[] parts=line.split(" ");
			int w=Integer.parseInt(parts[0]);
			int h=Integer.parseInt(parts[1]);
			
			 envelop[i]=new Envelope(w,h);
		}
		Arrays.sort(envelop);
		
		
		int[] dp=new int[n];
		
		int ovmax=0;
		
		for(int i=0;i<n;i++)
		{
			
			int mx=0;
			
			for(int j=0;j<i;j++)
			{
				
				if(envelop[j].h<envelop[i].h&&envelop[j].w<envelop[i].w)
				{
					mx=Math.max(mx, dp[j]);
				}
			}
			dp[i]=1+mx;
			if(dp[i]>ovmax)
				ovmax=dp[i];
		}
		
		System.out.println(ovmax);
	}
	
}
