package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Erasing Zeroes
 *
 * link : https://codeforces.com/problemset/problem/1303/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AErasingZeroes {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();
        while (t-->0) {
            String string = in.next();

            if (string.length() < 2)
                out.println(0);
            else {
                char[] arr = string.toCharArray();
                int count = 0;
                int first1 = -1;
                int last1 = arr.length-1;

                for (char ch : arr){
                    first1++;
                    if (ch == '1')
                        break;
                }

                for ( ; last1 >=0 ; last1--) {
                    if (arr[last1] == '1'){
                        break;
                    }
                }

                for (int i = first1+1; i < last1 ; i++) {
                    char xchar = arr[i];
                    if (xchar == '0'){
                        count++;
                    }
                }
                out.println(count);
            }
        }
    }
}
