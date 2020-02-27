public class Bob {
  public static int enough(int cap, int on, int wait){
     if((on + wait) > cap){

         return (on + wait) - cap;
     }

     return 0;
  }
}
