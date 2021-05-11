// multilevel inheritence

class A
{
    int i=5,j=10;
    void add()
    {
        int sum;
        sum=i+j;
        System.out.println("Sum is: "+sum);
    }
}
class B extends A
{
    int x;
    void mul()
    {
        x=i*j;
        System.out.println("Product is: "+x);
    }
}

class C extends B
{
    int d;
    void diff()
    {
        d=j-i;
        System.out.println("Difference is: "+d);
    }
}

class multilevel
{
    public static void main(String args[])
    {
        A oba=new A();
        B obb=new B();
        C obc=new C();
        System.out.println("Using object of A :");
        oba.add();
        System.out.println("Using object of B :");
        obb.add();
        obb.mul();
        System.out.println("Using object of C :");
        obc.add();
        obc.mul();
        obc.diff();
    }
}