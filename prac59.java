package pack15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class prac59 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

//        Iterable<Integer> iterable = arrayList;
//
//        Iterator<Integer> iterator = iterable.iterator();

//        Iterator<Integer> iterat = arrayList.iterator();
//
//        System.out.println(iterat.hasNext());
//        System.out.println(iterat.next());
//        System.out.println(iterat.hasNext());
//        System.out.println(iterat.next());
//        System.out.println(iterat.hasNext());
//        System.out.println(iterat.next());
//        System.out.println(iterat.hasNext());
//        System.out.println(iterator.next());


        Collection<Integer> collection = arrayList;
        System.out.println(collection);
//        System.out.println(collection);
        System.out.println(collection.iterator().hasNext());
        System.out.println(collection.add(4));
        System.out.println(collection);
        ((ArrayList<Integer>) collection).add(1, 5);
        System.out.println(collection);

        Integer[] arr1 = {};
//        arr1[0] = 1;
        System.out.println(arr1.length);
        System.out.println(Arrays.toString(arr1));

    }
    }
