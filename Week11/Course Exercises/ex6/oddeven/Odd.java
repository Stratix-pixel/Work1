package ex6.oddeven;

public class Odd implements Runnable
{
    private Semaphore semaphore;

    public Odd( Semaphore semaphore )
    {
        this.semaphore = semaphore;
    }

    @Override
    public void run( )
    {
        for( int n = 1; n < 50; n += 2 )
        {
            while (!semaphore.isOddAllowed() );
            printNumber( n );
            semaphore.allowEven();
            sleep();
        }
    }

    private void printNumber( int number )
    {
        System.out.print( number + " " );
    }

    private void sleep( )
    {
        try
        {
            Thread.sleep( 0,1 );
        }
        catch( InterruptedException e )
        {
            e.printStackTrace( );
        }
    }
}
