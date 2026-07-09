import java.util.*;
public class hollowsquare {
    public static void main(String[] args) {
        int i,j;
        System.out.print("Enter the no of rows = ");
        Scanner sc = new Scanner (System.in);
        int r = sc.nextInt(); 
        for(i = 1; i <= r ; i++){
            for(j = 1; j <= r; j++){
                if(i == 1 || i == r || j == 1 || j == r){
                    System.out.print("* ");
                }
                // else {
                //     if(j == 1 || j == r){
                //         System.out.print("* ");
                    // }
                    else{
                    System.out.print("  ");
                     }
            }
            System.out.println("");
        }
    }
}



