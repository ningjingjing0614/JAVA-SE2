package pack16;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class prac61 {

    static class StringCompator implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            return transform(o1) - transform(o2);
        }

        public int transform(String e) {
            switch (e) {
                case "鼠":
                    return 1;
                case "牛":
                    return 2;
                case "虎":
                    return 3;
                case "兔":
                    return 4;
                default:
                    return -1;
            }
        }
    }

    public static void main(String[] args) {
        Comparator<String> comparator = new StringCompator();
        Queue<String> queue = new PriorityQueue<>(comparator);

        queue.add("鼠");
        queue.add("兔");
        queue.add("虎");
        queue.add("牛");
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

    }
}
