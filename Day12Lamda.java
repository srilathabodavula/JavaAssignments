import java.io.FilterInputStream;
import java.rmi.server.Operation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.xml.crypto.dsig.spec.XPathType.Filter;

public class Day12Lamda {

	public Day12Lamda() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> stlist = Arrays.asList("srilatha", "abc", "joe", "Mary", "Kim", "tom", "Dolly","Pet", "David");
		stlist.stream().filter(e->e.length()==3 && e.charAt(0) <= 122).forEach(o->System.out.println(o));
	
		String line = "This is a test";
		
		Character ch;
	ArrayList<Character> arr = new ArrayList<>();
	int i = line.length();
	
	
	//------------- Reading the enter String to a List object .-------------------------------------------
	 for (i=0; i<line.length();i++)
	    {
	    	
			if(line.charAt(i) != ' ')
			
			arr.add(Character.toLowerCase(line.charAt(i)));
	    	
	    }
	 
	 // --------------------------------------- Collecting only distinct value to a list object ----------------------
	 
	 List<Character> arrlist = arr.stream().distinct().collect(Collectors.toList());
	 System.out.println(arrlist);
	
	 // ------ Comparing the distinct character collected in arrlist with the list that has all the characters in arr collection
		
	        
	    		   System.out.println(arrlist.size()); 
	    		   
	    		    
					
	    		for(i=0;i<arrlist.size();i++)
	    		{
	    			ch=arrlist.get(i);
	    			int j =i;
	    			List<Character> abclist = arr.stream().filter(p -> p.equals(arrlist.get(j))).collect(Collectors.toList());
	    			System.out.println(ch+ ":" + abclist.stream().count());
	    			
	    			}
	    		   
	    		   

	
	}
	
	
}
