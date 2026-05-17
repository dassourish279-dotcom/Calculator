import java.util.Scanner;
class Code_V2
{
    double s=0.0,n;
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        n = sc.nextDouble();
    }
    public double sum()
    {
        s+=n;
        return s;
    }
    public double sutract()
    {
        s-=n;
        return s;
    }
    public double multiply()
    {
        s*=n;
        return s;
    }
    public double div()
    {
        s/=n;
        return s;
    }
}