public class CharacterWrapperDemo {
    public static void main(String[] args) {
        char ch = 'A';
        
        System.out.println("Is letter: " + Character.isLetter(ch));
        System.out.println("Is digit: " + Character.isDigit(ch));
        System.out.println("Is uppercase: " + Character.isUpperCase(ch));
        System.out.println("To lowercase: " + Character.toLowerCase(ch));
        
        char numChar = '5';
        System.out.println("Is digit: " + Character.isDigit(numChar));
        System.out.println("Numeric value: " + Character.getNumericValue(numChar));
    }
}
