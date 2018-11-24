package ex4.count;

public class CounterTest1
{
    public static void main( String[] args ) throws Exception
    {
        Thread count = new Thread( new Counter() );

        count.start();
        count.join();

        //TODO make it print 1000

        System.out.println( Counter.iterationCounter );
    }
}
