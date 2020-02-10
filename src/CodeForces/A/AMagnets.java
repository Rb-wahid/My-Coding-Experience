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
        boolean[] flag = new boolean[2];
        for (int i = 0; i < magnet; i++) {
            megnets[i] = in.nextInt();
                value = megnets[i];
            if (value == 10){
                if (!flag[0])
                groupsOfMagnets++;

                flag[0] = true;
                flag[1] = false;
            }else if (value == 01){
                if (!flag[1])
                    groupsOfMagnets++;
                flag[1] = true;
                flag[0] = false;
            }
        }

        out.println(groupsOfMagnets);
    }
}
