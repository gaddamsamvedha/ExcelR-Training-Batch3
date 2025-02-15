public class Demo083 {
    public static void checkFirstCharacter(String input) {
        if (input == null || input.isEmpty()) {
            System.out.println("The input string is empty.");
            return;
        }
        char firstChar = input.charAt(0);
        firstChar = Character.toLowerCase(firstChar);
        if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u') {
            System.out.println("The first character is a vowel.");
        } else {
            System.out.println("The first character is a consonant.");
        }
    }
    public static void main(String[] args) {
        String inputString = "Samvedha"; 
        checkFirstCharacter(inputString);
    }
}
