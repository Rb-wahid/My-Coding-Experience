package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Deadline
 *
 * link : https://codeforces.com/problemset/problem/1288/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ADeadline {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int testCase = in.nextInt();
        int deadline , dayForRun;
        double ans;

        while (testCase -- > 0){
            deadline = in.nextInt();
            dayForRun = in.nextInt();

            ans =  2 * Math.sqrt(dayForRun) - 1;

            out.println(ans <= deadline ? "YES" : "NO");
        }
    }
}
