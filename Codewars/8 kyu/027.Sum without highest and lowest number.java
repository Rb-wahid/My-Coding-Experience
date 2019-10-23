//Codewars link --> https://www.codewars.com/kata/576b93db1129fcf2200001e6

public class Kata {
    public static int sum(int[] numbers) {
        if (numbers == null || numbers.length <= 1) {
            return 0;
        }
        int highestNum = numbers[0];
        int lowestNum = numbers[0];
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (highestNum < numbers[i]) {
                highestNum = numbers[i];
            } else if (lowestNum > numbers[i]) {
                lowestNum = numbers[i];
            }
            sum += numbers[i];
        }
        return sum - (highestNum + lowestNum);
    }
}
