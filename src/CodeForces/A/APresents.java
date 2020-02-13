package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Presents
 *
 * link : https://codeforces.com/contest/136/problem/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class APresents {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int numberOfFriend = in.nextInt();
        int[] arr = new int[numberOfFriend];
        int length = arr.length;
        for (int i = 0; i < length; i++)
            arr[i] = in.nextInt();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (arr[j] - 1 == i) {
                    out.print(j+1 + " ");
                    break;
                }
            }
        }
    }
}
