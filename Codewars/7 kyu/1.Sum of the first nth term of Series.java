//Codewars link --> https://www.codewars.com/kata/555eded1ad94b00403000071

public class NthSeries {

	public static String seriesSum(int n) {
		// Happy Coding ^_^
		double result = 0, p = 4;

		if (n == 1) {
			result = n;
		}

		else if (n == 2) {
			result = (double) (1 + (1 / p));
			System.out.println("n  == " + result);
		} else {
			result = (double) (1 + (1 / p));

			for (int i = 1; i <= n - 2; i++) {
				result += (double) (1 / (p + (i * 3)));
			}
		}
		String ans = String.format("%.2f", result);
		return ans;
	}
}
