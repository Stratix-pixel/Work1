package SumArray;

import java.util.Arrays;

public class SplitArray extends Thread {

//    Write a program that sums the values from an array of ints using 4 threads.
//    Each thread gets to sum a quarter of the array and stores the result.
//    The main thread needs to start and wait for the above threads to finish, after which it collects the
//    answers and displays the final result.


    int[] array;
    int sum;

    public SplitArray(int[] array) {
        this.array = array;
    }


    @Override
    public void run() {
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(this.getName() + " Sum is : " + sum);

    }

    public int getResult() {

        return sum;
    }




    public static void main(String[] args) throws InterruptedException {

        int[] array = {1,2,3,4,5,6,7,8};

        int[] firstHalf = Arrays.copyOfRange(array, 0, array.length / 2);
        int[] secondHalf = Arrays.copyOfRange(array, array.length / 2, array.length);


        int[] firstQuarter = Arrays.copyOfRange(firstHalf, 0, firstHalf.length / 2);
        int[] secondQuarter = Arrays.copyOfRange(firstHalf, firstHalf.length / 2, firstHalf.length);
        int[] thirdQuarter = Arrays.copyOfRange(secondHalf, 0, secondHalf.length / 2);
        int[] fourthQuarter = Arrays.copyOfRange(secondHalf, secondHalf.length / 2, secondHalf.length);

        System.out.println("First quarter of the array: " + Arrays.toString(firstQuarter));
        System.out.println("Second quarter of the array: " + Arrays.toString(secondQuarter));
        System.out.println("Third quarter of the array: " + Arrays.toString(thirdQuarter));
        System.out.println("Fourth quarter of the array: " + Arrays.toString(fourthQuarter));

        Thread main = Thread.currentThread();
        SplitArray array1 = new SplitArray(firstQuarter);
        array1.start();
        array1.join();
        SplitArray array2 = new SplitArray(secondQuarter);
        array2.start();
        array2.join();
        SplitArray array3 = new SplitArray(thirdQuarter);
        array3.start();
        array3.join();
        SplitArray array4 = new SplitArray(fourthQuarter);
        array4.start();
        array4.join();

        int finalResult = array1.getResult() + array2.getResult() + array3.getResult() + array4.getResult();
        System.out.println("Final result: " + finalResult);

//        boolean b1 = array1.isAlive();
//        boolean b2 = main.isAlive();
//        System.out.println(b1);
//        System.out.println(b2);




    }

}

