public class Sleigh {
  public static Boolean authenticate(String name, String password){
    if(name.equals("Santa Claus") && password.equals("Ho Ho Ho!")){
      return true;
    }
    return false;
  }
}
