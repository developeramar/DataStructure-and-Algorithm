import java.util.Scanner;

public class GenerateNewWord {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the sequence of characters in the new language
        String languageSequence = scanner.nextLine().toLowerCase();
        
        // Check for duplicate characters in the language sequence
        if (hasDuplicateCharacters(languageSequence)) {
            System.out.println("New Language Error");
            return;
        }
        
        // Read the string to be transformed
        String inputString = scanner.nextLine().toLowerCase();
        
        // Initialize a result string
        StringBuilder result = new StringBuilder();
        
        // Iterate through each character in the input string
        for (char c : inputString.toCharArray()) {
            // If the character is a space, add it to the result
            if (c == ' ') {
                result.append(' ');
            } else {
                // Find the index of the character in the language sequence
                int index = languageSequence.indexOf(c);
                
                // If the character is not present in the language sequence, skip it
                if (index == -1) {
                    continue;
                }
                
                // Append the character at the corresponding index to the result
                result.append(languageSequence.charAt(index));
            }
        }
        
        // Print the result
        System.out.println(result.toString());
    }
    
    // Function to check for duplicate characters in a string
    private static boolean hasDuplicateCharacters(String str) {
        for (char c : str.toCharArray()) {
            if (str.indexOf(c) != str.lastIndexOf(c)) {
                return true;
            }
        }
        return false;
    }


}
