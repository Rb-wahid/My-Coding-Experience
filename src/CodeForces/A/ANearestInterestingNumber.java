package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title:
 *
 * link :
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ANearestInterestingNumber {
    int sum (int n) {
        int result = 0;
        while (n != 0){
            result += n%10;
            n /= 10;
        }
        return result;
    }
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int a = in.nextInt();

        while (sum(a) % 4 != 0)
            a++;

        out.println(a);
    }
}
