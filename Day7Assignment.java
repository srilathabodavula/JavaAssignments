import java.util.ArrayList;
import java.util.Comparator;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Day7Assignment {

	
	
	public Day7Assignment(String fname, String lname, float d) {
		
		// TODO Auto-generated constructor stub
		String firstname = fname;
		String lastname = lname;
		float gpascore = d;
		
		
	}
	
	
		// TODO Auto-generated method stub
				
		
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day7Assignment p1 = new Day7Assignment("Srilatha", "Bodavula", 7.5f);
		Day7Assignment p2 = new Day7Assignment("Steve", "McGhee", 9.5f);
		Day7Assignment p3 = new Day7Assignment("abcd", "xyz", 6.5f);
		Day7Assignment p4 = new Day7Assignment("abcd", "xyz", 6.5f);
		ArrayList<Object> student = new ArrayList<>();
		student.add(p1);
		student.add(p2);
		student.add(p3);
		student.add(p4);
		System.out.println(student.get(3).equals(p4));
		
	//	System.out.println(student.get(0).;
		System.out.println(p1.toString().indexOf(2));
		
		System.out.println(p1.hashCode());
		
		
		
		
		
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
