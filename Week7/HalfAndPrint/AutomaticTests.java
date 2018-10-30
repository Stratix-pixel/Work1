package HalfAndPrint;

import org.junit.Assert;
import org.junit.Test;

public class AutomaticTests {

    Half half = new Half();

    @Test
    public void whenValueIsZeroHalfShouldbeZero() {
        Assert.assertEquals(0, half.evaluate(0));
    }

    @Test
    public void whenValueIsTenHalfShouldbeFive() {
        Assert.assertEquals(5, half.evaluate(10));
    }

    @Test
    public void whenValueIs100tHalfShouldbe50() {
        Assert.assertEquals(50, half.evaluate(100));
    }

    @Test
    public void whenValueIsMinus100HalfShouldbeMinus50() {
        Assert.assertEquals(-50, half.evaluate(-100));
    }

    @Test
    public void whenValueIs5HalfShouldBe2() {
        Assert.assertEquals(2, half.evaluate(5));
    }

    @Test
    public void whenValueIs63HalfShouldBe31() {
        Assert.assertEquals(31, half.evaluate(63));
    }

    @Test
    public void whenArbitraryArrayFromMethodOfComputeClassHasLength20ThenTheArrayObtainedShouldHaveLength20Too() {
        Compute compute = new Compute();
        int[] arrayOfInts = new int[20];
        Assert.assertEquals(20, compute.divideArray(arrayOfInts, half).length);
    }

    @Test
    public void whenApplyingHalfFunctionOnTheFirstElementOfAnArrayOfValue4Result2() {
        Compute compute = new Compute();
        Half function = new Half();
        int[] arrayOfInts = new int[2];
        arrayOfInts[0] = 4;
        Assert.assertEquals(2, compute.divideArray(arrayOfInts, function)[0]);
    }

    @Test
    public void whenApplyingHalfFunctionOnThe9thElementOfAnArrayOfValue97Result48() {
        Compute compute = new Compute();
        int[] arrayOfInts = new int[10];
        arrayOfInts[9] = 97;
        Assert.assertEquals(48, compute.divideArray(arrayOfInts, half)[9]);
    }

    @Test
    public void whenPrint5Then5isShownOnTheScreenAnd5isTheExpectedValue() {
        Print print = new Print();
        Assert.assertEquals(5, print.evaluate(5));
    }

}
