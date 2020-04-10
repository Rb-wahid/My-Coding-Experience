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

    //Returns element closest to target in List<Integer> list
    int findClosest(List<Integer> list, int size, int target)
    {
        //Corner Cases
        if (target <= list.get(0))
            return list.get(0);
        if (target >= list.get(size - 1))
            return list.get(size - 1);

        //Doing binary search
        int i = 0, j = size, mid = 0;

        while (i < j)
        {
            mid = (i + j) / 2;

            if (list.get(mid) == target)
                return list.get(mid);

            /*
            * If target is less than array element , then search in left
            */
            if (list.get(mid) > target)
            {
                //If target is greater than previous to mid, return closest of two
                if (mid > 0 && list.get(mid - 1) < target)
                  return getClosest(list.get(mid - 1), list.get(mid), target);

                //Repeat for left half

                j = mid;
            }else
            {
                if (mid < size - 1 && list.get(mid + 1) > target)
                    return getClosest(list.get(mid), list.get(mid + 1), target);
                // Update i
                i = mid + 1;
            }
        }
        return list.get(mid);
    }

    int getClosest(int valueOne, int valueTwo, int target)
    {
        if (target- valueOne >= valueTwo - target)
            return valueTwo;
        else
            return valueOne;
    }

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int testCase = in.nextInt();
        int totalFloor;
        int currentFloor;
        int closedRestaurant;
        int ans , input;
        List<Integer> openFloor ;
        while (testCase-- > 0){
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

            ans = findClosest(openFloor, openFloor.size(), currentFloor);

            out.println(Math.abs(currentFloor - ans));
            
        }
    }
}
