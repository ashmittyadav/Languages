// simple calculator
import java.util.Scanner;
class abc
{
    public static void main(String args[])
    {
        int i,j,a,b;
        Scanner in=new Scanner(System.in);
        System.out.println("enter two numbers=");
        a=in.nextInt();
        b=in.nextInt();
        Scanner on=new Scanner(System.in);
        System.out.println("enter the operations-\n1)for addition\n2)for subtraction\n3)for multiplication\n4)for division\n5)for remainder");
        i=on.nextInt();
        switch(i){
            case 1:j=a+b;
            System.out.println("addition="+j);
            break;
            case 2:j=a-b;
            System.out.println("subtraction="+j);
            break;
            case 3:j=a*b;
            System.out.println("multiplication="+j);
            break;
            case 4:j=a/b;
            System.out.println("division="+j);
            break;
            case 5:j=a%b;
            System.out.println("remainder"+j);
            break;
            default:System.out.println("invalid operations");
        }
       
    }
}
