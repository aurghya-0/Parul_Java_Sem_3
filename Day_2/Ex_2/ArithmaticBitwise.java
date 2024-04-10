public class ArithmaticBitwise {
    public static void main(String[] args) {
        // Arithmetic Operations
        int a = 10;
        int b = 5;
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        System.out.println("Arithmetic Operations:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        // Bitwise Operations
        int x = 5; // binary: 0101
        int y = 3; // binary: 0011
        int bitwiseAnd = x & y;
        int bitwiseOr = x | y;
        int bitwiseXor = x ^ y;
        int bitwiseNotX = ~x;
        int leftShift = x << 1;
        int rightShift = x >> 1;

        System.out.println("\nBitwise Operations:");
        System.out.println("Bitwise AND: " + bitwiseAnd);
        System.out.println("Bitwise OR: " + bitwiseOr);
        System.out.println("Bitwise XOR: " + bitwiseXor);
        System.out.println("Bitwise NOT of x: " + bitwiseNotX);
        System.out.println("Left Shift of x: " + leftShift);
        System.out.println("Right Shift of x: " + rightShift);
    }
}
