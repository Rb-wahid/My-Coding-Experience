package CodeForces.B;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class BBorze {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        StringBuilder stringBuilder = new StringBuilder();

        String input = in.next();
        char[] ch = input.toCharArray();
        for (int i = 0; i < input.length() ; i++) {
            if (ch[i] == '-'){
                if (ch[i+1] == '.') {
                    stringBuilder.append(1);
                    i++;
                    continue;
                }
            }
            if (ch[i] == '-'){
                if (ch[i+1] == '-') {
                    stringBuilder.append(2);
                    i++;
                    continue;
                }
            }
            if (ch[i] == '.'){
                stringBuilder.append(0);
            }
        }

        out.println(stringBuilder.toString());
    }
}
