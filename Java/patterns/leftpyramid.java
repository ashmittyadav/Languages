import java.util.*;
public class leftpyramid {
    public static void main(String[] args) {
        int i,j,a;
        System.out.print("Enter the rows = ");
        Scanner in=new Scanner(System.in);
        a = in.nextInt();
        for(i = 1; i <= a ; i++){
            for(j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
