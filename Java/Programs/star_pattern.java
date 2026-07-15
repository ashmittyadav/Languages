import java.util.Scanner;
class first
{
    public static void main(String args[])
    {
        int i,j,a,k;
        Scanner in=new Scanner(System.in);
        a=in.nextInt();
        for(i=0;i<=a;i++){
            for(j=1;j<=a-i;j++){
                System.out.print("*");
            }
        System.out.println(" ");
        }
          for(i=0;i<=a;i++){
             for(j=1;j<=i+1;j++){
            System.out.print("*");
        }
        System.out.println(" ");
            }
            
        }
        
    }
