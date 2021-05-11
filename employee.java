/*12. Given that an EMPLOYEE class contains the following members:
Members: Employee ID, Employee Name, Department name &amp; Basic Pay
Methods: To read each employee details, to calculate Gross Pay and to print the employee details.
Develop an application to read data of N employees and compute the Gross Pay and Net Pay of each
employee.
Gross Pay = Basic Pay + DA + HRA (DA = 58% of Basic Pay, HRA = 16% of Basic Pay)
Net Pay = Gross – Income Tax
Income Tax calculated as follows:
Gross Pay - Up to 2 lakhs - Nil
Above 2 and up to 3 lakhs - 10% of the Gross Pay
Above 3 and up to 5 lakhs - 15% of the Gross Pay and
Above 5 lakhs 30 % of the Gross Pay, an additional charge of 2% of the tax will be added to total
tax*/

import java.util.Scanner;
class salary
{
	String id, name, dept_name;
	Double basic,gross, net, da, hra, tax ;
	Scanner inp = new Scanner(System.in);

	public static Double i = 100000.0;

	salary()
	{
		gross = net = da = hra = tax = 0.0;
	}

	void read()
	{
		System.out.println("Enter employee name:");
		name = inp.nextLine();
		System.out.println("Enter employee code:");
		id = inp.next();
		System.out.println("Enter department name:");
		dept_name = inp.next();
		System.out.println("Enter basic pay:");
		basic = inp.nextDouble();

	}

	void gross_pay()
	{
		da = basic*0.58;
		hra = basic*0.16;
		gross = basic + da + hra;
	}

	void net_pay()
	{
		if(gross <= 2*i)
			tax = 0.0;

		else if(gross <= 3*i)
			tax = 0.10*gross;

		else if(gross <= 5*i)
			tax = 0.15*gross;

		else
		{
			tax = 0.30*gross;
			tax = tax + tax*0.02 ;
		}
		net = gross - tax;
	}

	void display()
	{
		System.out.println(name+"\t"+id+"\t"+dept_name+"\t"+basic+"\t"+gross+"\t"+net);
	}
}

class employee
{
	public static void main(String args[])
	{	
		int n,i;
		Scanner inp1 = new Scanner(System.in);
		System.out.println(" Enter number of employees:");
		n = inp1.nextInt();
		salary obj[] = new salary[n];
		for( i = 0; i<n; i++)
		{
			obj[i] = new salary();
			obj[i].read();
			obj[i].gross_pay();
			obj[i].net_pay();
		}

		System.out.println("Name\tID\tDepartment    \tBasicPay\tGross    \tNet");
		for(i = 0;i<n;i++)
			obj[i].display();

	}
}