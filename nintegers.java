/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i,j,n,t;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int k[]=new int[10];
		for(i=0;i<n;i++)
		k[i]=s.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(k[i] > k[j])
				{
					t=k[i];
					k[i]=k[j];
					k[j]=t;
				}
			}
		}
		for(i=0;i<n;i++)
		System.out.println(k[i]+" ");
	}
}
