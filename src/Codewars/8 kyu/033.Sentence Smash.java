import java.util.Arrays;

public class SmashWords {

 public static String smash(String...words) {
  String str = "";
  for (int i = 0; i < words.length; i++) {
   str += words[i];
   if (i != words.length - 1) {
    str += " ";
   }
  }

  return str;
 }
}
