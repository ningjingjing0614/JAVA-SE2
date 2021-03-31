package pack17Heap;

import java.util.Arrays;

public class HeapOperationsPrac65 {
    //向下调整log(n)
    public static void heapify(long[] array, int size, int index) {
        while (true) {
            //找出无须堆节点的左子树
            int leftIndex = 2 * index + 1;
            //判断是否存在左子树（不满足下免得if条件说明传入的index无序位置位置为叶子节点，则不需要调整）
            if (leftIndex >= size) {
                return;
            }

            //先入为主，将左子数先看做（index位置他的左右子树里）最小的
            int minIndex = leftIndex;
            //由二叉树的性质和左子树的关系求出右子树
            int rightIndex = leftIndex + 1;
            //满足存在右子树&&右子树的值小于左子树的值，则进如if循环
            if (rightIndex < size && array[rightIndex] < array[leftIndex]) {
                //说明此时存在右子树&&右子树的值比左子树小，则将右子树看做最小的
                minIndex = rightIndex;
            }

            //如果传入的index位置的元素比最小的数右子树小，则返回，不需要调整
            if (array[index] <= array[minIndex]) {
                return;
            }

            //运行到这里说明index位置需要和左右子树中最小的调整位置
            long t = array[index];
            array[index] = array[minIndex];
            array[minIndex] = t;

            //此时，index位置为交换成功的元素，minIndex位置为（替换下来）再次需要交换的元素
            //最后，将minIndex位置的元素再次传入循环中
            index = minIndex;
        }
    }

    //将无序堆调整成有序堆 nlog(n)
    //基本思想：找倒数第一个非叶子节点，从该节点位置开始往前一直到根节点，遇到一个节点，应向下调整
    public static void createHeap(long[] array, int size) {
        //找到 最后一个孩子节点
        int lastChildIndex = size - 1;
        //由孩子节点找到最后一个父亲节点
        int lastParentIndex = (lastChildIndex - 1) / 2;

        //从最后一个父亲节点开始，每个都进行向下调整（将每个节点都看做一次需要调整的无序节点）
        for (int i = lastParentIndex; i >= 0; i--) {
            heapify(array, size, i);
        }
    }

    public static void main(String[] args) {
//        long[] array = { 100, 3, 50, 4, 7, 60, 70, 8, 9, 12, 13, 65, 66, -1, -1, -1, -3 };
//        int size = 13;
//
//        heapify(array, size, 0);
//
//        System.out.println(Arrays.toString(array));

        long[] array = { 3, 5, 2, 7, 6, 8, 9, 4, 1, 0, 3, 9, 3, -1, 3 };
        int size = 13;

        createHeap(array, size);

        System.out.println(Arrays.toString(array));
    }
}

