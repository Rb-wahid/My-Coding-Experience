public class GrassHopper {

    public static char getGrade(int s1, int s2, int s3) {
      int avg = (s1 + s2 + s3) / 3;
      if(avg >= 90 && avg <= 100){
        return 'A';
      }
      else if(avg >= 80 && avg < 90){
        return 'B';
      }
      else if(avg >= 70 && avg < 80){
        return 'C';
      }
      else if(avg >= 60 && avg < 70){
        return 'D';
      }
        return 'F';
    }
}
