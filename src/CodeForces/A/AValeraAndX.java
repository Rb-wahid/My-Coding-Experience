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

        char[][] arr = new char[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = in.nextCharacter();
                list.add(arr[i][j]);
            }
        }

        if (list.size() != 2) {
            out.println("NO");
            return;
        }else {
            for (int i = 0; i < size; i++) {
                if (arr[i][i] != arr[size-1-i][size-1-i]){
                    out.println("NO");
                    return;
                }else {
                    for (int j = 0; j < size; j++) {
                            if (arr[j][size-1-j] != arr[size-1-j][j]){
                                out.println("NO");
                            }else {
                                out.println("YES");
                            }
                        return;
                    }
                }

            }
        }
    }
}
