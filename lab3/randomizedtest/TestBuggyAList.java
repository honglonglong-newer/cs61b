package randomizedtest;

import edu.princeton.cs.algs4.StdRandom;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by hug.
 */
public class TestBuggyAList {
  // YOUR TESTS HERE
  public static void main(String[] args) {
//    AListNoResizing<Integer> au=new AListNoResizing<>();
//    au.addLast(4);
//    au.addLast(5);
//    au.addLast(6);
//    BuggyAList<Integer> bu=new BuggyAList<>();
//    bu.addLast(4);
//    bu.addLast(5);
//    bu.addLast(6);
//    int a1=au.removeLast();
//    int b1=bu.removeLast();
//    int a2=au.removeLast();
//    int b2=bu.removeLast();
//    int a3=au.removeLast();
//    int b3=bu.removeLast();
//    System.out.println();

    AListNoResizing<Integer> L = new AListNoResizing<>();

    int N = 5000;
    for (int i = 0; i < N; i += 1) {
      int operationNumber = StdRandom.uniform(0, 3);
      if (operationNumber == 0) {
        // addLast
        int randVal = StdRandom.uniform(0, 100);
        L.addLast(randVal);
        L.removeLast();
        System.out.println("addLast(" + randVal + ")");
      } else if (operationNumber == 1) {
        // size
        int size = L.size();
        System.out.println("size: " + size);
      }
    }
  }
//  @Test
//  public void testZeroOutFELMaxes1() {
//    IntList L = IntList.of(1, 22, 15);
//    IntListExercises.setToZeroIfMaxFEL(L);
//    assertEquals("0 -> 0 -> 15", L.toString());
//  }

}
