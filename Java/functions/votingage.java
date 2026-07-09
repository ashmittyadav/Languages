import java.util.Scanner;
public class votingage {
    public static void main(String[] args) {
        int n;
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the age of person : ");
            n = sc.nextInt();
        }
        voting(n);
    }
    public static int voting(int a) {
        if(a > 18) {
            System.out.println("Person is capable for voting");
        }
        else {
            System.out.println("Person is not eligible for voting");
        }
        return a;
    }
}
