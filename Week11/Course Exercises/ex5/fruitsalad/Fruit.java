package ex5.fruitsalad;

import java.util.stream.IntStream;

public class Fruit extends Thread
{
    private String name;
    private long   sleepSeconds;

    public Fruit( String name, long sleepSeconds )
    {
        this.name = name;
        this.sleepSeconds = sleepSeconds;
    }

    @Override
    public void run( )
    {
        IntStream.range( 0, 10 ).forEach( i -> {
            sleep( );
            printInfo( i );
        } );
    }

    private void sleep( )
    {
        try
        {
            Thread.sleep( sleepSeconds * 1000 );
        }
        catch( InterruptedException e )
        {
            e.printStackTrace( );
        }
    }

    private void printInfo( int iteration )
    {
        System.out.printf( "%02d", System.currentTimeMillis( ) / 1000 % 60 );
        System.out.println( name + " " + iteration );
    }
}
