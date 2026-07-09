import java.util.Scanner;
public class greater {
    public static void main(String[] args) {
        int num1, num2;
    try(Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        num2 = sc.nextInt();
    }        
    int grt = grt(num1,num2);
    System.out.print("Greater number is "+grt);
    }
    public static int grt(int a, int b) {
        int grt;
        if(a > b) {
            grt = a;
        }
        else {
            grt = b;
                }
                return grt;
    }
}
