import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Writer;
import java.io.OutputStreamWriter;
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
        ADesignTutorialLearnFromMath solver = new ADesignTutorialLearnFromMath();
        solver.solve(1, in, out);
        out.close();
    }

    static class ADesignTutorialLearnFromMath {
        List<Integer> seive(int n) {
            List<Integer> list = new ArrayList<>();
            boolean[] prime = new boolean[n + 1];
            Arrays.fill(prime, true);

            for (int i = 2; i * i <= n; i++) {
                if (prime[i])
                    for (int j = i * i; j <= n; j += i) {
                        prime[j] = false;
                    }
            }

            for (int i = 2; i <= n; i++) {
                if (!prime[i])
                    list.add(i);
            }

            return list;
        }

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();

            List<Integer> list = seive(n);
            int a = 0, b = 0;

            if ((n & 1) == 0) {
                a = b = n >> 1;
            } else {
                for (int i = 0; i < list.size(); i++) {
                    for (int j = list.size() - 1; j >= 0; j--) {
                        if (list.get(i) + list.get(j) == n) {
                            a = list.get(j);
                            b = list.get(i);
                            break;
                        }
                    }
                }
            }


            out.println(a + " " + b);
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

