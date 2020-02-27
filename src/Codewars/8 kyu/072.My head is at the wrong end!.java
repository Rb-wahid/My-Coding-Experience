public class WrongEndHead {
  public static String[] fixTheMeerkat(String[] arr) {
    String[] str = new String[arr.length];
    for(int i = 0; i < arr.length; i++){
        str[i] = arr[arr.length - i-1];
    }
    return str;
  }
}
