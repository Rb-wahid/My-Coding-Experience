public class Kata{
  public static String bonusTime(final int salaryP, final boolean bonus) {
   int salary = salaryP;
   if(bonus){
       salary *= 10;
    }
    return "\u00A3" + salary;
  }
}
