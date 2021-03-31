package pack17Heap;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemoPrac64 {
    static class IntegerComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            int o1Int = o1.intValue();
            int o2Int = o2.intValue();

            if (o1Int < o2Int) {
                return 1;
            } else if (o1Int > o2Int) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        // Integer(2) < Integer(9)   Integer 的自然顺序（Comparable)
        // Integer(2) > Integer(9)
        Comparator<Integer> comparator = new IntegerComparator();
        System.out.println(comparator.compare(9, 2));

        queue.add(9);
        queue.add(5);
        queue.add(2);
        queue.add(7);

        System.out.println(queue.element());
    }
}

