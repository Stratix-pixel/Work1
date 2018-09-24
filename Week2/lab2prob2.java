public class lab2prob2 {

    public static void main(String[] args) {
        int[] myArray = {-89, -23, 0, 1, 3, 10, 15, 39, 491, 592, 1003};
        int index = myBinarySearch2(myArray, 1003,0,myArray.length-1);
        System.out.print(index);
    }

    private static int myBinarySearch(int[] myArray, int i) {
        int index = -1;
        int start = 0;
        int end = myArray.length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (myArray[middle] < i) {
                start = middle + 1;
            } else if (myArray[middle] > i) {
                end = middle - 1;
            } else {
                index = middle;
                break;
            }
        }
        return index;
    }

    private static int myBinarySearch2(int[] myArray, int i, int start, int end) {
        if (start <= end){
            int middle = (start + end)/2;
            if(i < myArray[middle]){
                return myBinarySearch2(myArray, i , start,middle-1);
            }
            if(i > myArray[middle]){
                return myBinarySearch2(myArray,i,middle+1,end);

            }
            return middle;
        }
        return -1;
    }
}
