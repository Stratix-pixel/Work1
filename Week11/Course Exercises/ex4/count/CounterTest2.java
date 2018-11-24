package ex4.count;

public class CounterTest2
{
    public static void main( String[] args ) throws Exception
    {
        Thread count1 = new Thread( new Counter() );
        Thread count2 = new Thread( new Counter() );

        count1.start();
        count2.start();

        count1.join();
        count2.join();

        //TODO make it print 2000

        System.out.println( Counter.iterationCounter );
    }
}
