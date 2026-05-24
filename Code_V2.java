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
    public double exp(double a, double b)
    {
        s = Math.pow(a,b);
        return s;
    }
    public static void main(String[]args)
    {
        double n,s=0.0;
        char ch,choice,choice1;
        Code_V2 ob = new Code_V2();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        n = sc.nextDouble();
        s+=n;
        outer:
        for(int i=2;i>1;i++)
        {
            System.out.print("Enter your choice (+,-,*,/*,%,^): ");
            ch = sc.next().charAt(0);
            if(ch=='^')
            {
                System.out.print("Enter the power: ");
                n = sc.nextDouble();
            }
            else
            {
                System.out.print("Enter the next num: ");
                n = sc.nextDouble();
            }
            switch(ch)
            {
                case '+':
                    s = ob.sum(s,n);
                    break;
                case '-':
                    s = ob.sub(s,n);
                    break;
                case '*':
                    s = ob.mult(s,n);
                    break;
                case '/':
                    s = ob.divq(s,n);
                    break;
                case '%':
                    s = ob.divr(s,n);
                    break;
                case '^':
                    s = ob.exp(s,n);
                    break;
                default:
                    System.out.println("Wrong Input");
                    System.out.println("+,-,*,/,%");
            }
            System.out.println();
            System.out.println("Result: "+s);
            System.out.print("Want to continue(y/n): ");
            choice = sc.next().charAt(0);
            if(choice == 'y' || choice == 'Y')
            {
                System.out.print("Want to continue with the same result (y/n): ");
                choice1 = sc.next().charAt(0);
                if(choice1=='y' || choice1=='Y')
                    continue outer;
                else if(choice1 =='n' || choice1 =='N')
                {
                    System.out.print("Enter a num: ");
                    n = sc.nextDouble();
                    s=0.0;
                    s+=n;
                }
            }
            else if(choice=='n' || choice=='N')
            {
                System.out.print("Final result: "+s);
                break outer;
            }
            else 
            {
                System.out.println("Wrong Input");
                System.out.print("Want to continue(y/n): ");
                choice = sc.next().charAt(0);
                if(choice == 'y'|| choice == 'Y')
                    continue;
                else
                    break outer;

            }
        }
        sc.close();
    }
}
