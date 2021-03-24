//public class prac53 {
////    public static void main(String[] args) {
////
////            int i = 0;
////            i++;
////
////        System.out.println(i);
////        String i;
////        System.out.println(i);
////    }
////public int aMethod(){
////    int i = 0;
////    i++;
////    return i;
////}
////    public static void main(String args[]){
////        prac53 test = new prac53();
////        test.aMethod();
////        int j = test.aMethod();
////        System.out.println(j);
////    }
//static boolean Paddy;
//    public static void main(String args[]){
//        System.out.println(Paddy);
//    }
//}
//public class HasStatic {// 1
//    private static int x = 100;// 2
//    public static void main(String args[]) {// 3
//        HasStatic hsl = new HasStatic();// 4
//        hsl.x++;// 5
//        HasStatic hs2 = new HasStatic();// 6
//        hs2.x++;// 7
//        hsl = new HasStatic();// 8
//        hsl.x++;// 9
//        HasStatic.x--;// 10
//        System.out.println(" x=" + x);// 11
//    }
//}
//public class TestDemo{
//
//    private int count;
//
//    public static void main(String[] args) {
//
//        TestDemo test=new TestDemo(88);
//
//        System.out.println(test.count);
//
//    }
//
//    TestDemo(int a) {
//
//        count=a;
//
//    }
//static int cnt = 6;
//    static{
//        cnt += 9;
//    }
//    public static void main(String[] args){
//        System.out.println("cnt =" + cnt);
//    }
//    static{
//        cnt /=3;
//    };

//}
//class Test{
//
//    public String toString() {
//
//        System.out.print("aaa");
//
//        return "bbb";
//
//    }
//    public static void main(String[] args) {
//
//        System.out.println(new Test());
//    }
//}

import java.util.Arrays;

public class prac53 {
    //    给定两个整型数组, 交换两个数组的内容.
    public static void swapArray(int[] array1, int[] array2) {

        int size = Integer.min(array1.length, array2.length);
        for (int i = 0; i < size; i++) {
            int tmp = array1[i];
            array1[i] = array2[i];
            array2[i] = tmp;
        }

    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,0};
        swapArray(arr1, arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}

