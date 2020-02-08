//Codewars link --> https://www.codewars.com/kata/53da3dbb4a5168369a0000fe

public class EvenOrOdd {
	public static String even_or_odd(int number) {
		String result = (number & 1) == 0 ? "Even" : "Odd";
		return result;
	}
}
