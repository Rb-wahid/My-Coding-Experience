package CodeForces;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: B. Omkar and Last Class of Math
 *
 * link : https://codeforces.com/contest/1372/problem/B
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.security.KeyStore;
import java.util.*;
import java.util.stream.Collectors;

public class BOmkarAndLastClassOfMath {

    public static HashMap<String, Long> sortByValue(HashMap<String, Long> hm)
    {
        List<Map.Entry<String, Long> > list =
                new LinkedList<Map.Entry<String, Long> >(hm.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Long> >() {
            public int compare(Map.Entry<String, Long> o1,
                               Map.Entry<String, Long> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        HashMap<String, Long> temp = new LinkedHashMap<String, Long>();
        for (Map.Entry<String, Long> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }


    long gcd(long a, long b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }


    long lcm(long a, long b)
    {
        return (a*b)/gcd(a, b);
    }
    public void solve(int testNumber, InputReader in, OutputWriter out) {

         int t = in.nextInt();
         while (t-->0){
             long num = in.nextLong();

             List<Long> list = new ArrayList<>();
             HashMap<String, Long> map = new HashMap<>();

             for (long i = 1; i < num ; i++) {
                 for (int j = 1; j < num; j++) {
                     if (i+j == num){
                         String str = String.valueOf(i);
                         str += " ";
                          str += String.valueOf(j);
                         map.put(str, lcm(i, j));
                         break;
                     }
                 }
             }

             Map<String, Long> hm1 = sortByValue(map);

             for (Map.Entry<String, Long> en : hm1.entrySet()) {
                 out.println( en.getKey());

                 break;
             }


         }
    }
}
