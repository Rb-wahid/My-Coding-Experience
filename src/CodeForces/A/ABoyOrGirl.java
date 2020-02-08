package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 *Problem Title: A. Boy or Girl
 *
 *link : https://codeforces.com/problemset/problem/236/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ABoyOrGirl {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String str = in.nextString();
        Set<Character> characterSet = new HashSet<>();

        for (int i = 0; i < str.length();i++){
            characterSet.add(str.charAt(i)); }


        if (characterSet.size()%2 == 1)
            out.println("IGNORE HIM!");
        else
            out.println("CHAT WITH HER!");


    }
}
