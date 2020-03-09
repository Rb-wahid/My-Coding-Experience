public class TotalPoints {
  
    public static int points(String[] games) {
      int sum = 0;
      for(String str : games){
        if(str.charAt(0) > str.charAt(2)){
          sum += 3;
        }
        else if(str.charAt(0) == str.charAt(2)){
          sum += 1;
        }
      }
      return sum;
    }
}
