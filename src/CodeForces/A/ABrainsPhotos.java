package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Brain's Photos
 *
 * link : https://codeforces.com/contest/707/problem/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;
import java.util.List;

public class ABrainsPhotos {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        List<Character> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                list.add(in.nextCharacter());
            }
        }

        for (char i : list){
            if (i == 'C' || i == 'M' || i == 'Y') {
                out.println("#Color");
                return;
            }
        }

        out.println("#Black&White");
    }
}
