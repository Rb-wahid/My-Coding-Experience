//Codewars link --> https://www.codewars.com/kata/53af2b8861023f1d88000832

public class Banjo {
    public static String areYouPlayingBanjo(String name) {
        char ch = name.charAt(0);
        if (ch == 'R' || ch == 'r') {
            return name + " plays banjo";
        }
        return name + " does not play banjo";
    }
}
