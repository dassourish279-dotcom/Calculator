import java.util.Scanner; //Util import
class Code_V1
{
    public static void main(String[]args)
    {
        double n,s=0.0;
        char ch, choice,choice1;
        Scanner sc = new Scanner(System.in); //Scanner object
        System.out.print("Enter a num: "); 
        n = sc.nextDouble(); //First num input
        s+=n; //Storing
        outer: //Label break
        for(int i=2;i>1;i++) //Infinite loop for continuation
        {
            System.out.print("Enter the next num: ");
            n = sc.nextDouble(); //Num input
            System.out.print("Enter the operator(+,-,*,/): ");
            ch = sc.next().charAt(0); //Operator input
            switch(ch) //Operator choice
            {
                case '+': //Addition
                    s+=n;
                    break;
                case '-': //Substraction
                    s-=n;
                    break;
                case '*': //Multiplication
                    s*=n;
                    break;
                case '/': //Division
                    s/=n;
                    break;
                default:
                    System.out.println(); //Spacing
                    System.out.println("Wrong Operator input"); //Wrong operator input
            }
            System.out.println(); //Spacing
            System.out.println("Result: "+ s);
            System.out.println(); //Spacing on output screen
            System.out.print("Wish to continue? (y/n): ");
            choice = sc.next().charAt(0);
            System.out.println(); //Spacing
            if(choice == 'y' || choice == 'Y') //User wanting to continue
            {
                System.out.println("Enter 'y' to continue with the Final result"); 
                System.out.println("Enter 'n' to restart with new num");
                System.out.print("Enter: ");
                choice1 = sc.next().charAt(0);
                if(choice1=='n' || choice1=='N') //To restart with a new num
                {
                    s=0.0;
                    System.out.print("Enter the next num: ");
                    n = sc.nextDouble();
                    s+=n;
                }
                else if(choice1=='y' || choice1=='Y') //To continue with the last result
                {
                    System.out.println(); //Spacing
                    continue outer;
                }
                else //Wrong input handling
                {
                    System.out.println("Wrong Choice");
                    System.out.println("Enter 'y' to continue with the Final result");
                    System.out.println("Enter 'n' to restart with new num");
                    System.out.print("Enter: ");
                    choice1 = sc.next().charAt(0);
                    if(choice1=='n' || choice1=='N')
                    {
                        s=0.0;
                        System.out.print("Enter a num: ");
                        n = sc.nextDouble();
                        s+=n;
                    }
                    else if(choice1=='y' || choice1=='Y')
                        continue;
                }
                    
            }

            else if(choice == 'n' || choice == 'N') //Program terminating
            {
                System.out.println("Final Result: "+s);
                System.out.print("Program Terminated");
                break outer;
            }

            else //Wrong input handling
            {
                System.out.println("Wrong Input");
                System.out.println("Enter 'y' to continue further ");
                System.out.println("Enter 'n' to exit");
                System.out.println("Result: "+ s);
                System.out.print("Wish to continue (y/n): ");
                choice = sc.next().charAt(0);
                if(choice=='y' || choice=='Y')
                    continue;
                else 
                    break outer;
            }
        }
        sc.close(); //Scanner closing
    }
}