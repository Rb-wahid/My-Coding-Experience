public class Solution {

    public static boolean check(Object[] a, Object x) {
        for(Object i : a){
            if(x == i){
            return true;
            }
        }
        return false;
    }

}
