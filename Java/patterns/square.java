import java.util.*;
public class square {
    public static void main(String[] args) {
        int i,j;
        System.out.print("Enter the no of rows = ");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();  
        for(i = 0; i < n; i++){
            for(j = 0; j < n ;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
