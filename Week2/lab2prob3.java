public class lab2prob3 {
    public static void main(String[] args){
        int[] myArray1 = {5,10,18,25,63};
        int[] myArray2 = {6,11,12,22,27,44,99};
        int[] mergeArray = myMerge(myArray1,myArray2);
        for(int i: mergeArray){
            System.out.print(i+ " ");
        }
    }

    private static int[] myMerge(int[] myArray1, int[] myArray2) {
        int[] mergeArray = new int[myArray1.length + myArray2.length];
        int index1 = 0;
        int index2 = 0;
        int index3 = 0;
        while (index1 < myArray1.length && index2 < myArray2.length){
            if(myArray1[index1] <= myArray2[index2]){
                mergeArray[index3] = myArray1[index1];
                index1++;
            }else {
                mergeArray[index3] = myArray2[index2];
                index2++;
            }
            index3++;
        }

        mergeArray = mergeRemaining(mergeArray,index3,myArray1,index1);
        mergeArray = mergeRemaining(mergeArray,index3,myArray2,index2);

        return mergeArray;
    }

    public static int[] mergeRemaining(int[] mergeArray,
                                       int index,
                                       int[] remainingArray,
                                       int index2){
        if(index2<remainingArray.length){
            for(int i=index2; i<remainingArray.length; i++){
                mergeArray[index]=remainingArray[i];
                index++;
            }
        }
        return mergeArray;
    }
}