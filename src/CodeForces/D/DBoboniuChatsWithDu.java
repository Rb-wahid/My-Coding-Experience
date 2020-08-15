package CodeForces.D;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: D. Boboniu Chats with Du
 *
 * link : https://codeforces.com/contest/1395/problem/D
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DBoboniuChatsWithDu {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int d = in.nextInt();
        long m = in.nextLong();
        int idx = 0;

        Long[] arr = new Long[n] ;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextLong();
            if (arr[i] > m)
                idx++;
        }
        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 1; i < n ; i++) {
            arr[i] += arr[i-1];
        }


        long ans = 0;
        if (idx == 0)
            out.println(arr[n-1]);
        else {
            for (int i = 1; i <= idx; i++) {
                int days = n - (i-1) * (d+1) - 1;
                if (days >= 0){
                    int v = Math.min(n, idx+days);
                    long x = arr[i-1]+ arr[v-1] - arr[idx-1];
                     ans = Math.max(ans, x);
                }
            }

            out.println(ans);
        }
    }
}
