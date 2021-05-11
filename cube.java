/*Create a class of objects CUBE. Develop an application to read the side for three cubes and
print the Volume and outer area. */
import java.util.*;


class CUBE
{
    int length;
    CUBE(int length)
    {
        this.length=length;
    }

    void volume()
    {
        int vol;
        vol=length*length*length;
        System.out.println("Volume is : "+vol);
    }

    void area()
    {
        int a;
        a=6*length*length;
        System.out.println("Outer area is : "+a);
    }
}

class cube
{
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);

        CUBE c[]=new CUBE[3];
        int length,i;
        for( i=0;i<3;++i)
        {
            c[i]= new CUBE(0);
        }

        for(i=0;i<3;++i)
        {
            System.out.println("Enter the length of cube  "+(i+1));
            c[i].length = s.nextInt();
        }

        for(i=0;i<3;++i)
        {
            System.out.println("-----------------------------");
            System.out.println("Cube "+(i+1)+" : ");
            c[i].volume();
            c[i].area();
        }
    }
}