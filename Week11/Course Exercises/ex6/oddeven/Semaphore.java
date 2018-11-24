package ex6.oddeven;

public class Semaphore
{
    private int state = 0;

    public void allowOdd()
    {
        state = 1;
    }

    public void allowEven()
    {
        state = 0;
    }

    public boolean isOddAllowed()
    {
        return state == 1;
    }

    public boolean isEvenAllowed()
    {
        return state == 0;
    }
}
