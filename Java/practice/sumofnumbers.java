import java.util.*;
public class sumofnumbers {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        System.out.print("Enter a number = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of first "+n+" numbers is "+sum);
        while(i <= n){
            sum = sum + i;
            i++;
        }
        System.out.println("Sum of first "+n+" numbers is "+sum);
        i = 1;
        sum = 0;
        do{
            sum = sum + i;
            i++;
        } while(i <= n);
        System.out.println("Sum of first "+n+" numbers is "+sum);
    }
}
