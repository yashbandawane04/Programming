public class IntegerWrapperDemo {
    public static void main(String[] args) {
        Integer num = Integer.valueOf(100);
        int n = num.intValue(); // Unboxing
        System.out.println("Value of num: " + num);
        System.out.println("Unboxed value: " + n);

        // Using some Integer methods
        System.out.println("Binary representation of 100: " + Integer.toBinaryString(num));
        System.out.println("Number of bits in 100: " + Integer.bitCount(num));
        System.out.println("Max value of Integer: " + Integer.MAX_VALUE);
        System.out.println("Min value of Integer: " + Integer.MIN_VALUE);
    }
}
