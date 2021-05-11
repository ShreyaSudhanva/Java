//merge sort of array

import java.util.Scanner;

class merge_sort
{
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		int a[]=new int[5];
		int b[]=new int[5];
		int i,o,n,m,k,j;
		System.out.println("Enter the number of elements for array A: ");
		m=s.nextInt();
		System.out.println("Enter the number of elements for array B: ");
		n=s.nextInt();
		System.out.println("Enter the elements of array A: ");
		for(i=0;i<m;++i)
			a[i]= s.nextInt();
		System.out.println("Enter the elements of array B: ");
		for(i=0;i<n;++i)
			b[i]= s.nextInt();
		o=m+n;
		int c[]=new int[o];
		i=0;
		j=0;
		for(k=0;k<o;++k)
		{
				if(i==m)
				{
					c[k]=b[j];
					++j;
				}
				else if(j==n)
				{
					c[k]=a[i];
					++i;
				}
				
				else if(a[i]<b[j])
				{
					c[k]= a[i];
					i++;
				}
					
				else
				{
					c[k]=b[j];
					j++;
				}
			
		}
		
		System.out.println("Array C: ");
		for(i=0;i<o;++i)
			System.out.println(c[i]);
		System.out.println("\n");
			
	}
}

