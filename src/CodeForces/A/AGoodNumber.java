package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title:
 *
 * link :
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AGoodNumber {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        String str ;
        int ans = 0;
        while (n-- > 0){
            str = in.readLine();
            if(str.substring(str.length()-1).equals("0") && str.substring(str.length()-2, str.length()-1).equals(String.valueOf(k)))
                ans++;

        }
        out.println(ans);
    }
}
