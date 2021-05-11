import java.util.Scanner;
import java.lang.Math;
class demo
{
	double a, v;
	demo()
	{
		a = 0.0;
		v = 0.0;
	}

	void cal(int n)
	{
		
		System.out.println("Area of square:"+(n*n));
		System.out.println("*******************************************");
	}
	void cal(int l, int b)
	{
		System.out.println("Area of rectangle:"+(l*b));
		System.out.println("*******************************************");
	}
	void cal(int x,int y,int z)
	{
		double t;
		t = (x+y+z)/2.0;
		System.out.println("Area of triangle:"+ (Math.sqrt(t*(t-x)*(t-y)*(t-z))));
		System.out.println("*******************************************");

	}
	void cal(double n)
	{
		System.out.println("Area of cube:"+(6*n*n));
		System.out.println("Volume of cube:"+(n*n*n));
		System.out.println("*******************************************");

	}
	void cal(double l, double w, double h)
	{
		v = l*w*h;
		a = 2*(l*w + l*h + w*h);
		System.out.println("Volume of cuboid:"+v);
		System.out.println("Area of cuboid:"+a);
		System.out.println("*******************************************");


	}
	void cal(double r, double h)
	{
		a = 2*3.14*r*(r+h);
		v = 3.14*r*r*h;
		System.out.println("Area of cyclinder:"+a);
		System.out.println("Volume of cyclinder:"+v);
		System.out.println("*******************************************");
		
	}

}
class overload
{
	public static void main(String args[])
	{
		demo d = new demo();
		d.cal(5);
		d.cal(3,4);
		d.cal(3,4,5);
		d.cal(6.3);
		d.cal(2.4,6.4,3.7);
		d.cal(2.6,5.5);
	}
}
		
		
		
		
	
