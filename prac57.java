package pack13;

import java.util.ArrayList;
import java.util.Arrays;

public class prac57 {
    public static void main(String[] args) {
        int[] arr1 = new int[6];
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0, 3);
        list.add(0,6);
        System.out.println(list);
    }

    public boolean threeConsecutiveOdds(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
        int num1 = 0;
        int num2 = 1;
        int num3 = 2;

        while (num3 < list.size()) {
            int i = list.get(num1);
            int j = list.get(num2);
            int k = list.get(num3);
            if (uneven(i) && uneven(j) && uneven(k)) {
                return true;
            }
            i++;
            k++;
            j++;
        }
        return false;
    }
    public boolean uneven(int x){
        return x % 2 != 0;
    }
}


