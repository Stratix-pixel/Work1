package SumArray;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TestArray {

        @Test
        public void when_array_is_empty_final_result_should_be_zero( )  throws Exception  {

            int [] array = new int[0];

            int[] firstHalf = Arrays.copyOfRange(array, 0, array.length / 2);
            int[] secondHalf = Arrays.copyOfRange(array, array.length / 2, array.length);

            int[] firstQuarter = Arrays.copyOfRange(firstHalf, 0, firstHalf.length / 2);
            int[] secondQuarter = Arrays.copyOfRange(firstHalf, firstHalf.length / 2, firstHalf.length);
            int[] thirdQuarter = Arrays.copyOfRange(secondHalf, 0, secondHalf.length / 2);
            int[] fourthQuarter = Arrays.copyOfRange(secondHalf, secondHalf.length / 2, secondHalf.length);

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

            Assert.assertEquals(0, finalResult);

        }

    @Test
    public void when_array_has_twelve_values_of_one_the_final_result_should_be_twelve( )  throws Exception  {

        int [] array = {1,1,1,1,1,1,1,1,1,1,1,1};

        int[] firstHalf = Arrays.copyOfRange(array, 0, array.length / 2);
        int[] secondHalf = Arrays.copyOfRange(array, array.length / 2, array.length);

        int[] firstQuarter = Arrays.copyOfRange(firstHalf, 0, firstHalf.length / 2);
        int[] secondQuarter = Arrays.copyOfRange(firstHalf, firstHalf.length / 2, firstHalf.length);
        int[] thirdQuarter = Arrays.copyOfRange(secondHalf, 0, secondHalf.length / 2);
        int[] fourthQuarter = Arrays.copyOfRange(secondHalf, secondHalf.length / 2, secondHalf.length);

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

        Assert.assertEquals(12, finalResult);

    }

    @Test
    public void when_array_has_twelve_values_of_minus_one_the_final_result_should_be_minus_twelve( )  throws Exception  {

        int [] array = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};

        int[] firstHalf = Arrays.copyOfRange(array, 0, array.length / 2);
        int[] secondHalf = Arrays.copyOfRange(array, array.length / 2, array.length);

        int[] firstQuarter = Arrays.copyOfRange(firstHalf, 0, firstHalf.length / 2);
        int[] secondQuarter = Arrays.copyOfRange(firstHalf, firstHalf.length / 2, firstHalf.length);
        int[] thirdQuarter = Arrays.copyOfRange(secondHalf, 0, secondHalf.length / 2);
        int[] fourthQuarter = Arrays.copyOfRange(secondHalf, secondHalf.length / 2, secondHalf.length);

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

        Assert.assertEquals(-12, finalResult);

    }


}
