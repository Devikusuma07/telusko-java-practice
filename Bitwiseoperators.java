public class Bitwiseoperators {
    public static void main(String[] args) {
        int a = 5;  // 0101
        int b = 3;  // 0011

        // Bitwise AND
        int andResult = a & b;  // 0001
        System.out.println("Bitwise AND: " + andResult);

        // Bitwise OR
        int orResult = a | b;  // 0111
        System.out.println("Bitwise OR: " + orResult);

        // Bitwise XOR
        int xorResult = a ^ b;  // 0110
        System.out.println("Bitwise XOR: " + xorResult);

        // Bitwise NOT
        int notResult = ~a;  // 1010
        System.out.println("Bitwise NOT: " + notResult);

        // Left Shift
        int leftShiftResult = a << 1;  // 1010
        System.out.println("Left Shift: " + leftShiftResult);

        // Right Shift
        int rightShiftResult = a >> 1;  // 0010
        System.out.println("Right Shift: " + rightShiftResult);

        //explanation
        /* Bitwise AND: Compares each bit of two numbers and returns a new number with bits set to 1 where both numbers had 1s.
           Bitwise OR: Compares each bit of two numbers and returns a new number with bits set to 1 where either number had a 1.
           Bitwise XOR: Compares each bit of two numbers and returns a new number with bits set to 1 where only one of the numbers had a 1.
           Bitwise NOT: Inverts the bits of a number.
           Left Shift: Shifts the bits of a number to the left, filling with 0s on the right.
           Right Shift: Shifts the bits of a number to the right, filling with 0s on the left.
        */
    }
}
