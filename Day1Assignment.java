import java.io.*;
public class Day1Assignment {

			
		public static String getName(String myname)
		{
			
			System.out.println(myname);
			return myname+"hi";
				}
		
		public static void setName(String i)
		{
			
			System.out.println(i);
			
				}
		
	

	public static void main(String[] args) {
		
String nameone;
String name = "latha";
nameone = getName(name);
System.out.println(nameone);
setName(nameone);
	}

}
