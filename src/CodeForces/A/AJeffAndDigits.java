package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Jeff and Digits
 *
 * link : http://codeforces.com/problemset/problem/352/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class AJeffAndDigits {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int[] arr = new int[n];
        int f = 0;
        int z = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();

            if (arr[i] == 5)
                f++;
            else
                z++;
        }
        Arrays.sort(arr);
        StringBuilder string = new StringBuilder();


        for (int i = n-1; i >= 0; --i)
            string.append(arr[i]);

        String str = string.toString();
        long value = Long.parseLong(str);
        long temp = 0;

        while (value % 90 != 0 && value != 5 ) {

                temp = value -  ( 5 *(long) Math.pow(10, n-1));
                if (temp % 90 == 0){
                    value = temp;
                    break;
                }
                else {
                    str = str.substring(0, n-1);
                    --n;
                    if (str.length() != 0) {
                        temp = Long.parseLong(str);
                        if (temp % 90 == 0) {
                            value = temp;
                            break;
                        }
                    } else {
                        value = 5;
                    }
                }
        }
        if (z == 0 || f == 0)
            out.println(-1);
        else if (value == 5)
            out.println(0);
        else
            out.println(value);
    }
}
