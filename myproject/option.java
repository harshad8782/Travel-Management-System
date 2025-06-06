package myproject;
import java.util.*;
import java.io.*;
public class option
{
	public void way(int i) 
	{ 
	System.out.println("Press 1 :- By Roadway");
        System.out.println("Press 2 :- By Railway");
        System.out.println("Press 3 :- By Airway"); 
        Scanner d = new Scanner(System.in);
        switch(i)
        {
            case 1:
            {
                System.out.println("\t\t\t\t\t !!!...You Selected By Roadway...!!!"); 
                System.out.println("Press 1 :- By Car"); 
                System.out.println("Press 2 :- By Bus");
                int j = d.nextInt();
                if(j == 1)
                {
                    System.out.println("\t\t\t\t\t     We will Rent a car for You");
                    System.out.println("Press 1 :- For Micro car");
                    System.out.println("Press 2 :- For Sedan car");
                    System.out.println("Press 3 :- For SUV car"); 
                    int z = d.nextInt();
                    if(z == 1)
                        {
                            System.out.println("We Rented a Micro Car for You");
try
{    
File f=new File("d:\\project.txt");    
PrintWriter pw = new PrintWriter(new FileOutputStream(f,true));
pw.append("Roadway,Micro Car"+","); 
pw.close();   
}
catch(Exception m)
{
}
                        }
                    else if(z == 2)
                        {
                            System.out.println("We Rented a Sedan Car for You");
try
{    
File f=new File("d:\\project.txt");    
PrintWriter pw = new PrintWriter(new FileOutputStream(f,true));
pw.append("Roadway,Sedan Car"+","); 
pw.close();   
}
catch(Exception m)
{
} 
                        }
                    else
                        {
                            System.out.println("We Rented a SUV Car for You");
try
{    
File f=new File("d:\\project.txt");    
PrintWriter pw = new PrintWriter(new FileOutputStream(f,true));
pw.append("Roadway,SUV Car"+","); 
pw.close();   
}
catch(Exception m)
{
}
                        } 
                }
                else
                {
                    System.out.println("\t\t\t\t\t  We will Book a Bus Ticket for You");
                    System.out.println("Press 1 :- For Seating Coach");
                    System.out.println("Press 2 :- For Sleeping Coach");
                    int k = d.nextInt();
                    if(k == 1)
                    {
                        System.out.println("We Booked a Seating Coach Bus Ticket");
try
{    
File f=new File("d:\\project.txt");    
PrintWriter pw = new PrintWriter(new FileOutputStream(f,true));
pw.append("Roadway,Seating Bus"+","); 
pw.close();   
}
catch(Exception m)
{
}
                    }
                    else
                    {
                        System.out.println("We Booked a Sleeping Coach Bus Ticket");
try
{    
File f=new File("d:\\project.txt");    
PrintWriter pw = new PrintWriter(new FileOutputStream(f,true));
pw.append("Roadway,Sleeping Bus"+","); 
pw.close();   
}
catch(Exception m)
{
}
                    }
                }
                break;
            }
            case 2:
            {
                System.out.println("\t\t\t\t\t !!!...You Selected by Railway...!!!");
                System.out.println("\t\t\t\t\tWe will Book a Railway Ticket for You");
                System.out.println("Press 1 :- For AC Train");
                System.out.println("Press 2 :- For NON-AC Train");
                int t = d.nextInt();
                if (t == 1)
                {
                System.out.println("Press 1 :- Intercity SF Express - 12127");
                System.out.println("Press 2 :- Deccan Queen - 11007");
                int o = d.nextInt();
                    if(o == 1)
                    {
                    System.out.println("We Booked a Intercity SF Express - 12127 AC Train Ticket for You");
try
{    
File f=new File("d:\\project.txt");    
PrintWriter pw = new PrintWriter(new FileOutputStream(f,true));
pw.append("Railway,Intercity SF Express - 12127 AC Train"+","); 
pw.close();   
}
catch(Exception m)
{
}
                    }
                    else
                    {
                    System.out.println("We Booked a Deccan Queen - 11007 AC Train Ticket for You");
try
{    
File f=new File("d:\\project.txt");    
PrintWriter pw = new PrintWriter(new FileOutputStream(f,true));
pw.append("Railway,Deccan Queen - 11007 AC Train"+","); 
pw.close();   
}
catch(Exception m)
{
}
                    }
                }
                else
                {
                    System.out.println("Press 1 :- City SF Express - 12129");
                    System.out.println("Press 2 :- Deccan Express - 11013");
                    int o = d.nextInt();
                    if(o == 1)
                        {
                            System.out.println("We Booked a City SF Express - 12129 NON-AC Train Ticket for You");
try
{    
File f=new File("d:\\project.txt");    
PrintWriter pw = new PrintWriter(new FileOutputStream(f,true));
pw.append("Railway,City SF Express - 12129 NON-AC Train"+","); 
pw.close();   
}
catch(Exception m)
{
}
                        }
                        else
                        {
                            System.out.println("We Booked a Deccan Express - 11013 NON-AC Train Ticket for You");
try
{    
File f=new File("d:\\project.txt");    
PrintWriter pw = new PrintWriter(new FileOutputStream(f,true));
pw.append("Railway,Deccan Express - 11013 NON-AC Train"+","); 
pw.close();   
}
catch(Exception m)
{
}
                        }
                    }
            break;
            }
            case 3:
            {
                System.out.println("\t\t\t\t\t !!!...You Selected by Airplane...!!!");
                System.out.println("\t\t\t\t\t  We will Book a Plane Ticket for You");
                System.out.println("Press 1 :- For Business Class");
                System.out.println("Press 2 :- For Normal Class");
                int p = d.nextInt();
                if(p == 1)
                {
                    System.out.println("Press 1 :- IndiGo");
                    System.out.println("Press 2 :- Air India");
                    System.out.println("Press 2 :- GoAir");
                    int q = d.nextInt();
                    if(q == 1)
                    {
                        System.out.println("We Booked a IndiGo Business Class Plane Ticket for You");
try
{    
File f=new File("d:\\project.txt");    
PrintWriter pw = new PrintWriter(new FileOutputStream(f,true));
pw.append("Airway,IndiGo Business Class Plane"+","); 
pw.close();   
}
catch(Exception m)
{
}
                    }
                    else if(q == 2)
                    {
                        System.out.println("We Booked a Air India Business Class Plane Ticket for You");
try
{    
File f=new File("d:\\project.txt");    
PrintWriter pw = new PrintWriter(new FileOutputStream(f,true));
pw.append("Airway,Air India Business Class Plane"+","); 
pw.close();   
}
catch(Exception m)
{
}
                    }
                    else
                    {
                        System.out.println("We Booked a GoAir Business Class Plane Ticket for You");
try
{    
File f=new File("d:\\project.txt");    
PrintWriter pw = new PrintWriter(new FileOutputStream(f,true));
pw.append("Airway,GoAir Business Class Plane"+","); 
pw.close();   
}
catch(Exception m)
{
}
                    }
                }
                else
                {
                    System.out.println("Press 1 :- IndiGo");
                    System.out.println("Press 2 :- Air India");
                    System.out.println("Press 2 :- GoAir");
                    int w = d.nextInt();
                    if(w == 1)
                    {
                        System.out.println("We Booked a IndiGo Normal Class Plane Ticket for You");
try
{    
File f=new File("d:\\project.txt");    
PrintWriter pw = new PrintWriter(new FileOutputStream(f,true));
pw.append("Airway,IndiGo Normal Class Plane"+","); 
pw.close();   
}
catch(Exception m)
{
}
                    }
                    else if(w == 2)
                    {
                        System.out.println("We Booked a Air India Normal Class Plane Ticket for You");
try
{    
File f=new File("d:\\project.txt");    
PrintWriter pw = new PrintWriter(new FileOutputStream(f,true));
pw.append("Airway,Air India Normal Class Plane"+","); 
pw.close();   
}
catch(Exception m)
{
}
                    }
                    else
                    {
                        System.out.println("We Booked a GoAir Normal Class Plane Ticket for You");
try
{    
File f=new File("d:\\project.txt");    
PrintWriter pw = new PrintWriter(new FileOutputStream(f,true));
pw.append("Airway,GoAir Normal Class Plane"+","); 
pw.close();   
}
catch(Exception m)
{
}
                    }
                }
            break;
            }
                
            default:
            {
                System.out.println("Entered Option is INVALID...???");
            }
        }
	}

}