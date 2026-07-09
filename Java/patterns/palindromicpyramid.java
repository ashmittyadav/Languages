import java.util.Scanner;
public class palindromicpyramid {
    public static void main(String[] args) {
        int n,k,i,j;
        System.out.print("Enter the number of rows = ");
        try(Scanner in = new Scanner(System.in)){
            n = in.nextInt();
        }
         for( i = 1; i <= n ; i++){
            for(j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(k = i; k >= 1; k-- ){
                System.out.print(k);
            }
            for(j=2;j<=i;j++){
            System.out.print(j);
        }
            System.out.println("");
        }
}
}
