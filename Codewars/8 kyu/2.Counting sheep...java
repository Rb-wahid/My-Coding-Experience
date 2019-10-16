//Codewars link --> https://www.codewars.com/kata/54edbc7200b811e956000556

public class Counter {
	public int countSheeps(Boolean[] arrayOfSheeps) {
		int sheep = 0;
		if (arrayOfSheeps != null) {
			for (int p = 0; p < arrayOfSheeps.length; p++) {
				if (arrayOfSheeps[p] != null && arrayOfSheeps[p]) {
					sheep++;
				}
			}
		}
		return sheep;
	}
}
