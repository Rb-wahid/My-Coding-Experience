public class AbbreviateTwoWords {

 public static String abbrevName(String name) {
  int index = name.indexOf(" ");
  String abbrev = name.charAt(0) + "." + name.charAt(index + 1);
  return abbrev.toUpperCase();
 }
}
