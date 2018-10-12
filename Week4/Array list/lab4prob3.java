public class lab4prob3 implements MyList {
    int[] myArray = new int[10];

    @Override
    public int get(int index) {
        if (index < 0) {
            return 0;
        }
        checkCapacity(index);
        return myArray[index];
    }

    private void checkCapacity(int index) {
        if (index > myArray.length) {
            int[] newArray = new int[index * 2];
            for (int i = 0; i < myArray.length; i++) {
                newArray[i] = myArray[i];
            }
            myArray = newArray;
        }
    }

    @Override
    public void put(int index, int value) {
        checkCapacity(index);
        myArray[index] = value;
    }


    @Override
    public int getLength() {
        return myArray.length;
    }

    @Override
    public boolean contains(int value) {
        for (int element : myArray) {
            if (element == value) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void addAll(MyList otherList) {
        int[] lastArray = new int[this.getLength() + otherList.getLength()];
        int i = 0;
        for(int elem : myArray){
            lastArray[i] = elem;
            i++;
        }
        int j = 0;
        for (int ind = myArray.length; ind < lastArray.length; ind++){
            lastArray[ind] = otherList.get(j);
            j++;
        }
        myArray = lastArray;
    }

    public static void main(String[] args) {
        MyList list = new lab4prob3();
        list.put(11,80);
        list.put(10,90);
        list.put(5,70);
        list.put(9,50);
      /*  for (int i = 0; i < list.getLength(); i++) {
            System.out.print(list.get(i) + " ");
        }*/
        MyList list2 = new lab4prob3();
        list.put(7,73);
        list.put(8,75);
        list.put(3,69);
        list.put(4,44);

        list.addAll(list2);
        for (int i = 0; i < list.getLength(); i++) {
            System.out.print(list.get(i) + " ");
        }

    }
}

