import java.util.Scanner;
class rightmirror
{
    public static void main(String args[])
    {
        int i,j,a,k;
        System.out.print("Enter the no:");
        Scanner in=new Scanner(System.in);
        a=in.nextInt();
        for(i=0;i<=a;i++){
            for(j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(k=1;k<=a-i;k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
         for(i=1;i<=a;i++){
            for(j=1;j<=a-i;j++){
                System.out.print(" ");
            }
            for(k=1;k<=i;k++){
                System.out.print("*");
    }
     System.out.println(" ");
}
    }
}