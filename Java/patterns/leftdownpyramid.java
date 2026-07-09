import java.util.*;
public class leftdownpyramid {
    public static void main(String[] args) {
        int i,j;
        System.out.print("Enter the no of rows = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(i = 1; i <= n; i++){
            for(j = n ; j >= i; j--){
                System.out.print("* ");
            }
                System.out.println("");
        }
    }   
}
