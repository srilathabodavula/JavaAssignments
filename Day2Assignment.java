import java.util.Scanner;
import java.io.*;
public class Day2Assignment {

	public Day2Assignment() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name = "Latha";
	    System.out.println("My name is :" + name);
	    //person age
System.out.println("hi");

	    System.out.println("Enter age of " + name);
	    Scanner s = new Scanner(System.in);

	   int age = s.nextInt();
	   System.out.println("Age is :"+age);
	   if (age >= 13 && age <=19)
	       System.out.println("Person is a teen");
	   else if ( age > 19)
	       System.out.println("person is an adult");
	   else
	       System.out.println("Person is a kid");
	   //fizzbuzz pgm

	    System.out.println("Enter a value from 1 to 100");
	    int num = s.nextInt();

	    if (num % 3 == 0 && num % 5 != 0)
	        System.out.println("fizz");
	    else if (num % 5 == 0 && num % 3 != 0)
	            System.out.println("Buzz");
	    else if (num % 3 == 0 && num % 5 == 0)
	            System.out.println("fizzBuzz");
	    // Fibonacci series

	    int n=10;
	    int j=0, tmp1=0, tmp2;
	    for ( int i=1; i<=n; i++)
	    {
	        System.out.println(j);
	        if (j==0)
	        {
	            j=j+1;
	            tmp1 = j;
	        }

	        else {
	            tmp2 = tmp1;
	            tmp1 = tmp2 +j;
	            j = tmp2;
	        }


	    }


	}

	}


