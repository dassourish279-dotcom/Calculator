import java.util.Scanner;
class Code_V2
{
    double s;
    public double sum(double a, double b)
    {
        s = a+b;
        return s;
    }
    public double sub(double a, double b)
    {
        s = a-b;
        return s;         
    }
    public double mult(double a, double b)
    {
        s = a*b;
        return s;
    }
    public double divq(double a, double b)
    {
        s = a/b;
        return s;
    }
     public double divr(double a, double b)
    {
        s = a%b;
        return s;
    }
    public static void main(String[]args)
    {
        double n,s=0.0;
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        n = sc.nextInt();
        s+=n;
        for(int i=2;i>1;i++)
        {
            System.out.print("Enter the next num: ");
            n = sc.nextDouble();
            System.out.print("Enter your choice (+,-,*,/*,%,^): ");
            ch = sc.next().charAt(0);
            switch(ch)
            {
                case '+':

            }
        }
    }
}