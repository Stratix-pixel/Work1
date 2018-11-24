package ex6.oddeven;

public class OddAndEven
{
    public static void main( String[] args )
    {
        Semaphore semaphore = new Semaphore();

        Thread oddThread  = new Thread( new Odd( semaphore ) );
        Thread evenThread = new Thread( new Even( semaphore ) );

        evenThread.start( );
        oddThread.start( );
    }
}
