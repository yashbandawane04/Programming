public class PrimitiveObjectDemo {
    public static void main(String[] args) {
        // Using valueOf() method
        Integer num1 = Integer.valueOf(10);
        
        // Using Autoboxing
        Integer num2 = 20;
        
        // Using parseInt() and then boxing
        Integer num3 = Integer.parseInt("30");
        
        System.out.println("Using valueOf(): " + num1);
        System.out.println("Using Autoboxing: " + num2);
        System.out.println("Using parseInt() and boxing: " + num3);
    }
}
