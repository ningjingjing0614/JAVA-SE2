package pack19;

import java.util.Arrays;

public class shiftDownPrac71 {
    //对数组array中size个有效数组长度代表的堆的index位置进行向下调整
    public static void shiftDown(int[] array, int size, int index) {
        while (true) {
            int leftIndex = 2 * index + 1;
            if (leftIndex >= size) {//如果调整的位置是叶子节点，则不需要调整
                return;
            }

            int minIndex = leftIndex;
            int rightIndex = leftIndex + 1;

            if (rightIndex < size && array[rightIndex] < leftIndex) {
                minIndex = rightIndex;
            }
            if (array[index] <= array[minIndex]) {
                return;
            }
            int tmp = array[index];
            array[index] = array[minIndex];
            array[minIndex] = tmp;

            index = minIndex;
        }
    }

    public static void creatHeap(int[] array, int size) {
        int lastIndex = size - 1;
        int parentIndex = (lastIndex - 1) / 2;
        for (int i = parentIndex; i >= 0; i--) {
            shiftDown(array, size, i);
        }
    }



    public static void main(String[] args) {
        int[] arr1 = {27,15,19,18,28,34,65,49,25,37};
        shiftDown(arr1,10, 0);
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = {1,5,3,8,7,6};
        creatHeap(arr2, 6);
        System.out.println(Arrays.toString(arr2));

    }






}
