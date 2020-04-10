package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. ConneR and the A.R.C. Markland-N
 *
 * link : https://codeforces.com/problemset/problem/1293/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;
import java.util.List;

public class AConneRAndTheARCMarklandN {

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int testCase = in.nextInt();
        int totalFloor;
        int currentFloor;
        int closedRestaurant;
        int ans , input;
        List<Integer> openFloor ;
        while (testCase-- > 0){
            ans = Integer.MAX_VALUE;
            openFloor = new ArrayList<>();
            totalFloor = in.nextInt();
            currentFloor = in.nextInt();
            closedRestaurant = in.nextInt();

            for (int i = 1; i <= totalFloor; i++) {
                openFloor.add(i);
            }

            for (int i = 0; i < closedRestaurant ; i++) {
                 input = openFloor.indexOf(in.nextInt());
                openFloor.remove(input);
            }

            for (int i = 0; i < openFloor.size(); i++)
                ans = Math.min(ans, Math.abs(currentFloor - openFloor.get(i)));

            out.println(ans);
            
        }
    }
}
