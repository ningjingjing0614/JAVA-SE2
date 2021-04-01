package pack18;

public interface myListPrac64 {

    boolean add(int e);
    void add(int index ,Integer e);

    Integer remove(int index);
    boolean remove(Integer e);

    Integer get(int index);

    Integer set(int index, Integer e);

    boolean contains(Integer e);

    int indexOf(Integer e);
    int lastIndexOf(Integer e);

    void clear();
    boolean isEmpty();

    Integer size();

    myInteratorPrac66 iterator();
}
