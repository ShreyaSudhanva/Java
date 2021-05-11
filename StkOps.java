import java.io.*;
import java.util.*;
class StackExc extends Exception
{
    StackExc(String msg)
    {
        super(msg);
    }
}
class Stack
{
    int top;
    int stk[];
    Stack(int size)
    {
        top=-1;
        stk=new int[size];
    }
    public void push(int x) throws StackExc
    {
        if(top==stk.length-1)
        {
            throw new StackExc("Stack Overflow\n");
        }
        stk[++top]=x;
    }
    public int pop() throws StackExc
    {
        int ele;
        if(top==-1)
        {
            throw new StackExc("Stack Underflow\n");
        }
        ele=stk[top];
        top--;
        //display();
        return ele;
    }
    public void display()
    {
        System.out.print("Stack: ");
        for(int i=0;i<=top;i++)
        {
            System.out.print(stk[i]+" ");
        }
        System.out.println("\n");
    }
}

class StkOps
{
    public static void main(String []args)
    {
       
        Scanner sc=new Scanner(System.in);
        int pushele,popele,n,ch;
        System.out.print("Enter size of stack: ");
        n=sc.nextInt();
        Stack s = new Stack(n);
        do
        {
            System.out.println("1-Push\n2-Pop\n3-Exit");
            System.out.println("Enter your choice: ");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    try
                    {
                        System.out.print("Enter the element: ");
                        pushele=sc.nextInt();
                        s.push(pushele);
                        s.display();
                    }
                    catch(StackExc se)
                    {
                        System.out.println("Error: "+se.getMessage());
                    }
                    break;
                case 2:
                    try
                    {
                        popele=s.pop();
                        System.out.println(popele+" has been popped");
                        s.display();
                    }
                    catch(StackExc se)
                    {
                        System.out.println("Error: "+se.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Thank You");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }  
        }while(ch!=3);
        sc.close();
    }
}

