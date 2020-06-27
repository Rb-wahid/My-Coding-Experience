import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 * @author Rb_wahid
*/public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		OutputWriter out = new OutputWriter(outputStream);
		BCollectingPackages solver = new BCollectingPackages();
		solver.solve(1, in, out);
		out.close();
	}
static class BCollectingPackages   {
public void solve(int testNumber, InputReader in, OutputWriter out) {

        int t = in.nextInt();

        while (t-->0){
            StringBuilder sb = new StringBuilder();
            int n = in.nextInt();
            int a ;
            int b ;
            boolean flag = true;
            pair[] arr = new pair[n];
            for (int i = 0; i < n; i++) {
                a =  in.nextInt();
                b =  in.nextInt();
                arr[i] = new pair(a, b);
            }
            int x = 0, y = 0;
            Compare cm = new Compare();
            arr = cm.compare(arr, n);
            pair robot = new pair(0,0);

            for (int i = 0; i <n ; i++) {
                if (robot.x > arr[i].x || robot.y > arr[i].y){
                    flag = false;
                    break;
                }

                for (int j = robot.x; j < arr[i].x; j++) {
                    sb.append("R");
                    robot.x++;
                }

                for (int j = robot.y; j < arr[i].y; j++) {
                    sb.append("U");
                    robot.y++;
                }
            }
            if (flag){
                out.println("YES");
                out.println(sb.toString());
            }
            else
                out.println("NO");
        }
    }

class pair   {
int x;
int y;

public pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

}

class Compare   {
pair[] compare(pair[] arr, int size) {

            Arrays.sort(arr, new Comparator<pair>() {

                public int compare(pair o1, pair o2) {
                    return o1.y- o2.y;
                }
            });
            return arr;
        }

}

}
static class InputReader   {
private InputStream stream;
private byte[] buf = new byte[1024];
private int curChar;
private int numChars;
private InputReader.SpaceCharFilter filter;

public InputReader(InputStream stream) {
        this.stream = stream;
    }

public int read() {
        if (numChars == -1) {
            throw new InputMismatchException();
        }
        if (curChar >= numChars) {
            curChar = 0;
            try {
                numChars = stream.read(buf);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (numChars <= 0) {
                return -1;
            }
        }
        return buf[curChar++];
    }

public int nextInt() {
        int c = read();
        while (isSpaceChar(c)) {
            c = read();
        }
        int sgn = 1;
        if (c == '-') {
            sgn = -1;
            c = read();
        }
        int res = 0;
        do {
            if (c < '0' || c > '9') {
                throw new InputMismatchException();
            }
            res *= 10;
            res += c - '0';
            c = read();
        } while (!isSpaceChar(c));
        return res * sgn;
    }

public boolean isSpaceChar(int c) {
        if (filter != null) {
            return filter.isSpaceChar(c);
        }
        return isWhitespace(c);
    }

public   static boolean isWhitespace(int c) {
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }

public interface SpaceCharFilter   {
public boolean isSpaceChar(int ch);

}

}
static class OutputWriter   {
private   final PrintWriter writer;

public OutputWriter(OutputStream outputStream) {
        writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
    }

public OutputWriter(Writer writer) {
        this.writer = new PrintWriter(writer);
    }

public void print(Object... objects) {
        for (int i = 0; i < objects.length; i++) {
            if (i != 0) {
                writer.print(' ');
            }
            writer.print(objects[i]);
        }
    }

public void println(Object... objects) {
        print(objects);
        writer.println();
    }

public void close() {
        writer.close();
    }

}
}

