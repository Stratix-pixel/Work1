package ex6.oddeven;

public class Even implements Runnable
{
    private Semaphore semaphore;

    public Even( Semaphore semaphore )
    {
        this.semaphore = semaphore;
    }

    @Override
    public void run( )
    {
        for( int n = 0; n < 50; n += 2 )
        {
            while ( !semaphore.isEvenAllowed() );
            printNumber( n );
            semaphore.allowOdd();
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
