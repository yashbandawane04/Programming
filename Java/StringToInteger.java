public class StringToInteger {
    public static void main(String[] args) {
        String str = "123";
        
        // Using valueOf()
        Integer num1 = Integer.valueOf(str);
        
        // Using parseInt()
        Integer num2 = Integer.parseInt(str);
        
        System.out.println("Using valueOf(): " + num1);
        System.out.println("Using parseInt(): " + num2);
    }
}
