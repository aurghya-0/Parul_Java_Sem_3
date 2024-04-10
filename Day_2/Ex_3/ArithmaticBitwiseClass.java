// ArithmeticOperations class
class ArithmeticOperations {
    public int sum(int a, int b) {
        return a + b;
    }

    public int difference(int a, int b) {
        return a - b;
    }

    public int product(int a, int b) {
        return a * b;
    }

    public int quotient(int a, int b) {
        return a / b;
    }

    public int remainder(int a, int b) {
        return a % b;
    }
}

// BitwiseOperations class
class BitwiseOperations {
    public int bitwiseAnd(int a, int b) {
        return a & b;
    }

    public int bitwiseOr(int a, int b) {
        return a | b;
    }

    public int bitwiseXor(int a, int b) {
        return a ^ b;
    }

    public int bitwiseNot(int a) {
        return ~a;
    }

    public int leftShift(int a, int shift) {
        return a << shift;
    }

    public int rightShift(int a, int shift) {
        return a >> shift;
    }
}

// Main class
public class ArithmaticBitwiseClass {
    public static void main(String[] args) {
        // Create objects of operations
        ArithmeticOperations arithmetic = new ArithmeticOperations();
        BitwiseOperations bitwise = new BitwiseOperations();

        // Perform arithmetic operations
        System.out.println("Arithmetic Operations:");
        System.out.println("Sum: " + arithmetic.sum(10, 5));
        System.out.println("Difference: " + arithmetic.difference(10, 5));
        System.out.println("Product: " + arithmetic.product(10, 5));
        System.out.println("Quotient: " + arithmetic.quotient(10, 5));
        System.out.println("Remainder: " + arithmetic.remainder(10, 5));

        // Perform bitwise operations
        System.out.println("\nBitwise Operations:");
        System.out.println("Bitwise AND: " + bitwise.bitwiseAnd(5, 3));
        System.out.println("Bitwise OR: " + bitwise.bitwiseOr(5, 3));
        System.out.println("Bitwise XOR: " + bitwise.bitwiseXor(5, 3));
        System.out.println("Bitwise NOT of 5: " + bitwise.bitwiseNot(5));
        System.out.println("Left Shift of 5: " + bitwise.leftShift(5, 1));
        System.out.println("Right Shift of 5: " + bitwise.rightShift(5, 1));
    }
}
