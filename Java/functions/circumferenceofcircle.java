// program to take input of radius and give circumference as output
import java.util.Scanner;
public class circumferenceofcircle {
    public static void main(String[] args) {
        double r;
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the radius of circle : ");
            r = sc.nextDouble();
        }   
        double circum = circumference(r);
        System.out.println("Circumferece of circle is = "+circum);
    }
    public static double circumference(double a) {
        double circum = 2*3.14*a;
        return circum;
    }
}
