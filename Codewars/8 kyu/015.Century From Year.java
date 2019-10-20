//Codewars link --> https://www.codewars.com/kata/5a3fe3dde1ce0e8ed6000097

public class Solution {
	public static int century(int number) {
		int ans = number % 100, result = number / 100;
		if (ans != 0) {
			result++;
		}
		return result;
	}
}
