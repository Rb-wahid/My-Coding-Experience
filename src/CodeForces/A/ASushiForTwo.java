package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Sushi for Two
 *
 * link : https://codeforces.com/problemset/problem/1138/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ASushiForTwo {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int piecesOfSushi = in.nextInt();
        int[] arr = new int[piecesOfSushi + 1];

        for (int i = 0; i < piecesOfSushi; i++) {
            arr[i] = in.nextInt();
        }
        int ans = 0, one = 0, two = 0;
        for (int i = 0; i < piecesOfSushi;) {
            while (arr[i] == 1){
                one++;
                i++;
            }
            ans = Math.max(ans, Math.min(one, two));

            two = 0;

            while (arr[i] == 2){
                two++;
                i++;
            }
            ans = Math.max(ans, Math.min(one, two));

            one = 0;
        }

        out.println(2 * ans);
    }
}
