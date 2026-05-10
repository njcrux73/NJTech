package taskb22026;

public class Task8 {
public static void main(String[] args) {
    int parameters = add(4, 5, 10);
    System.out.println("The Sum of all parameters is: " + parameters);
} 
public static int add (int... numbers) {
    int total = 0;
    for (int num : numbers) {
    int cumulative = 0;

    for (int i = 1; i <= num; i++){
        cumulative += i;
    }
    total += cumulative;

    }
    return total;

} }
