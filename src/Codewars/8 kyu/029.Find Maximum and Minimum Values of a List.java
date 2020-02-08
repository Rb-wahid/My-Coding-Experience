//Codewars link --> https://www.codewars.com/kata/577a98a6ae28071780000989

public class Kata {
    public int min(int[] list) {
        int minValue = list[0];
        int i = list.length;
        while (i != 0) {
            if (minValue > list[i - 1]) {
                minValue = list[i - 1];
            }
            i--;
        }
        return minValue;
    }
    public int max(int[] list) {

        int maxValue = list[0];
        int i = list.length;
        while (i != 0) {
            if (maxValue < list[i - 1]) {
                maxValue = list[i - 1];
            }
            i--;
        }
        return maxValue;
    }
}
