import java.util.Scanner;
public class rhombus {
    public static void main(String[] args) {
        int n,i,j,k;
        System.out.print("Enter the number of rows = ");
        try(Scanner in = new Scanner(System.in)){
            n = in.nextInt();
        }
        for(i = 1; i <= n; i++ ){
            for(j = 1; j <= n-i ; j++){
                System.out.print("  ");
            }
            for(k = 1 ; k <= n;k++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
