package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. The New Year: Meeting Friends
 *
 * link : https://codeforces.com/problemset/problem/723/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class ATheNewYearMeetingFriends {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int[] arr = new int[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = in.nextInt();
        }

        int value = 0;
        Arrays.sort(arr);
        value = arr[2]- arr[1] + (arr[1]-arr[0]);
        out.println(value);
    }
}
