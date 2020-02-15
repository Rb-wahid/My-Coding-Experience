package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Keyboard
 *
 * link : https://codeforces.com/contest/474/problem/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;
import java.util.List;

public class AKeyboard {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        List<Character> list = new ArrayList<>();
        String characters = "qwertyuiop\n" +
                "asdfghjkl;\n" +
                "zxcvbnm,./";
        for(char c : characters.toCharArray()){
            list.add(c);
        }

        char ch = in.nextCharacter();
        String str = in.readLine();
        char[] strChar = str.toCharArray();
        char value;
        int j ;
        String answer = "";
        if (ch == 'R'){
            for (int i = 0; i < str.length(); i++) {
                value = strChar[i];
                j = list.indexOf(value);
                answer += list.get(j-1);
            }
        }else
        {
            for (int i = 0; i < str.length(); i++) {
                value = strChar[i];
                j = list.indexOf(value);
                answer += list.get(j+1);
            }
        }

        out.println(answer);
    }
}
