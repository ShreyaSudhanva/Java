/* 11. Write a program to read a list containing Book Title, Book Code, Cost and Quantity
interactively for min. of 10 books and produce a five column output as shown below.
NAME CODE UNIT PRICE QUANTITY TOTAL PRICE
Define the suitable functions and perform the transactions.*/

import java.util.*;
class info
{
    String title,code;
    int q;
    float cost;
    float total;
    Scanner inp=new Scanner(System.in);
    void read()
    {
        System.out.println("Enter book title: ");
        title=inp.nextLine();
        System.out.println("Enter book code: ");
        code=inp.next();
        System.out.println("Enter cost: ");
        cost=inp.nextFloat();
        System.out.println("Enter quantity: ");
        q=inp.nextInt();
        total=q*cost;
    }
    void display()
    {
        System.out.println(title+" \t\t"+code+"\t"+cost+"\t\t"+q+"\t\t"+total);
    }
}

class book
{
    public static void main(String args[])
    {
        int i,n;
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter number of books: ");
        n=inp.nextInt();
        info ob[]=new info[n];
        for(i=0;i<n;++i)
        {
            ob[i]=new info();
            ob[i].read();
        }
        System.out.println("Name\t\tCode\tUnit price\tQuantity\tTotal cost");
        for(i=0;i<n;++i)
            ob[i].display();
    }
}




