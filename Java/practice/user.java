// wap to enter the numbers till user wants and at the end it display number of positive, negative and zeroes
import java.util.Scanner;  // importing scanner =package from util library for input
public class user {
    public static void main(String[] args) {
        int a;
        int zeroes = 0;
        int positive = 0;
        int negative = 0;
        int i = 1;
        do {
            Scanner sc = new Scanner(System.in); 
            System.out.print("Enter the number : ");
            a = sc.nextInt();               // taking input
            if(a == 0) {
                zeroes++;           // counting zeroes
            }
            else if(a > 0) {
               positive++;          // counting positive numbers
            }
            else {
               negative++;          // counting negative numbers
            }
            System.out.print("do you want to continue (yes/no) = ");        //askinmg user to continue or end inputs
            String choice = sc.next();
            if(choice.equals("yes")) {                          // check if user want to continue
                i++;                                            
            }
            else {
                i = 0;
            }
        }while(i != 0 );                                // if condition true no further input would be taken
        System.out.println("Number of zeroes = "+zeroes);                   // printing number of zeroes
        System.out.println("Number of positive numbers = "+positive);       // printing number of positive numbers
        System.out.println("Number of negative numbers = "+negative);       // printing number of negative numbers
            
        }
    }
