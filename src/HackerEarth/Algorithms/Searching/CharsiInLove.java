package HackerEarth.Algorithms.Searching;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 *Problem Title: Charsi in Love
 *
 *link : https://www.hackerearth.com/practice/algorithms/searching/binary-search/practice-problems/algorithm/charsi-in-love/
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class CharsiInLove {

    int math(int nun){

        return (nun * (nun+1)) >> 1;
    }

    int binarySearch(int num){
        int low = 1;
        int high = num;
        int mid, ans = -1;
        while (low <= high){
            mid = (low + high) >> 1;

            if (math(mid) == num) {
                ans = 1;
                break;
            }else if (math(mid) > num)
                low = mid++;
            else
                high = mid--;
        }
        return ans;
    }
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int num = in.nextInt();

        if (binarySearch(num) == 1)
            out.println("YES");
        else
            out.println("NO");
    }
}
