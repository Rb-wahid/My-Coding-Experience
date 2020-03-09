package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Anton and Polyhedrons
 *
 * link : http://codeforces.com/contest/785/problem/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AAntonAndPolyhedrons {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int polyhedrons = in.nextInt();
        int totalFaces = 0;
        String str;

        while (polyhedrons-- > 0){
            str = in.nextString();

            switch (str){
                case "Tetrahedron" :
                    totalFaces += 4;
                    break;

                case "Cube" :
                    totalFaces += 6;
                    break;

                case "Octahedron" :
                    totalFaces += 8;
                    break;

                case "Dodecahedron" :
                    totalFaces += 12;
                    break;

                case "Icosahedron" :
                    totalFaces += 20;
                    break;
            }
        }
        out.println(totalFaces);
    }
}
