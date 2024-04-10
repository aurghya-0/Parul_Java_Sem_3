public class Fibonacci {
    // Recursive function to calculate Fibonacci number
    public static int fibonacciRecursive(int n) {
        if (n <= 1)
            return n;
        else
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Non-recursive function to calculate Fibonacci number
    public static int fibonacciNonRecursive(int n) {
        if (n <= 1)
            return n;

        int fib = 1;
        int prevFib = 1;

        for (int i = 2; i < n; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }

        return fib;
    }

    public static void main(String[] args) {
        int n = 10; // Change this value to get the nth Fibonacci number

        // Using recursive approach
        System.out.println("Using Recursive Approach:");
        System.out.println("The " + n + "th Fibonacci number is: " + fibonacciRecursive(n));

        // Using non-recursive approach
        System.out.println("\nUsing Non-Recursive Approach:");
        System.out.println("The " + n + "th Fibonacci number is: " + fibonacciNonRecursive(n));
    }
}
