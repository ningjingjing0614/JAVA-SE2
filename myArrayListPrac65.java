package pack18;

import java.lang.reflect.Array;
import java.util.Arrays;

public class myArrayListPrac65 implements myListPrac64 {

    Integer[] array;
    int size;

    public myArrayListPrac65() {
        array = new Integer[20];
        size = 0;
    }

    public void dilatation(){
        if (size < array.length){
            return ;
        }
        Integer[] newarray = new Integer[array.length * 2];
        for (int i = 0; i < array.length; i ++){
            newarray[i] = array[i];
        }
        this.array = newarray;
    }

    @Override
    public boolean add(int e) {
        dilatation();
        array[size] = e;
        size++;
        return true;
    }

    @Override
    public void add(int index, Integer e) {
        dilatation();
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("下标越界异常");
        } else if (index == size) {
            add(e);
        } else {
            for (int i = size - 1; i <= index; i++) {
                array[i + 1] = array[i];
            }
            array[index] = e;
        }
        size++;
    }

    @Override
    public Integer remove(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("下标越界异常");
        }
        Integer e = array[index];
        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = null;
        size--;
        return e;
    }

    @Override
    public boolean remove(Integer e) {
//        int tmp = 0;
//        for (int i = 0; i < size; i++) {
//            if (array[i].equals(e)){
//                tmp = i;
//                return true;
//            }
//        }
//        for (int i = tmp; i < size; i++) {
//            array[i] = array[i + 1];
//        }
//        array[size - 1] = null;
//        size --;
//        return false;
        int i = indexOf(e);
        if (i < 0){
            return false;
        }
        remove(i);
        return true;
    }

    @Override
    public Integer get(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("下标越界异常");
        }
        return array[index];
    }

    @Override
    public Integer set(int index, Integer e) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("下标越界异常");
        }
        Integer num = array[index];
        array[index] = e;
        return num;
    }

    @Override
    public boolean contains(Integer e) {
        int i = indexOf(e);
        if (i < 0) {
            return false;
        }
        return true;
    }

    @Override
    public int indexOf(Integer e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(array[i])){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Integer e) {
        for (int i = size - 1; i >= 0; i ++){
            if (e.equals(array[i])){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void clear() {
        Arrays.fill(array, null);
        size = 0;
        return ;
    }

    @Override
    public boolean isEmpty() {
        return size ==0;
    }

    @Override
    public Integer size() {
        return size;
    }

    @Override
    public myInteratorPrac66 iterator() {
        return new myInteratorPrC67(this);
    }

    @Override
    public String toString() {
        Integer[] arr = Arrays.copyOf(array, size);
        return Arrays.toString(arr);
    }


}
