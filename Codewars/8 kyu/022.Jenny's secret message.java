//Codewars link --> https://www.codewars.com/kata/55225023e1be1ec8bc000390

public class Greeter {
    public static String greet(String name) {
        if (name.equals("Johnny")) {
            return "Hello, my love!";
        }
        return String.format("Hello, %s!", name);
    }
}
