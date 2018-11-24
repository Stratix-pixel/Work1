package ex4.count;

public class Counter implements Runnable
{
    public static int iterationCounter = 0;

    @Override
    public void run( )
    {
        for( int i = 0; i < 1000; i++ )
        {
            synchronized ( Counter.class ) {
                iterationCounter++;
            }
            sleep();
        }
    }

    private void sleep()
    {
        try
        {
            Thread.sleep( 1 );
        }
        catch( InterruptedException e )
        {
            e.printStackTrace( );
        }
    }
}
