import java.util.*;
import java.lang.*;
import java.io.*;

class sum
{
    public static void main(String arg[])	
	{
                  int n,sum=0;
                  
                  Scanner sc=new Scanner(System.in);
                   n=sc.nextInt();
                   int a[]=new int[n]; 
	  
                   for(int i=0;i<n;i++)
                   {      
	             System.out.println((i+1));
                           a[i]=sc.nextInt();
                   }
                   for(int i=0;i<n;i++)
                   {
                           sum+=a[i];
                   }  	    
                   System.out.println(sum);                  
              	}
} 
