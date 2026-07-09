import java.util.Scanner;
public class function{
    public static void main(String[] args) {
        sum();  
        int ans = sum2();
        System.out.println(ans);
    }
    static int sum2(){
        Scanner in=new Scanner(System.in);
    System.out.print("Enter number 1 = ");
    int a=in.nextInt();
    System.out.print("Enter number 2 = ");
    int b=in.nextInt();
    int sum = a+b;
    return sum;
    }
    static void sum(){
    Scanner in=new Scanner(System.in);
    System.out.print("Enter number 1 = ");
    int a=in.nextInt();
    System.out.print("Enter number 2 = ");
    int b=in.nextInt();
    int sum = a+b;
    System.out.println("the sum is = " +sum);
}
}