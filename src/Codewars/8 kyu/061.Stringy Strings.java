public class Kata {
  public static String stringy(int size) {
    if(size == 0){
    return "";
    }
    
    String str = "1";
    int x = size - 1;
    while(x > 0){
    if(size % 2 == 0){
        if(x % 2 == 0){
            str += "1";
        }else{
            str += "0";
        }
      }else {
        if(x % 2 == 0){
            str += "0";
        }else{
            str += "1";
        }
      }    
        x--;
    }
    return str;
  }
}
