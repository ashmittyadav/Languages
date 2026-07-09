import java.util.Scanner;
public class numberleftdownpyramid {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter the number of rows = ");
        try (Scanner in = new Scanner(System.in)) {
            n=in.nextInt();
        }
        for(int i = 0; i < n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
}
