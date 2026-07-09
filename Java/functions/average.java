import java.util.Scanner;
public class average {
    public static void main(String[] args) {
        int num1,num2,num3;
        try(Scanner sc = new Scanner(System.in)){
        System.out.print("enter first number: ");
        num1 = sc.nextInt();
        System.out.print("enter second number: ");
        num2 = sc.nextInt();
        System.out.print("enter third number: ");
        num3 = sc.nextInt();
        }
        int av = avg(num1,num2,num3);
        System.out.println("Average of three numbers="+av);
    }
    public static int avg(int a, int b, int c) {
        int d = (a+b+c)/3;
        return d;
    }
}
