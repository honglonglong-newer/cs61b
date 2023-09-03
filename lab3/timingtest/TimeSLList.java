package timingtest;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * Created by hug.
 */
public class TimeSLList {
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
        timeGetLast();
    }

    public static void timeGetLast() {
        // TODO: YOUR CODE HERE
        AList<Integer> list1=new AList<>();
        AList<Integer> list2=new AList<>();
        AList<Double> list3=new AList<>();
        SLList<Integer> t2=new SLList<>();
//        SLList<Double> list3=new SLList<>();
        for (int k = 1000; k <= 32000; k *= 2) {
//            time1.addLast(i);
            list2.addLast(k);
//            Stopwatch sw = new Stopwatch();

            for (int i = 0; i <= k; i += 1) {
                list1.addLast(10000);
                t2.addLast(1);

            }
            Stopwatch sw = new Stopwatch();
            for (int i = 0; i <= 10000; i += 1) {
                t2.getLast();
            }

            double timeInSeconds = sw.elapsedTime();
            list3.addLast(timeInSeconds);

//

        }
        printTimingTable(list2,list3,list1);
    }

}
