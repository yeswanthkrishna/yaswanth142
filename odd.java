/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i,n1,n2;
		Scanner scan=new Scanner(System.in);
		n1=scan.nextInt();
		n2=scan.nextInt();
		for(i=n1+1;i<n2;i++)
		{
			if(i%2!=0)
			System.out.println(i);
		}
	}
}
