//Codewars link --> https://www.codewars.com/kata/5715eaedb436cf5606000381

public class Positive {
	public static int sum(int[] arr) {
		int sum = 0;
		for (int i : arr) {
			if (i > 0) {
				sum += i;
			}
		}
		return sum;
	}
}
