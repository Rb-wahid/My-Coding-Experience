package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. New Year and Hurry
 *
 * link : https://codeforces.com/problemset/problem/750/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ANewYearAndHurry {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        final int contestTime = 240; // 4 hours = 240 minutes
        int problem = in.nextInt();
        int time = in.nextInt();
        int solveProblem = 0;
        int solvingTime = 0;
        for (int i = 1; i <= problem ; i++) {
            solvingTime += i * 5;
            if (solvingTime + time <= contestTime)
            solveProblem++;
        }
            out.println(solveProblem);

    }
}
