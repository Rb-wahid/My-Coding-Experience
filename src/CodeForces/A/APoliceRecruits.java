package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 *Problem Title: A. Police Recruits
 *
 *link : https://codeforces.com/contest/427/problem/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class APoliceRecruits {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int numberOfEvent = in.nextInt();
        int[] arr = new int[numberOfEvent];

        for (int i = 0; i < numberOfEvent; i++) {
            arr[i] = in.nextInt();
        }
        int untreated = 0, officer = 0;

            for (int i = 0; i < numberOfEvent; i++) {
                if (arr[i] > 0)
                    officer += arr[i];
                else if (officer > 0)
                    officer--;
                else
                    untreated++;
            }

        out.println(untreated);
    }
}
