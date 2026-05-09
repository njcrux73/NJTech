package taskb22026;

public class Task4 {
    public static void main(String[] args) {
    
        int num = 171;
        int reversed = Integer.parseInt(new StringBuilder(String.valueOf(num)).reverse().toString());
        if (num == reversed) {
            System.out.println("Palindrome!");
        } else {
            System.out.println("Not a palindrome.");
}}}      
    
     /* input:173 
     /output: "Not a palindrome."
     
     /If the input is 171, the output is "Palindrome!"
     */
