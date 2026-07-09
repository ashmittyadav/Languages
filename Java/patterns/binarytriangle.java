import java.util.Scanner;
public class binarytriangle {
    public static void main(String[] args) {
        int n;
        System.out.print("enter the number of rows = ");
        try(Scanner in=new Scanner(System.in)){
        n = in.nextInt();
        }
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                if((i+j)%2 == 0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println("");
        }
    }
}
