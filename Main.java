import myproject.*;
import java.util.*;
import java.io.*;

class password extends Exception
{
	public password(String msg)
{
	System.out.println(msg);
}
}

class location 
{
String start, end;
public void getd()
{
	Scanner a = new Scanner(System.in);
	System.out.println("\nEnter the Start Location of Journey :");
	start = a.nextLine();
	System.out.println("Enter the End Location of Journey :");
	end = a.nextLine();
}
public void dis()
{
	System.out.println("Start Location of Journey: " + start );
	System.out.println("End Location of Journey: " + end );
	try
	{    
		File f=new File("d:\\project.txt");    
		PrintWriter pw = new PrintWriter(new FileOutputStream(f,true));
		pw.append(start+","+end+"\n"); 
		pw.close();   
	}
	catch(Exception m)
	{
	}
}
}

class vechile extends location
{
int option;
public void getd()
{
	super.getd();
	Scanner b = new Scanner(System.in);
	System.out.println("");
	System.out.println("\t\t\t\t\t\t ...Choose the Way...");
	System.out.println("Press 1 :- By Roadway");
	System.out.println("Press 2 :- By Railway");
	System.out.println("Press 3 :- By Airway");
	option = b.nextInt();
	option o = new option();
	o.way(option); 
}
public void dis()
{
	super.dis();
}
}

class print extends vechile
{
public void getd()
{
	super.getd();
}
public void dis()
{
	super.dis();
	System.out.println("Thank you");
}
}

class Main 
{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("\t\t\t\t\t   ...Welcome to Tour & Travel ...");
	System.out.println("\t\t\t\t\t             Let's Begin");
	System.out.println("");
	String name, mail, no, g;
	System.out.println("\n\t\t\t\t\t\t    Fill Detail's\n\n");
	System.out.println("Enter Name:");
	name = sc.nextLine();
	System.out.println("Enter Mail ID:");
	mail = sc.nextLine();
	System.out.println("Enter Mobile No.:");
	no = sc.nextLine();
	System.out.println("Enter your Gender.:");
	g = sc.nextLine();
	try
	{    
	File f=new File("d:\\project.txt");    
	PrintWriter pw = new PrintWriter(new FileOutputStream(f,true));
	pw.append(name+","+mail+","+no+","+g+","); 
	pw.close();   
	}
	catch(Exception m)
	{
	}
	print obj = new print();
	obj.getd();
	System.out.println("\nName:" + name);
	System.out.println("Mobile No.:" +  no);
	System.out.println("Mail Address:" + mail);
	obj.dis();

}
}




