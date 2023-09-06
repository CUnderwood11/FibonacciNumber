import java.util.Scanner;

public class Main {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

    public static void main(String[] args) {
    int n;
    Scanner scnr = new Scanner(System.in);

    System.out.print("Enter the value of n: ");
    n = scnr.nextInt();

    System.out.println("The " + n + "th term of the Fibonacci sequence is " + fibonacci(n));
    }
}