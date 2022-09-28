import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Consumer;
public class AssignmentsDay10 {
	private String fname1;
	private String lname1;
	private float gpaf;


	public AssignmentsDay10(String fname, String lname, float gpa) {
		
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				
		
LinkedList<AssignmentsDay10> stlist = new LinkedList<>();
stlist.add(new AssignmentsDay10("Srilatha", "Bodavula", 8.9f));
stlist.add(new AssignmentsDay10("Steve", "McGhee", 9.5f));
stlist.add(new AssignmentsDay10("abcd", "xyz", 6.5f));
stlist.add(new AssignmentsDay10("Ajay", "Bippina", 7.6f));
stlist.add(new AssignmentsDay10("Shadman", "Zafar", 5.8f));
stlist.add(new AssignmentsDay10("Mark", "Mitchel", 6.5f));
stlist.add(new AssignmentsDay10("Bonnie", "Bingham", 9.2f));
stlist.add(new AssignmentsDay10("Tom", "Nelson", 8.5f));
stlist.add(new AssignmentsDay10("David", "Jett", 7.5f));


Map< String, AssignmentsDay10> hm = new HashMap<>();

System.out.println(stlist.element().getfname());

//HashMap<String, Object> hashset = new HashMap<>();

for(int i=0;i<stlist.size();i++)
{
	hm.put(stlist.get(i).fname1, stlist.get(i));

	//hashset.put(stlist.get(i).fname1, stlist.get(i));
}

Set<Entry<String, AssignmentsDay10>> hs = hm.entrySet();
for(Map.Entry<String, AssignmentsDay10> student : hs)
{
	AssignmentsDay10 Ad10 = student.getValue();
	
	System.out.println(Ad10.fname1+" "+Ad10.lname1);
}

	}

}
