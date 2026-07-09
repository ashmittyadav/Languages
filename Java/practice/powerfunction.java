// wap to enter two numbers by user and write a function to find he value of one number raised to the power of anorther x^n
import java.util.Scanner;
public class powerfunction {
    public static void main(String[] args) {
        int x,n;
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the base : ");
            x = sc.nextInt();
            System.out.print("Enter the power : ");
            n = sc.nextInt();
        }
        double result = power(x, n);
        System.out.println(result);
    }
    public static double power(int x, int n) {
        double pow = Math.pow(x, n);                // Math.pow(base,power)  is used for find power of any number
        return pow;
    }
}
