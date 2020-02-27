public class FakeBinary {
 public static String fakeBin(String numberString) {
  char[] ch = numberString.toCharArray();
  char[] str = new char[ch.length];
  for (int i = 0; i < ch.length; i++) {
   if (ch[i] < '5') {
    str[i] = '0';
   } else if (ch[i] > '4') {
    str[i] = '1';
   }
  }

  return new String(str);
 }
}
