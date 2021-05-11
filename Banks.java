import java.io.*;
import java.util.*;
abstract class Bank 
{
    static final String INTL = "INTERNATIONAL", NATL = "NATIONAL";
    static final float INTL_ROI = 0.08f, NATL_ROI = 0.07f;

    String bankName, bankType;
    float roi, minPrincipal = 1000;

    abstract public void getROI();

    public void deposit(Scanner sc) 
    {
        float prin = this.minPrincipal, time, rate, amt, intr;
        System.out.println("Minimum Principal: Rs." + minPrincipal);
        do 
        {
            if (prin < minPrincipal)
                System.out.println("Amount less than minimum");
            
            System.out.print("Enter deposit amount: ");
            prin = sc.nextFloat();
        } while (prin < this.minPrincipal);
        System.out.print("Enter time in years: ");
        time = sc.nextFloat();
        if (time >= 3) 
            rate = this.roi;
        else
            rate = 0.0f;
        amt = (float) (prin * Math.pow((1+rate),time));
        intr = amt - prin;
        System.out.println("Amount: Rs." + amt);
        System.out.println("Interest: Rs." + intr + "\n");
    }
    public boolean offerCC() 
    {
        return this.bankType == Bank.INTL;
    }
    public void display() 
    {
        System.out.println("\nBank: " + this.bankName);
        System.out.println("Type: " + this.bankType);
        System.out.println("Rate of interest: " + (int)(this.roi * 100)+"%");
        if (this.offerCC())
            System.out.println("Credit card: Platinum");
        else
            System.out.println("Credit card: N/A");
    }
}
abstract class NatlBank extends Bank 
{
    NatlBank() 
    {
        bankType = Bank.NATL;
        getROI();
    }
    public void getROI() 
    {
        this.roi = Bank.NATL_ROI;
    }
}
abstract class IntlBank extends Bank
{
    IntlBank() 
    {
        bankType = Bank.INTL;
        getROI();
    }
    public void getROI() 
    {
    
        this.roi = Bank.INTL_ROI;
    }
}
class PNB extends NatlBank 
{
    PNB() 
    {
        bankName = "PNB";
        minPrincipal = 5000;
    }
    public void deposit(Scanner sc) 
    {
        System.out.println("Welcome to " + this.bankName);
        super.deposit(sc);
    }
}
class SBI extends NatlBank 
{
    SBI() 
    {
        bankName = "SBI";
        minPrincipal = 10000;
    }
    public void deposit(Scanner sc) 
    {
        System.out.println("Welcome to " + this.bankName);
        super.deposit(sc);
    }
}
class CreditSuisse extends IntlBank 
{
    CreditSuisse() 
    {
        bankName = "Credit Suisse";
        minPrincipal = 5000;
    }
    public void deposit(Scanner sc) 
    {
        System.out.println("Welcome to " + this.bankName);
        super.deposit(sc);
    }
}
class AmericanExpress extends IntlBank 
{
    AmericanExpress() 
    {
        bankName = "American Express";
        minPrincipal = 20000;
    }
    public void deposit(Scanner sc) 
    {
        System.out.println("Welcome to " + this.bankName);
        super.deposit(sc);
    }
}
public class Banks 
{
    public static void main(String[] args) 
    {
        int ch;
        Scanner sc = new Scanner(System.in);
        PNB pnb = new PNB();
        SBI sbi = new SBI();
        CreditSuisse cs = new CreditSuisse();
        AmericanExpress axp = new AmericanExpress();
        Bank b=pnb;
        System.out.println("Available banks:");
        pnb.display();
        sbi.display();
        cs.display();
        axp.display();
        do 
        {
            System.out.println("\n1-PNB\n2-SBI\n3-Credit Suisse\n4-American Express");
            System.out.print("Select a bank: ");
            ch = sc.nextInt();
            switch (ch) 
            {
                case 1:
                    b = pnb;
                    break;
                
                case 2:
                    b = sbi;
                    break;
                
                case 3:
                    b = cs;
                    break;
    
                case 4:
                    b = axp;
                    break;
            
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (!(ch >= 1 && ch <= 4));
        b.deposit(sc);
        sc.close();
    }
}
