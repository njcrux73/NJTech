package taskb22026;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner inputnumbers = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int uno = inputnumbers.nextInt();

        System.out.println("Enter the second number: ");
        int dos = inputnumbers.nextInt();
        
        System.out.println("Enter the third number: ");
        int tres = inputnumbers.nextInt();

        if (uno == dos && dos == tres) {
            System.out.println("All numbers are equal.");
        } 
        else if (uno > dos && uno > tres) {
            System.out.println("The largest number is: " + uno);
        } 
        else if (dos > uno && dos > tres) {
            System.out.println("The largest number is: " + dos);
        } 
         else {
            System.out.println("The largest number is: " + tres);
        }

         inputnumbers.close();
    }
}
