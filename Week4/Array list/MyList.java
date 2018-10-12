public interface MyList {

    int get(int index);
    void put(int index, int value);
    int getLength();
    boolean contains(int value);
    void addAll(MyList otherList);

}
