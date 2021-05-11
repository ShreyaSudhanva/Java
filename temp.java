//to record temperatures for 6 days in 5 cities and find the city and day from the highest and lowest recorded temperature.

import java.util.Scanner;


class temp
{
    public static void main(String args[])
    {
        int i,j;
        int temp[][]=new int[5][6];
        int day=0;
        int d=0;
        String city[]= new String[5];
        int max;
        int min;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the name of 5 cities:");
        for(i=0;i<5;++i)
            city[i]=s.nextLine();
        for(i=0;i<5;++i)
        {
            System.out.println("Enter temperatures for "+city[i]+":\n");
            for(j=0;j<6;++j)
            {
                System.out.println("Enter temperature for day "+(j+1)+":");
                temp[i][j]=s.nextInt();
            }
        }

        for(i=0;i<5;++i)
        {
            max=temp[0][0];
            for(j=0;j<6;++j)
            {
                if(temp[i][j]>max)
                {
                    max=temp[i][j];
                    day=j;
                    d=i;
                }
            }
            System.out.println("Max Temp for "+city[d]+" is "+temp[d][day]+" on day "+(day+1));
        }
        
        for(i=0;i<5;++i)
        {
            min=temp[0][0];
            for(j=0;j<6;++j)
            {
                if(temp[i][j]<min)
                {
                    min=temp[i][j];
                    day=j;
                    d=i;
                }
            }
            System.out.println("Min Temp for "+city[d]+" is "+temp[d][day]+" on day "+(day+1));
        }
        
    }
}