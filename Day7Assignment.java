

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Day7Assignment {

	
	
	private String fname1;
	private String lname1;
	private float gpaf;


	public Day7Assignment(String fname, String lname, float gpa) {
		
		// TODO Auto-generated constructor stub
		 this.fname1 = fname;
		 this.lname1 = lname;
		 this.gpaf = gpa;
		
		
		
		
	}
	
	
	public String getfname()
	{
		
		return this.fname1;
	}
	public String getlname1()
	{
		
				return this.lname1;
	}
	
	public float getgpaf()
	{
		
		return this.gpaf;
	}
	
	
	
	
		// TODO Auto-generated method stub
				
		
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LinkedList<Day7Assignment> studentlist = new LinkedList<>();
		studentlist.add(new Day7Assignment(" "," ",0));
		studentlist.add(new Day7Assignment("Srilatha", "Bodavula", 7.5f));
		studentlist.add(new Day7Assignment("Steve", "McGhee", 9.5f));
		studentlist.add(new Day7Assignment("abcd", "xyz", 6.5f));
		
		int l = studentlist.size();
		System.out.println(l);
		
		for(int i=0;i<l;i++)
		{
			System.out.println(studentlist.get(i).fname1);
		}
		
		int m=1,j;
		
			for (j=1;j<l;j++)
			{
				m=j+1;
				while(m < l)
				{
			if(studentlist.get(m).gpaf < studentlist.get(j).gpaf)
			{
				
				
				//System.out.println(studentlist.get(m).gpaf);
				//System.out.println(studentlist.get(j).gpaf);
				
				
				 studentlist.set(0, studentlist.get(m));
				 studentlist.set(m, studentlist.get(j));
				 studentlist.set(j, studentlist.get(0));
			//	 System.out.println(studentlist.get(0).gpaf);
				 //studentlist.set(0, null);
				 }
		m++;
			
			}
				
			
			
		}
		
		studentlist.removeFirst();
		
		 	  		 for(m=0; m<studentlist.size();m++)
		 	  		 System.out.println(studentlist.get(m).gpaf);
		 
			 
			
			  
			  
		  
		  
		  
		 

		
		
		
		
		
	ArrayList<String> swapStrings = new ArrayList<>();
	swapStrings.add("Srilatha");
	swapStrings.add("Bodavula");
	
	System.out.println(swapStrings);
	String tmp1 = swapStrings.get(0);
	
	String tmp2 = swapStrings.get(1);
	swapStrings.set(0, tmp2);
	swapStrings.set(1, tmp1);
	System.out.println(swapStrings);
	swapStrings.add("Sanjay");
	swapStrings.add("Suresh");
	System.out.println(swapStrings);
	//deleting the last object in the list
	
	int size = swapStrings.size();
	swapStrings.remove(size-1);
	System.out.println(swapStrings);
	
	
	
	
	
	}
	
	
	
	

	}

		


