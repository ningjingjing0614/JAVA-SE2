package pack18;

public class myInteratorPrC67 implements myInteratorPrac66 {

    myArrayListPrac65 arrayList;
    int index;

    public myInteratorPrC67(myArrayListPrac65 arrayList) {
        this.arrayList = arrayList;
        index = 0;
    }

    @Override
    public boolean hasNext() {

        return index < arrayList.size;
    }

    @Override
    public Integer next() {
        Integer e =  arrayList.get(index + 1);
        index ++;
        return e;
    }
}
