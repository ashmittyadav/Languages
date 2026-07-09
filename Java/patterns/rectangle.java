import java.util.*;
public class rectangle {
    public static void main(String[] args) {
        int i,j;
        System.out.print("Enter the no of rows = ");
        Scanner sc = new Scanner (System.in);
        int r = sc.nextInt();  
        System.out.print("Enter the no of columns = ");
        Scanner in = new Scanner (System.in);
        int c = in.nextInt();  
        for(i = 0; i < r; i++){
            for(j = 0; j < c ;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
