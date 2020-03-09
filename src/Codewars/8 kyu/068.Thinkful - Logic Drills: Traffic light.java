public class TrafficLights {

  public static String updateLight(String current) {
    switch(current){
      case "green":
        return "yellow";
      case "yellow":
        return "red";
      default:
        return "green";
    }
    
  }
  
}
