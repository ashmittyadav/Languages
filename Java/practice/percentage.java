import java.util.Scanner;
class xyz{
    public static void main(String args[]){
        System.out.println("enter marks");
        Scanner s=new Scanner(System.in);
        System.out.print("marks in hindi:");
        float a=s.nextFloat();
        System.out.print("marks in english:");
        float b=s.nextFloat();
        System.out.print("marks in maths:");
        float c=s.nextFloat();
        System.out.print("marks in science:");
        float d=s.nextFloat();
        System.out.print("marks in pps:");
        float e=s.nextFloat();
        float sum=(a+b+c+d+e)/500;
        float percentage=sum*100;
        System.out.println("percentage="+percentage);
    }
}