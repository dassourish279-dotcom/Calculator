/** V0 */
import java.util.Scanner; //importing util
class Code_V0
{
    public static void main(String[]args) //Main function
    {
        double a,b,s=0,t=0;
        Scanner sc = new Scanner(System.in); //Scanner object

        System.out.print("Enter two nums: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        s = a+b; //Addition
        System.out.println("Sum: "+ s);

        System.out.print("Enter two nums: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        s = a-b; //Substraction
        System.out.println("Difference: "+ s);

        System.out.print("Enter two nums: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        s = a*b; //Multiplication
        System.out.println("Product: "+ s);

        System.out.print("Enter two nums: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        s = a/b; //Divison -- Quotient
        t = a%b; //Divison -- Remainder
        System.out.println("Quotient: "+ s);
        System.out.println("Remainder: "+ t);
        
        sc.close(); //Scanner closing
    }
}
