//program for a simple calculator
import java.util.Scanner;
class xyz
{
    public static void main(String args[])
    {
        String str,f;
        char ch;
        int l,i,m=0;
        Scanner in=new Scanner(System.in);
        str=in.nextLine();
        l=str.length();
        for(i=0;i<l;i++)
        {
            ch=str.charAt(i);
            if( ch=='a' ||  ch=='e' ||  ch=='i' ||  ch=='o' ||  ch=='u' || ch=='A' ||  ch=='E' ||  ch=='I' ||  ch=='O' ||  ch=='U')

            System.out.println("vowels="+ch);
            else
            System.out.println("consonant="+ch);
        }
        if(ch==f.chartAt(0))
        {
            m++;
        }
        System.out.println(f+"="+m);
    }
}
// incompleteeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee