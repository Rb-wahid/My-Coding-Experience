package Math;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 *Problem Title: Gotta Catch 'Em All
 *
 *link : https://www.hackerearth.com/practice/math/number-theory/basic-number-theory-1/practice-problems/algorithm/gotta-beat-em-all/
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;
import java.util.List;

public class GottaCatchEmAll {
     final int MAXNUM = 1000000;
     int spf[] = new int[MAXNUM+1];

    void sieve(){

        spf[1] = 1;

        for (int i = 2; i <MAXNUM ; i++) {
            spf[i] = i;
        }
        for (int i = 4; i < MAXNUM; i += 2){
            spf[i] = 2;
        }
        for (int i = 3; i*i <= MAXNUM ; i++) {
            if (spf[i] == i){
                for (int j = i*i; j <= MAXNUM ; j += i) {
                    if (spf[j] == j)
                        spf[j] = i;
                }
            }
        }
    }

    int getFactorization(int num) {
        List<Integer> list = new ArrayList<>();
            while (num != 1) {
                list.add(spf[num]);
                num /= spf[num];
            }

        return list.size();
    }
    public void solve(int testNumber, InputReader in, OutputWriter out) {

        int t = in.nextInt();
        int size = in.nextInt();

        while (t-->0){
            int num = in.nextInt();
            int ans = 0;
            sieve();
            int strength = getFactorization(num);
            for (int i = 1; i <= size ; i++) {
                if ( getFactorization(i)< strength)
                    ans++;
            }
            out.println(ans);
        }

    }
}
