package pack17Heap;

import java.util.Arrays;
import java.util.Random;

public class SortPrac63 {
    private static void swap(long[] array, int i, int j) {
        long t = array[i];
        array[i] = array[j];
        array[j] = t;
    }
//    public static void sort(long[] array) {
//    }

    // 最好的情况：数组有序
    // 最坏的情况：数组倒序
    // 最好情况的时间复杂度：O(n)
    // 最坏情况的时间复杂度：O(n ^ 2)
    // 平均情况的时间复杂度：O(n ^ 2)
    // 能否保证稳定性：能保证稳定性
    // 空间复杂度：O(1)
    public static void bubbleSort(long[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            // 无序区间: [0, array.length - i)

            // 每次冒泡过程之前，都假设数组已经有序
            boolean sorted = true;

            // 执行一次冒泡过程 —— 需要比较无序区间元素的次数 - 1 次
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j , j + 1);
                    sorted = false;
                }
            }

            if (sorted) {
                // 假设成立，无序区间确实已经有序了
                return;
            }
        }
    }

    // 不区分最好/平均/最坏情况
    // 时间复杂度：O(n ^ 2)
    // 空间复杂度：O(1)
    // 能否保证稳定性：不能保证稳定性
    public static void selectSort(long[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            // 无序区间: [0, array.length - i)

            // 在无序区间中，找出最大的数所在的下标
            // 通过遍历查找
            int maxIndex = -1;
            for (int j = 0; j < array.length - i; j++) {
                if (maxIndex == -1 || array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }

            // 交换 最大数[maxIndex] 和 无序区间的最后一个数[array.length - i - 1]
            swap(array, maxIndex, array.length - i - 1);
        }
    }


    // 最好的情况：数组有序
    // 最坏的情况：数组倒序
    // 最好情况的时间复杂度：O(n)
    // 最坏情况的时间复杂度：O(n ^ 2)
    // 平均情况的时间复杂度：O(n ^ 2)
    // 能否保证稳定性：能保证稳定性
    // 空间复杂度：O(1)
    public static void insertSort(long[] array) {
        for (int i = 1; i < array.length; i++) {
            // 有序区间: [0, i)
            // 无序区间: [i, array.length)

            // 1. 把无序区间的第一个数 [i] 插入到有序区间
            long key = array[i];
            int j;
            for (j = i - 1; j >= 0 && array[j] > key; j--) {
                array[j + 1] = array[j];
            }
//            for (j = i - 1; j >= 0; j--) {
//                if (array[j] < key) {
//                    // key 应该插入到 [j + 1]
//                    break;
//                } else if (array[j] == key) {
//                    // key 应该插入到 [j + 1]
//                    break;
//                } else {
//                    // j 继续往前
//                }
//
//                array[j + 1] = array[j];
//            }

            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
//        long[] array = { 3, 5, 6, 4, 1, 7, 6, 3, 9, 2, 8 };
//        insertSort(array);
//        System.out.println(Arrays.toString(array));
        // 1. 数据规模        小范围     大范围
        // 2. 原始数据形态     乱序  有序  倒序  相等

        long[] array = buildArray(20_0000);
        long s = System.currentTimeMillis();        // 时间戳（Timestamp）
        bubbleSort(array);
        long e = System.currentTimeMillis();

        double 耗费时间 = (e - s) / 1000.0;
        System.out.println(耗费时间);

//        long[] array = buildReversedArray(10000);
//        long[] array2 = array.clone();  // 复制一份数组对象
//
//        Arrays.sort(array2);
//
//        insertSort(array);
//
//        System.out.println(Arrays.equals(array, array2));
    }

    private static Random random = new Random(20210331);

    private static long[] buildReversedArray(int n) {
        long[] array = new long[n];
        for (int i = 0; i < n; i++) {
            array[i] = n - i;
        }

        return array;
    }

    private static long[] buildSortedArray(int n) {
        long[] array = new long[n];
        for (int i = 0; i < n; i++) {
            array[i] = i;
        }

        return array;
    }

    // 构建乱序 —— 随机
    private static long[] buildArray(int n) {
        long[] array = new long[n];
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(2 * n);
        }

        return array;
    }
}
