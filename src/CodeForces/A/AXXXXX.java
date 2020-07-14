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

import java.util.HashMap;

public class AXXXXX {
    static int larr(int[] arr, int n, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int s = 0, max = 0;


        for (int i = 0; i < n; i++) {


            s += arr[i];


            if (s % k != 0)
                max = i + 1;

            if (!map.containsKey(s)) {
                map.put(s, i);
            }

            if (map.containsKey(s - k)) {


                if (max < (i - map.get(s - k)))
                    max = i - map.get(s - k);
            }
        }

        return max;
    }

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();

        while (t-- > 0) {
            int ans = 0;
            int n = in.nextInt();
            int x = in.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }

            ans = larr(arr, n, x);
            if (ans != 0)
                out.println(ans);
            else
                out.println(-1);

        }
    }
}
