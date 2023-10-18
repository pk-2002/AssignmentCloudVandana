import java.util.HashMap;
import java.util.Map;

public class RomanNumber {

	public static int romanToInt(String s) {
		HashMap<Character, Integer> romanMap = new HashMap<>();
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);

		int result = 0;
		int prevValue = 0;

		for (int i = s.length() - 1; i >= 0; i--) {
			int currValue = romanMap.get(s.charAt(i));

			if (currValue >= prevValue) {
				result += currValue;
			} else {
				result -= currValue;
			}

			prevValue = currValue;
		}

		return result;
	}

	public static void main(String[] args) {
		String romanNumeral = "IX"; // Replace with your Roman numeral
		int integerEquivalent = romanToInt(romanNumeral);
		System.out.println("The integer equivalent of " + romanNumeral + " is " + integerEquivalent);
	}

}
