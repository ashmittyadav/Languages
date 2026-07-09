import java.util.Scanner;
public class sumofodd {
    public static void main(String[] args) {
        int n=1;
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the limit: ");
            n = sc.nextInt();
        }
        int sum = sum(n);
        System.out.print("sum of odd numbers from 1 to "+n+" = "+sum);
    }
    public static int sum(int n){
        int sum = 0;
        int r;
        for(int i = 1; i <= n; i++){
            if(i%2 != 0){
                r = i;
                sum = sum + r;
            }
        }
        return sum;
    }
}
