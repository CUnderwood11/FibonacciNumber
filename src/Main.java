import java.util.Scanner;

/**
 * This class calculates the n-th term of the Fibonacci sequence using recursion.
 */
public class Main {
    /**
     * Calculates the n-th Fibonacci sequence number using recursion
     *
     * @param n The index of the desired Fibonacci number.
     * @return The n-th Fibonacci number.
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

    /**
     * The main method for getting user input and printing the Fibonacci number.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
    int n;
    Scanner scnr = new Scanner(System.in);

    System.out.print("Enter the value of n: ");
    n = scnr.nextInt();

    System.out.println("The " + n + "th term of the Fibonacci sequence is " + fibonacci(n));
    }
}