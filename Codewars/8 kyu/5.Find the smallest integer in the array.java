//Codewars link --> https://www.codewars.com/kata/55a2d7ebe362935a210000b2

public class SmallestIntegerFinder {
	public static int findSmallestInt(int[] args) {
		int smallerInt = args[0];
		for (int i : args) {
			if (smallerInt > i) {
				smallerInt = i;
			}
		}
		return smallerInt;
	}
}
