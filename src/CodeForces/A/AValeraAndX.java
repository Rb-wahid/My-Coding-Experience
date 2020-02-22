package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Valera and X
 *
 * link : http://codeforces.com/contest/404/problem/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.HashSet;
import java.util.Set;

public class AValeraAndX {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        Set<Character> list = new HashSet<>();
        int size =in.nextInt();
        String ans = "";
        boolean flag = false;
        boolean f = true;
        char[][] arr = new char[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = in.nextCharacter();
            }
        }

            for (int i = 0; i < size; i++) {
                for (int j = 1; j < size; j++) {
                    if (arr[i][i] != arr[size-1-i][size-1-i] && arr[i][i] != arr[i][j]){
                        flag = false;
                    }
                    else {
                            if (arr[i][size-1-i] != arr[size-1-i][i] && arr[i][i] != arr[i][j])
                                flag = false;

                            else
                                flag = true;
                    }
                }
            }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                list.add(arr[i][j]);
            }
            if (list.size() != 2){
                f = false;
                break;
            }
        }
        out.println(flag && f ? "YES" : "NO");
    }
}
