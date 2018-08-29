/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int max=0;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[10];
		for(int i=0;i<=n;i++)
		{
			a[i]=s.nextInt();
		}
		int i=0;
		int j=n-1;
		while(i<=j)
		{
			if(a[i]<a[j])
			{
				max=a[j];
				i++;
			}
			else
			{
				max=a[i];
				j--;
			}
			System.out.println(max);
		}
	}
}
