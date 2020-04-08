import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.util.Scanner;
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
        MicroAndArrayUpdate solver = new MicroAndArrayUpdate();
        solver.solve(1, in, out);
        out.close();
    }

    static class MicroAndArrayUpdate {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            Scanner scanner = new Scanner(System.in);
            int testCase = scanner.nextInt();

            while (testCase-- > 0) {
                int N = scanner.nextInt();
                int K = scanner.nextInt();
                int[] arr = new int[N];
                int minimum = Integer.MAX_VALUE;

                for (int i = 0; i < N; i++) {
                    arr[i] = scanner.nextInt();
                    if (minimum > arr[i])
                        minimum = arr[i];

                }

                if (minimum < K)
                    System.out.println(K - minimum);
                else
                    System.out.println(0);
            }
        }

    }

    static class InputReader {
        private InputStream stream;

        public InputReader(InputStream stream) {
            this.stream = stream;
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

    }
}

