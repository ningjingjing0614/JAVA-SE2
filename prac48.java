package pack7;

public class prac48 {

    //实现自己的toString方法
    public static void myToString(int[] array) {
        String str1 = "[";
        for (int i = 0; i < array.length - 1; i++) {
            str1 = str1 + array[i] + ",";
        }
        if (array.length > 0) {
            str1 = str1 + array[array.length - 1] + "]";
        } else {
            str1 = str1 + "]";
        }
        System.out.println(str1);
    }

    //    public static void bubbleSort(int[] array) {
////        for (int i = 1; i < array.length; i++) {
////            for (int j = i; j < array.length -i; j++) {
////                if (array[j] > array[j+1]) {
////                    int tmp = array[j];
////                    array[j+1] = tmp;
////                    array[j] = array[j+1];
////                }
//////                System.out.println();
////            }
////        }
////    }
//冒泡排序法（从小到大排序）
    public static void bubbleSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                //比较相邻的两个元素，较大的数往后冒泡
//            if (array[j-1] > array[j]){
//                int tmp = array[j-1];
//                array[j-1] = array[j];
//                array[j] = tmp;
                if (array[j + 1] < array[j]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }

    //二分查找
    public static int myBinary(int[] array, int num) {
        int left = -1;
        int right = array.length;
        while (left + 1 < right) {
            int mid = (left + right) / 2;
            if (num > array[mid]) {
                left = mid;
            } else if (num < array[mid]) {
                right = mid;
            } else {
                return mid;
            }
        }
        return -1;
    }

    //复制指定数组长度数组到新数组中
    public static int[] copyOf(int[] array, int size) {
        int[] cur = new int[size];
//        int min = Integer.min(size,array.length);
        if (array.length < size) {
            for (int i = 0; i < array.length; i++) {
                cur[i] = array[i];
            }
        } else {
            for (int i = 0; i < size; i++) {
                cur[i] = array[i];
            }
        }
        return cur;
    }

    //复制指定起始下标的数组//前闭后开
    public static int[] copyRangeOf(int[] array, int left, int right) {
        int[] cur = new int[right - left];
        int cou = 0;
//        if (right > array.length || left < 0) {
//            throw new RuntimeException("越界了");
//        }
        for (int i = left; i < right; i++){
            cur[cou] = array[i];
            cou++;
        }
        return cur;
    }


}
