//public class que11
//{
//    public static void main(String[] args)
//    {
//        char input = args[0].charAt(0);
//
//
//
//        // inputArray[0] = input;
//
//
//        System.out.println(input);
//        if( (input >= 'A' && input <= 'Z') || (input >= 'a' && input <= 'z') )
//        {
//            System.out.println(input);
//        }
//        else if(input >= '0' && input <= '9')
//        {
//            System.out.println(input);
//            // System.out.println(inputArray.codePointAt(0));
//        }
//
//
//    }
//}


 class CharOperations {
    public static void main(String[] args) {
        // Read the character from command line
        char c = args[0].charAt(0);

        // Check whether entered character is letter or digit
        if (Character.isDigit(c)) {
            // If it is digit, print its value and code point
            System.out.println("The entered character is a digit: " + c);
            System.out.println("Code point: " + (int) c);
        } else if (Character.isLetter(c)) {
            // If it is a letter, check if it is in lowercase
            if (Character.isLowerCase(c)) {
                // Convert to uppercase and print value and code point
                char upperC = Character.toUpperCase(c);
                System.out.println("The entered character is in lowercase: " + c);
                System.out.println("Uppercase version: " + upperC);
                System.out.println("Code point: " + (int) upperC);
            } else {
                // If it is in uppercase, print value and code point
                System.out.println("The entered character is in uppercase: " + c);
                System.out.println("Code point: " + (int) c);
            }
        } else {
            // If it is neither a letter nor a digit, print error message
            System.out.println("The entered character is neither a letter nor a digit.");
        }
    }
}
