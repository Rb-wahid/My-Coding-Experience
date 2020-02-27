public class School{

 	public static int getAverage(int[] marks){
   int sum = 0;
   for(int i : marks){
         sum += i;
     }
		return sum / marks.length;
	}

}
