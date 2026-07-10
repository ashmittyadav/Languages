#programe to determine positive negative numbers
import java.util.Scanner;
class abc{
    public static void main(String args[])
    {
        int a;
        Scanner in=new Scanner(System.in);
        a=in.nextInt();
        if(a>=0)
        System.out.println("positive");
        else
        System.out.println("negative");
    
    }
}   