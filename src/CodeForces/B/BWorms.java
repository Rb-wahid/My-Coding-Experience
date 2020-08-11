package CodeForces.B;
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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BWorms {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n ; i++) {
            arr[i] = in.nextInt();
        }
        List<Integer> list = new ArrayList<>();

        list.add( arr[0]);
        for (int i = 1; i < n; i++) {
            list.add(list.get(i-1)+arr[i]);
        }
        int m = in.nextInt();

        while (m-->0) {
            int q = in.nextInt();
            int v = Collections.binarySearch(list, q);

            out.println(v < 0? Math.abs(v) : v+1);
        }
    }
}
