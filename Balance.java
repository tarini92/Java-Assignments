import java.io.*;
import java.util.*;

public class Balance {

	public static void main(String[] args)
	{
		char c;
		int sq1=0,sq2=0,curl1=0,curl2=0,par1=0,par2=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.next();
		for(int i=0;i<str.length();i++)
		{
		 c = str.charAt(i);
		 switch(c)
		 {
		 case '[' : sq1++;break;
		 case '{' : curl1++;break;
		 case '(' : par1++;break;
		 case ']' : sq2++;break;
		 case '}' : curl2++;break;
		 case ')' : par2++;break;
		 default: System.out.println("Wrong input");
		 }
		 
		}
		if(sq1==sq2 && curl1==curl2 && sq1==sq2)
			System.out.println("Balanced");
		else 
			System.out.println("Not balanced");
		
	}
}
