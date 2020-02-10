package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 *Problem Title: A. Magnets
 *
 *link : https://codeforces.com/contest/344/problem/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AMagnets {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int magnet = in.nextInt();
        int[] megnets = new int[magnet];
        int value = 0, groupsOfMagnets = 0;
        for (int i = 0; i < magnet; i++) {
            megnets[i] = in.nextInt();
            value = megnets[i];
            if (megnets[i] != value){
                groupsOfMagnets++;
            }
        }

        out.println(groupsOfMagnets);
    }
}
