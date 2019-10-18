//Codewars link --> https://www.codewars.com/kata/57f781872e3d8ca2a000007e

public class Maps {
	public static int[] map(int[] arr) {
		int[] newArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i] * 2;
		}
		return newArr;
	}
}
