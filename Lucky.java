import java.lang.*;
import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Lucky
 {
     int n,l,e,p;
     void input( )
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter Day In Digits :");
           n=sc.nextInt( );
         if(n>0)
         {
             int r,s,p,m;
             r=n/10;
             n=n%10;
             s=n+r;
             p=s%10;
             m=s/10;
             l=p+m; // final value of day
             
         }
         System.out.println(" ");
         System.out.println("Enter Month In Digits :");
         n=sc.nextInt( );
         if(n>0)
         {
             int a,b,c,d;
             a=n/10;
             n=n%10;
             b=a+n;
             c=b%10;
             d=b/10;
             e=c+d; // final value of month
             
         }
         System.out.println(" ");
         System.out.println("Enter Year In Digits :"); 
         n=sc.nextInt( );
         int f,g,h,i,j,k,l;
         f=n/10;
         n=n%10;
         g=f+n;
         h=g%10;
         i=g/10;
         j=h+i;
         k=j%10;
         l=j/10;
         p=k+l; // final value of year
         
         
      }
      
      void display( )
      {
          int x,y,z;
          x = l+e+p;
          y=x%10;
          z=x/10;
          int sum = y+z;
          System.out.println("Your Lucky No. Is :" +sum);
          System.out.println(" ");
          System.out.println("_________________________________");
          System.out.println(" ");
          System.out.println("   ^^^** THANK YOU **^^^");
          System.out.println("_________________________________");
      }
     
     
	public static void main(String[] args) 
	{
		
		System.out.println("_________________________________");
		System.out.println(" ");
		System.out.println("    ^^^** WELCOME **^^^");
		System.out.println("_________________________________");
		System.out.println(" ");
		Lucky obj=new Lucky( );
		obj.input( );
		System.out.println(" ");
		obj.display( );
		
	}
}