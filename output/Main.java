import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Rb_wahid
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        AConneRAndTheARCMarklandN solver = new AConneRAndTheARCMarklandN();
        solver.solve(1, in, out);
        out.close();
    }

    static class AConneRAndTheARCMarklandN {
        int findClosest(List<Integer> list, int size, int target) {
            //Corner Cases
            if (target <= list.get(0))
                return list.get(0);
            if (target >= list.get(size - 1))
                return list.get(size - 1);

            //Doing binary search
            int i = 0, j = size, mid = 0;

            while (i < j) {
                mid = (i + j) / 2;

                if (list.get(mid) == target)
                    return list.get(mid);

                /*
                 * If target is less than array element , then search in left
                 */
                if (list.get(mid) > target) {
                    //If target is greater than previous to mid, return closest of two
                    if (mid > 0 && list.get(mid - 1) < target)
                        return getClosest(list.get(mid - 1), list.get(mid), target);

                    //Repeat for left half

                    j = mid;
                } else {
                    if (mid < size - 1 && list.get(mid + 1) > target)
                        return getClosest(list.get(mid), list.get(mid + 1), target);
                    // Update i
                    i = mid + 1;
                }
            }
            return list.get(mid);
        }

        int getClosest(int valueOne, int valueTwo, int target) {
            if (target - valueOne >= valueTwo - target)
                return valueTwo;
            else
                return valueOne;
        }

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int testCase = in.nextInt();
            int totalFloor;
            int currentFloor;
            int closedRestaurant;
            int ans, input;
            List<Integer> openFloor;
            while (testCase-- > 0) {
                openFloor = new ArrayList<>();
                totalFloor = in.nextInt();
                currentFloor = in.nextInt();
                closedRestaurant = in.nextInt();

                for (int i = 1; i <= totalFloor; i++) {
                    openFloor.add(i);
                }

                for (int i = 0; i < closedRestaurant; i++) {
                    input = openFloor.indexOf(in.nextInt());
                    openFloor.remove(input);
                }

                ans = findClosest(openFloor, openFloor.size(), currentFloor);

                out.println(Math.abs(currentFloor - ans));

            }
        }

    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void close() {
            writer.close();
        }

        public void println(int i) {
            writer.println(i);
        }

    }

    static class InputReader {
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

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

