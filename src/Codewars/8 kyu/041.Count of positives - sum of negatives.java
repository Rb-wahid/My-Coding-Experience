public class Kata
{
    public static int[] countPositivesSumNegatives(int[] input)
    {

        if(input == null || input.length < 1){
            return new int[] {};
        }
        int[] arr = {0,0};
        for(int i = 0; i < input.length; i++){
            if(input[i] > 0){
                arr[0] += 1;
                
            }else {
                arr[1] += input[i];
            }
        }
        return arr;
    }
}
