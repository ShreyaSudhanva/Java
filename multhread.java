class newThread implements Runnable
{
    String name;
    Thread t;

    newThread(String threadname)
    {
        name=threadname;
        t=new Thread(this, name);
        System.out.println("New thread: "+t);
        t.start();
    }
public void run()
{
    try{
        for(int i=5;i>0;--i)
        {
            System.out.println(name+" : "+i);
            Thread.sleep(1000);
        }
    }
    catch(Exception e)
    {
        System.out.println(name+" Interrupted");
    }
    System.out.println(name+" exiting");
}
}

class multhread
{
    public static void main(String args[])
    {
        new newThread("one");
        new  newThread("Two");
        new newThread("Three");

        try{
            Thread.sleep(10000);
        }
        catch(Exception e)
        {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Exit main the");
    }
}