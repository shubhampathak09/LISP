package dp;

import java.util.ArrayList;

public class TestStudent {

	
	static class Student
	{
		
		int rno;
		int ht;
		int wt;
		
		Student(int rno,int ht,int wt)
		{
			this.rno=rno;
			this.ht=ht;
			this.wt=wt;
			
		}
		
		void print(Student s)
		{
			System.out.print(this.rno+" "+this.ht+" "+this.wt);
		}
		
		public String toString()
		{
			
			return this.rno+" "+this.ht+" "+this.wt;
			
		}
		
	}
	
	public static void main(String[] args)
	{
		
		Student[] st=new Student[3];
		
		st[0]=new Student(1,2,3);
		st[1]=new Student(1,2,3);
		st[2]=new Student(1,2,3);
		
		
		for(Student s:st)
		{
			s.print(s);
			System.out.println();
		}
		
		System.out.println(st);  // addresss okay 
		
		
		 ArrayList<Student>ar=new ArrayList<>();
		
		 ar.add(new Student(10,180,74));
		 ar.add(new Student(10,180,85));
		 ar.add(new Student(10,170,89));
		 
		 System.out.println(ar);
		 
	}
}
