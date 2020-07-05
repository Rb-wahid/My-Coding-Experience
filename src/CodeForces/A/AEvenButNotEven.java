package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Even But Not Even
 *
 * link : https://codeforces.com/problemset/problem/1291/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AEvenButNotEven {

    int toInt(char ch) {
        return Integer.parseInt(String.valueOf(ch));
    }
    boolean isOdd(int num) {
        return (num&1) == 1;
    }

    public void solve(int testNumber, InputReader sc, OutputWriter out) {
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String str = sc.next();
            char[] arr = str.toCharArray();

            int odd = 0;
            int first = 0;
            StringBuilder sb = new StringBuilder();

            for (char ch : str.toCharArray()) {
                int num = toInt(ch);
                if ((num&1) == 1)
                    odd++;
            }

            if (odd <= 1) {
                sb.append("-1");
            }
            else {
                for (int i = 0, j = 0; i < n && j <2; i++) {
                    first = toInt(arr[i]);
                    if (isOdd(first)){
                        sb.append(first);
                        j++;
                    }
                }
            }
            out.println(sb);

        }
    }
}
