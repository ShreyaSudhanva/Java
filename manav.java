/*import java.util.Scanner;

class manav
{
    public static void main(String args[])
    { 
        int n;
        Scanner s= new Scanner(System.in);
        System.out.println("Hello");
        System.out.println("Enter value of n");
        n=s.nextInt();
        System.out.println("n: "+n);
    }
} */


import java.io.*;

import java.util.*;

class String1()

{

String str,str3;

BufferedReader br;

StringTokenizer stk;

String str1[];

String str2[];

String vowel[];

int i,j,k,len,x=0,y=0,z=0;

String1()

{

str1=new String [10];

str2=new String [10];

vowel=new String [200];

br=new BufferedReader(new InputStreamReader(System.in));

}

public void take()throws IOException

{

System.out.println(“Enter the paragraph of sentences:”);

str=br.readLine();

str=str.substring(0,str.length()-1);

stk=new StringTokenizer(str,”!?”,true);

while(stk.hasMoreTokens())

{

str1[x++]=stk.nextToken();

}

for(i=0;i< x;i++)

{

str=str1[i];

stk=new StringTokenizer(str," ");

y=0;

while(stk.hasMoreTokens())

{

str2[y++]=stk.nextToken();

}

for(j=0;j< y-1;j++)

{

for(k=j+1;k0)

{

str3=str2[j];

str2[j]=str2[k];

str2[k]=str3;

}

}

}

for(j=0;j< y;j++)

{

vowel[z++]=str2[j];

System.out.print(" "+str2[j]);

}

y=0;

}

System.out.println(".");

System.out.println("\nVowels:");

for(j=0;j< z;j++)

{

str=vowel[j].trim().toUpperCase();

if(str.charAt(0)=='A' ||str.charAt(0)=='E' ||str.charAt(0)=='I' ||str.charAt(0)=='O' ||str.charAt(0)=='U')

System.out.print(vowel[j]+" ");

}

}

public static void main(String args[])throws IOException

{

String1 ob=new String1();

ob.take();

}

}