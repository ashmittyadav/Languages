import java.util.Scanner;
public class butterfly {
    public static void main(String[] args) {
        int n,i,j,k,l,m;
        System.out.print("Enter the number of rows = ");
        try(Scanner in = new Scanner(System.in)){
            n = in.nextInt();
        }
        for(i = 1 ; i <= n ; i++){
            for(j = 1 ; j <= i ; j++){
                System.out.print("* ");
            }
            for(l = 1; l <= 2*(n-i);l++){
                System.out.print("  ");
            }
            //  for(m = 1; m <= n-i;m++){
            //     System.out.print("  ");
            // }
                for(k = 1;k <= i; k++){
                    System.out.print("* ");
            }
            System.out.println("");
        }
        for(i = 0; i < n ; i++){
            for(j = 1 ; j <= n-i; j++){
                System.out.print("* ");
            }
            for(k = 1; k <= 2*i; k++){
                System.out.print("  ");
            }
            // for(l = 1; l < i; l++){
            //     System.out.print("  ");
            // }
            for(m = 1; m <= n-i; m++){
                System.out.print("* ");
            }
            System.out.println("");

        }
    }
}
