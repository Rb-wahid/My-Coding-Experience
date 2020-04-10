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

     boolean exist(List<Integer> list, int x) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == x) return true;
        }
        return false;
    }
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int testCase = in.nextInt();
        int totalFloor;
        int currentFloor;
        int closedRestaurant;
        List<Integer> list;

            while (testCase-- > 0) {
                totalFloor = in.nextInt();
                currentFloor = in.nextInt();
                closedRestaurant = in.nextInt();
                list = new ArrayList<>();

                for (int i = 0; i < closedRestaurant; i++)
                    list.add( in.nextInt());

                for (int i = 0; i <= closedRestaurant; i++) {
                    if (currentFloor - i >= 1 && !exist(list, currentFloor - i)) {
                        out.println(i);
                        break;
                    }
                    if (currentFloor + i <= totalFloor && !exist(list, currentFloor + i)) {
                        out.println(i);
                        break;
                    }
                }
                assert false;
            }
        }
}
