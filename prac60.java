package pack16;

import java.util.ArrayList;
import java.util.Iterator;

public class prac60 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        for (int num : list) {
            System.out.println(num);
        }

        //        Iterable<Integer> iterable = list;
//        Iterator<Integer> iterator = iterable.iterator();

        //        上面这两步可以简化为下面这一步。
//        Iterator<Integer> iterator = list.iterator();

//        System.out.println(iterator.hasNext());
//        System.out.println(iterator.next());
//
//        System.out.println(iterator.hasNext());
//        System.out.println(iterator.next());
//
//        System.out.println(iterator.hasNext());
//        System.out.println(iterator.next());
//
//        System.out.println(iterator.hasNext());


//        Iterator<Integer> iterator = list.iterator();
//
//        //可以再合适的条件下，对当前迭代器内的传入下标位置的元素进行删除。
//        iterator.remove();
//
//        //只要还有下一个元素，循环就继续
//        while (iterator.hasNext()) {
//            //获取下一个元素，并让迭代器走到next()之后的位置
//            System.out.println(iterator.next());
//        }

    }

}


////        Iterable<Integer> iterable = list;
////        Iterator<Integer> iterator = iterable.iterator();
//
//    //        上面这两步可以简化为下面这一步。
//    Iterator<Integer> iterator = list.iterator();
//
//        System.out.println(iterator.hasNext());
//                System.out.println(iterator.next());
//
//                System.out.println(iterator.hasNext());
//                System.out.println(iterator.next());
//
//
//                System.out.println(iterator.hasNext());
//                System.out.println(iterator.next());
//
//                System.out.println(iterator.hasNext());


//        System.out.println(iterator.next());//实现这一步会抛出异常java.util.NoSuchElementException

//        System.out.println(iterable.iterator().hasNext());
//        System.out.println(iterable.iterator());
//import java.util;
//
///**
// * 迭代能力的接口表示具备迭代能力的。
// * 参数类型
// * T - 迭代器返回的元素的类型
// */
//public interface Iterable<T> {
//
////    返回类型为 T元素的迭代器。
//
//    Iterator<T> iterator();
//
//}
//
//
///**
// * 迭代器，提供v五十具体实现，遍历容器中每个元素的能力
// * 参数类型
// * E - 此迭代器返回的元素的类型
// */
//public interface Iterator<E> {
//    //如果迭代还有下一个元素，则返回true 。 （换句话说，如果next()返回一个元素而不是抛出一个异常，则返回true ）
//    boolean hasNext();
//
//    //    返回迭代中的下一个元素。
//    E next();
//
//    //    从底层集合中删除此迭代器返回的最后一个元素（可选操作）。 此方法只能调用一次next() 。
//// 如果底层集合在迭代过程中以任何方式进行修改而不是通过调用此方法，则迭代器的行为是未指定的。
//    default void remove() {
//        throw new UnsupportedOperationException("remove");
//    }
//
//}
//    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//
//        Iterator<Integer> iterator = list.iterator();
//        System.out.println(iterator.hasNext());
//
//        Iterable<Integer> iterable = list;
//
//        Iterator<Integer> iterator1 = iterable.iterator();
//        System.out.println(((ArrayList<Integer>) iterable).size());
//
//    }