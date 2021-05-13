package packageOne;

import java.util.Scanner;

public class ReadAllDataTypes {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a integer number");
		int a=scan.nextInt();
	 System.out.println(a);
	 System.out.println("enter a byte number");
	 byte b=scan.nextByte();
	 System.out.println(b);
	 System.out.println("enter a short number");
	short c=scan.nextShort();
	System.out.println(c);
	System.out.println("enter a long number");
	long d=scan.nextLong();
	System.out.println(d);
	System.out.println("enter a String");
	String s=scan.nextLine();	
	System.out.println(s);
	
	System.out.println("enter a character");
	char e=scan.next().charAt(5);	
	System.out.println(e);
	System.out.println("enter a boolean");
	boolean k=scan.nextBoolean();
	System.out.println(k);
		System.out.println("do you like to eat");
		if(scan.nextBoolean()==true)
		{
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}

}
