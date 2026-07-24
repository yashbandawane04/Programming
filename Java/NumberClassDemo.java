public class NumberClassDemo {
    public static void main(String[] args) {
        Integer num = 100;
        
        byte b = num.byteValue();
        short s = num.shortValue();
        int i = num.intValue();
        long l = num.longValue();
        float f = num.floatValue();
        double d = num.doubleValue();
        
        System.out.println("Byte value: " + b);
        System.out.println("Short value: " + s);
        System.out.println("Int value: " + i);
        System.out.println("Long value: " + l);
        System.out.println("Float value: " + f);
        System.out.println("Double value: " + d);
    }
}
