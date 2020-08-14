package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Captain Flint and Crew Recruitment
 *
 * link : https://codeforces.com/problemset/problem/1388/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ACaptainFlintAndCrewRecruitment {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();

        while (t-->0) {
            int n = in.nextInt();
            StringBuilder sb = new StringBuilder();

            int a = 6;
            int b = 10;
            int c = 14;
            int d = n-30;

            if (a == d || b == d || c == d){
                c++;
                d--;
                sb.append("YES").append("\n");
                sb.append(a).append(" ")
                        .append(b).append(" ")
                        .append(c).append(" ")
                        .append(d);
            }
            else if (d > 0){
                sb.append("YES").append("\n");
                sb.append(a).append(" ")
                        .append(b).append(" ")
                        .append(c).append(" ")
                        .append(d);
            }
            else
                sb.append("NO");

            out.println(sb);
        }
    }
}
