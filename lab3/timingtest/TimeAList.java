package timingtest;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * Created by hug.
 */
public class TimeAList {
    private static void printTimingTable(AList<Integer> Ns, AList<Double> times, AList<Integer> opCounts) {
        System.out.printf("%12s %12s %12s %12s\n", "N", "time (s)", "# ops", "microsec/op");
        System.out.printf("------------------------------------------------------------\n");
        for (int i = 0; i < Ns.size(); i += 1) {
            int N = Ns.get(i);
            double time = times.get(i);
            int opCount = opCounts.get(i);
            double timePerOp = time / opCount * 1e6;
            System.out.printf("%12d %12.2f %12d %12.2f\n", N, time, opCount, timePerOp);
        }
    }

    public static void main(String[] args) {
        timeAListConstruction();
    }

    public static void timeAListConstruction() {
        // TODO: YOUR CODE HERE
        AList<Integer> time1 = new AList<>();
        AList<Double> time2 = new AList<>();
        AList<Integer> time3 = new AList<>();
        for (int k = 1000; k <= 64000000; k *= 2) {
//            time1.addLast(i);
            time1.addLast(k);
            Stopwatch sw = new Stopwatch();

            for (int i = 0; i <= k; i += 1) {
                time3.addLast(i);
            }
            ;
            double timeInSeconds = sw.elapsedTime();

            time2.addLast(timeInSeconds);
        }
        ;
        printTimingTable(time1, time2, time1);
    }
}
