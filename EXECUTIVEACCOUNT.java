import java.util.Scanner;
import java.lang.String;
class account
{
	
	String name;
	String accnum;
	String acctype;
	double balance ;

	Scanner inp = new Scanner(System.in);
	
	account(double balance)
	{
		this.balance = balance;
	}

	void input()
	{
		System.out.println("Enter the Account holder name: ");
		name = inp.nextLine();
		System.out.println("Enter the account type: ");
		acctype = inp.nextLine();
		System.out.println("Enter account number: ");
		accnum = inp.next();
		System.out.println("***************************************************");
		
	}

	void deposit()
	{
		double dep;
		System.out.println("Enter the amount to be deposited:");
		dep = inp.nextDouble();
		balance += dep;
	}
	void withdraw()
	{
		double amt;
		System.out.println("Enter the amount to be withdrawn:");
		amt = inp.nextDouble();
		if(amt > balance)
			System.out.println("Insufficient balance");
		else
			balance -= amt;
	}
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Account Number: "+accnum);
		System.out.println("Account Type: "+acctype);
		System.out.println("Balance: "+balance);

	}
}
class EXECUTIVEACCOUNT
{
	public static void main(String args[])
	{
		int i,ch;
		char flag ;
		Scanner sc = new Scanner(System.in);

		account a[] = new account[5];

		System.out.println("Enter 5 account holders information: ");

		for(i=0; i<5; i++)
		{
			a[i] = new account(0.0);
			a[i].input(); 
		}

		while(true)
		{
			System.out.println("*************MAIN MENU**************\n1.Display \n2.Deposit\n3.Withdrawal\n4.EXIT\n");
			ch = sc.nextInt();
			switch(ch)
			{
				case 1: 
						System.out.println("Enter account number: ");
						String acc = sc.next();
						flag = 'N';
						for (i=0;i<5 ;i++ ) 
						{
							if(acc.equals(a[i].accnum))
							{
								flag = 'Y';
								a[i].display();
								break;
							}
						}
						if(flag == 'N')
						{
							System.out.println("Invalid account number :((");
						}
							break;
						

				case 2: 
						System.out.println("Enter account number: ");
						acc = sc.next();
						flag = 'N';
						for (i=0;i<5 ;i++ ) 
						{
							if(acc.equals(a[i].accnum))
							{
								flag = 'Y';
								a[i].deposit();
								break;
							}
						}
						if(flag == 'N')
						{
							System.out.println("Invalid account number :((");
							
						}
						break;
						

				case 3: 
						System.out.println("Enter account number: ");
						acc = sc.next();
						flag = 'N';
						for (i=0;i<5 ;i++ ) 
						{
							if(acc.equals(a[i].accnum))
							{
								flag = 'Y';
								a[i].withdraw();
								break;
							}

						}
						
						if(flag == 'N')
						{
							System.out.println("Invalid account number :((");
							
						}
						break;
						
						
				default : System.exit(0);


			}
		}
	}
}