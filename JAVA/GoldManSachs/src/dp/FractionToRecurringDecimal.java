package dp;

import java.util.HashMap;

public class FractionToRecurringDecimal {
	
	
	
	public static void main(String[] args)
	{
		
		
		
		int nume=8;
		int den=3;
		
		
		StringBuilder sb=new StringBuilder();
		
		int q=nume/den;
		int r=nume/den;
		sb.append(q);
		
		if(r==0)
		{
		System.out.print(sb.toString());
		return;
		}
		else
		{
			
			sb.append(".");
			
			r=r*10;
			
			q=r/den;
			r=r%den;
			
			HashMap<Integer,Integer>hm=new HashMap<>();
			
			while(r!=0)
			{
				
				if(hm.containsKey(r))
				{
					int ln=hm.get(r);
					
					sb.insert(ln, "(");
					sb.append(")");
					
					break;
				}
				else
				{
					hm.put(r, sb.length());
					
					r=r*10;
					q=r/den;
					
					r=r%den;
					sb.append(q);
				}
			}
			
			System.out.print(sb);
			return;
		}
		
	}

}
