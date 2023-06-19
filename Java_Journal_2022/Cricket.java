
/*Q.3 Write a java program for a cricket player object. 
The program should accept details of ‘n’ players from user. 
The details of player are Player name, runs, innings-played. 
The program should contain following menu options enter details of player, 
display average runs of single player, sort names of players based on number of runs.
Use array of object and function*/

import java.io.*;
import java.util.*;
class Player
{
int run;
String name;
int pd;
void accept()
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter player name");
	name=scan.next();

	System.out.println("Enter run");
	run=scan.nextInt();
	
	System.out.println("Enter no of innings-played");
	pd=scan.nextInt();

}
void average ()
{
double avg=0;
avg+=(double)run/(double)pd;
System.out.println("Name of player= "+name);
System.out.println("average of player= "+avg);
System.out.println();

}
}

class Cricket

{
public static void main(String args[])
{
	int i;
Scanner scan=new Scanner(System.in);
System.out.println("Enter how many players want");
int n=scan.nextInt();

Player s[]=new Player[n];
	 ;
	  for(;;)
	  {
		System.out.println("1.Enter details of player ");
      System.out.println("2.Display average runs ");
	  System.out.println("3. EXIT...");
      System.out.println("Enter your choice");
	  int ch = scan.nextInt();
	  switch(ch)
	  {
		  case 1:
	for(i=0;i<n;i++)
	{
		s[i]=new Player();		//allocation
		s[i].accept();			//call function
	}
            break;
         case 2:
    for(i=0;i<n;i++)
    {
	    s[i].average();
    }
            break;
        case 3:
        break;
	  }
	  }
}
}


