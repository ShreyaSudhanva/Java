import java.util.Scanner;
import java.lang.Math;
class cnum
{
	int s=0;
	int s2=0;
	void add(int w,int x,int y,int z)
	{
	s=w+y;
	s2=x+z;
	System.out.println("the addition of 2 complex numbers is: "+s+" + "+s2+"i");
	}
	void add(int x,int y)
	{
	s2=x+y;
	System.out.println("the addition of 2 complex numbers is: "+s2+"i");
	}
}
class complex
{
	public static void main(String args[])
	{
	cnum ob=new cnum();
	ob.add(10,5,15,20);
	ob.add(10,15);
	}
}