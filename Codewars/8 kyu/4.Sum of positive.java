//Codewars link --> https://www.codewars.com/kata/5715eaedb436cf5606000381

public class Positive {

	public static int sum(int[] arr) {
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				sum += arr[i];
			}
		}
		if (sum > 0) {
			return sum;
		}
		return 0;
	}

}
