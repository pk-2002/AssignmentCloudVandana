
public class PangramSentence {
	 public static boolean isPangram(String input) {
	        // Convert the input to lowercase to handle case insensitivity
	        input = input.toLowerCase();
	        
	        // Create a boolean array to track the presence of each letter from 'a' to 'z'
	        boolean[] alphabetPresent = new boolean[26];
	        
	        for (int i = 0; i < input.length(); i++) {
	            char c = input.charAt(i);
	            
	            // Check if the character is a lowercase letter
	            if (c >= 'a' && c <= 'z') {
	                // Mark the corresponding letter as present
	                alphabetPresent[c - 'a'] = true;
	            }
	        }
	        
	        // Check if all letters from 'a' to 'z' are present
	        for (boolean letterPresent : alphabetPresent) {
	            if (!letterPresent) {
	                return false;
	            }
	        }
	        
	        return true;
	    }

	    public static void main(String[] args) {
	        String input = "The quick brown fox jumps over the lazy dog"; // Replace with your input
	        boolean isPangram = isPangram(input);
	        
	        if (isPangram) {
	            System.out.println("The input is a pangram.");
	        } else {
	            System.out.println("The input is not a pangram.");
	        }
	    }
}
