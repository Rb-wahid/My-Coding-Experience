//Codewars link --> https://www.codewars.com/kata/57a0e5c372292dd76d000d7e

public class Solution {
	public static String repeatStr(final int repeat, final String string) {
		String stringRepeat = string;
		String result = "";
		for (int i = 0; i < repeat; i++) {
			result += stringRepeat;
		}
		return result;
	}
}
