public class IntegerToPrimitive {
    public static void main(String[] args) {
        Integer num = 200;
        
        byte b = num.byteValue();
        short s = num.shortValue();
        double d = num.doubleValue();
        
        System.out.println("Byte value: " + b);
        System.out.println("Short value: " + s);
        System.out.println("Double value: " + d);
    }
}
