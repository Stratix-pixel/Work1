package ex2.sayhello;

public class SayHelloTest
{
    public static void main( String[] args )
    {
        //TODO say hello from a thread

        SayHello t1 = new SayHello( "First Thread");
        t1.run();
        Thread tt = new Thread(t1,"name");
        tt.start();

        System.out.println( "Hello from main!" );

        //TODO say hello from four more threads
        Thread thread2 = new Thread(new SayHello("Second Thread"));
        thread2.start();
        Thread thread3 = new Thread(new SayHello("Third Thread"));
        thread3.start();
        Thread thread4 = new Thread(new SayHello("Forth Thread"));
        thread4.start();
        Thread thread5 = new Thread(new SayHello("Fifth Thread"));
        thread5.start();


        //TODO say hello from each thread, and have the thread tell you its name




    }
}
