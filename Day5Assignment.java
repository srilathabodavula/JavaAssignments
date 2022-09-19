import java.util.BitSet;
import java.util.Scanner;

public class Day5Assignment {

	public Day5Assignment() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String personName;
		System.out.println("Enter a name:");
		Scanner s = new Scanner(System.in);
		
		personName = s.next();
		char[] vowelsChar = { 'A', 'E', 'I','O','U','a','e','i','o','u' };
		
		System.out.println("Name is :" + personName);
		
		int vowel=0;
		int len = personName.length();
		for (int i=0;i<len;i++)
		{
			for (int j=0; j<vowelsChar.length; j++)
			{
				if (personName.charAt(i) == vowelsChar[j]) 
			
				vowel++;
			
			}
	}
		System.out.println("Number of vowels is:"+vowel);
	
	int len1 = len-1;
	
		
		for (int n=len; n>0; n--)
			
		{
			System.out.println(personName.charAt(len1));
			len1--;
			
		}
	
	//Sorting numbers
		
		
		int tmpval;
		int[] intArray = new int[]{ 32, 43, 56, 21, 19, 98,35, 10 }; 
		len = intArray.length;
		System.out.println(intArray[2]);
		
		for (int k=0; k<len;k++)
		{
			
			for (int m = 0 ; m<len; m++)
			{
				if (intArray[k] < intArray[m]) {
					tmpval = intArray[m];
					intArray[m] = intArray[k];
					intArray[k] = tmpval;
					
				}
			}
			
		}
		for (int i = 0 ; i<len;i++)
		{
			System.out.println(intArray[i]);
		}
		
		
}
}


