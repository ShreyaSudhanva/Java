//program to count number of votes in an election

import java.util.*;
class election
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //int count[]=new int[6];
        int count[]={0,0,0,0,0,0};
        int i,n,ch;
        System.out.print("Enter number of voters: ");
        n=sc.nextInt();
        //System.out.println("There are 5 candidates contesting");
        for(i=1;i<=n;i++)
        {
            System.out.print("Enter the number on the ballot: ");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                {
                    count[0]+=1;
                    break;
                }
                case 2:
                {
                    count[1]+=1;
                    break;
                }
                case 3:
                {
                    count[2]+=1;
                    break;
                }
                case 4:
                {
                    count[3]+=1;
                    break;
                }
                case 5:
                {
                    count[4]+=1;
                    break;
                }
                default:
                {
                    count[5]+=1;
                    break;
                }
            }
        }
        for(i=0;i<6;i++)
        {
            if(i!=5)
            {
                System.out.println("Candidate "+(i+1)+" got "+count[i]+" votes");
            }
            else
            {
                System.out.println("Number of spoilt ballots: "+count[5]);
            }
        }
        sc.close();
    }
}





























/*import java.util.Scanner;

class election
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int count[]={0,0,0,0,0};
		//int candidate[]=new int[5];
		int choice,n,i,j;
		int spoilt=0;
		System.out.println("Enter number of voters: ");
		n=s.nextInt();
		for(i=0;i<n;++i)
		{
			System.out.println("Voter "+(i+1)+" :");
			System.out.println("Enter your choice:\n1.Shreya\n2.Vivek\n3.Samanvitha\n4.Prahasith\n5.Hubs");
			choice= s.nextInt();
			if(choice>=1&&choice<=5)
				count[choice-1]++;
			else
				spoilt++;
			
		}
		System.out.println("The number of votes for candidates:");
		for(i=0;i<5;++i)
		{
			System.out.println("Votes for candidate "+(i+1)+" : "+count[i]);
		}
		System.out.println("The number of spoilt ballots : "+spoilt);
	}
}*/