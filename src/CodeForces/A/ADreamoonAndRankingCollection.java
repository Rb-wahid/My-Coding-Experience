package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Dreamoon and Ranking Collection
 *
 * link : https://codeforces.com/problemset/problem/1330/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ADreamoonAndRankingCollection {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();

        while (t-->0){
            int n = in.nextInt();
            int x = in.nextInt();
            int[] arr = new int[n];
            boolean[] check = new boolean[102];
            int count = 0;

            for (int i = 0; i <n ; i++) {
                arr[i] = in.nextInt();
                check[arr[i]] = true;
            }

            for (int i = n+x; i >0 ; i--) {
                count = 0;
                for (int j = 1; j <= i; j++) {
                    if (!check[j])
                        count++;
                }
                    if (count <= x){
                        out.println(i);
                        break;
                    }
            }
        }
    }
}
