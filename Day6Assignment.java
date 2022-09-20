

public class Day6Assignment {

	public Day6Assignment() {
		// TODO Auto-generated constructor stub
	}

	public void palindrome()
	{
	
		/*Scanner s = new Scanner(System.in);
		System.out.println("Enter a String value");
		String name = s.nextLine();*/
		String name = "ababab";
		
		char ch1, ch2;
		int val = 0;
		int len=name.length();
		
		int k=len/2;
		int pos = len-1;
		System.out.println(" "+k);
		for(int i=0;i<k;i++)
		{
			ch1 = name.charAt(i);
			ch2 = name.charAt(pos);
			if(ch1 == ch2)
			{
				pos--;
			
			}
			else
			{
				val = 1;
			}
			
			
					
					
		}
		if (val == 0)
		System.out.println("It is a palindrome");
		else
			System.out.println("It is not a palindrome");
		}


public static void main(String args[])
{
	Day6Assignment obj1 = new Day6Assignment();
	obj1.palindrome();
	String str = "35";
	int strtoint = Integer.parseInt(str);
    System.out.println(strtoint + " is of type " + ((Object)strtoint).getClass().getSimpleName());  
	
    String line1 = "Hi this is SrILatha123";
    String cmpval = "srilatha";
    String stryes = "yes";
    		String strno = "no";
    String result = (line1.toLowerCase()).contains((cmpval).toLowerCase()) ? stryes : strno ;
    
System.out.println("Contains or not: " + result);



}
}