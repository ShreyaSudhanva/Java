/*10. The annual examination results of 20 students are to be tabulated as follows:
Roll No. Subjec-1 Subject-2 Subject 3
Develop an application to read the data and determine the following:
a) Total marks obtained by each student.
b) The highest marks in each subject and the Roll No. of the student who
secured it.
c) The student who obtained the highest total marks.*/

import java.util.Scanner;


class results
{
    Scanner s=new Scanner(System.in);
    int marks[]=new int[3];
    int rollno;
    int total=0;
    results(int rollno)
    {
        this.rollno=rollno;
    }

    void read()
    {
        int i;
        System.out.println("Enter marks in three subjects: ");
        for(i=0;i<3;++i)
            marks[i]=s.nextInt();
    }

    void calc()
    {
        int i;
        for(i=0;i<3;++i)
        {
            total+=marks[i];
        }
        System.out.println("Total : "+total);
    }

}

class exam
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        results r[]=new results[20];
        //int rollno;
        int j,i;
        //int max[]=new int[3];
        int max;
        int m=0;
        int temp=0;
        for(i=0;i<20;++i)
            r[i]=new results(0);

        for(i=0;i<20;++i)
        {
            System.out.println("------------------------------------------");
            System.out.println("Enter roll number of student "+(i+1)+" : ");
            r[i].rollno=s.nextInt();
            //r[i].results(rollno);
            r[i].read();
            r[i].calc();
        }
        System.out.println("\n\n");
        System.out.println("\n\tRoll no.\tsubject 1\tsubject 2\tsubject 3\tTotal");
        System.out.println("----------------------------------------------------------------------------------");
        for(i=0;i<20;++i)
        {
            
            System.out.println("\t"+r[i].rollno+"\t\t"+r[i].marks[0]+"\t\t"+r[i].marks[1]+"\t\t"+r[i].marks[2]+"\t\t"+r[i].total);
        }
        System.out.println("\n");
        for(i=0;i<3;++i)
        {
            max=r[0].marks[0];
            for(j=0;j<20;++j)
            {
                if(r[j].marks[i]>max)
                {
                    max=r[j].marks[i];
                    m=j;
                }
            }
            System.out.println("Highest marks in subject "+(i+1)+" is "+max+" by roll number "+r[m].rollno);
        }

        max=r[0].total;
        for(j=0;j<20;++j)
        {
            if(r[j].total>max)
            {
                max=r[j].total;
                temp=j;

            }
        }
        System.out.println("Roll number of the student who obtained the highest total marks is "+r[temp].rollno+" with marks "+max);
    }
}