// *             *
// * *         * *
// * * *     * * *
// * * * * * * * *
// * * * * * * * *
// * * *     * * *
// * *         * *
// *             *
import java.util.Scanner;
class rightpyramid
{
    public static void main(String args[])
    {
        int i,j,k;
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        for(i = 1; i <= n; i++){
            for(j = 1; j <= n-i;j++){
                System.out.print("  ");
            }
                for(k = 1;k <= i; k++){
                    System.out.print("* ");
            }
            System.out.println(" ");
        }           
        }
    }
    