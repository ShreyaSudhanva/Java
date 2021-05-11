import java.util.Scanner;

class hello
{
    public static void main(String args[])
    { int n;
        Scanner s= new Scanner(System.in);
        System.out.println("Hello");
        System.out.println("Enter value of n");
        n=s.nextInt();
        System.out.println("n: "+n);
    }
}