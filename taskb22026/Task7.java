package taskb22026;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner inputnum = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int uno = inputnum.nextInt();

        System.out.println("Enter the second number: ");
        int dos = inputnum.nextInt();

        System.out.println("Addition: " + add(uno, dos));
        System.out.println("Subtraction:" + subtract(uno, dos));
        System.out.println("Multiplication: " + multiply(uno, dos));
        System.out.println("Division: " + divide(uno, dos));
        inputnum.close();
    }
        public static int add(int u, int d) {
            return u + d;
        }
        public static int subtract(int u, int d) {
            return u - d;
        }
        public static int multiply(int u, int d) {
            return u * d;
        }
        public static int divide(int u, int d) {
            if (d != 0) {
                return u / d;
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                return 0; // Return a default value or handle it as needed  
                   
              
            }
        }
    }

    

    

