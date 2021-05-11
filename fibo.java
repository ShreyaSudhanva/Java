import java.util.Scanner;

class fibo
{
    public static void main(String args[])
    {
        int n,i,a,b,sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of 'n':");
        n=sc.nextInt();
        a=0;
        b=1;
        System.out.println("Fibonacci series:");
        System.out.println(a);
        System.out.println(b);
        for(i=0;i<n-2;++i)
        {
            sum=a+b;
            System.out.println(sum);
            a=b;
            b=sum;
        }
    }
}