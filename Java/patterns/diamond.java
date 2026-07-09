import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        int n,k,i,j;
        System.out.print("Enter the number of rows = ");
        try(Scanner in = new Scanner(System.in)){
            n = in.nextInt();
        }
        for( i = 1; i <= n ; i++){
            for(j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            for(k = 1; k <= i; k++){
                System.out.print("* ");
            }
            for(j=2;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        for(i =0;i<n;i++){
        for(j=1;j<=i;j++){
            System.out.print("  ");
        }
        for(k=1;k<=n-i;k++){
            System.out.print("* ");
        }
        for(j=2;j<=n-i;j++){
            System.out.print("* ");
        }
        System.out.println("");
    }
} 
}


