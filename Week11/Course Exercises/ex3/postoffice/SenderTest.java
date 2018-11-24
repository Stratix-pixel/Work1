package ex3.postoffice;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SenderTest
{
    public static final String HELLO = "hello";
    private ByteArrayOutputStream messages;

    @Before
    public void before( )
    {
        messages = new ByteArrayOutputStream( );
        System.setOut( new PrintStream( messages ) );
    }

    @Test
    public void one_sender_produces_10000_messages( ) throws Exception
    {

        //TODO call join on the thread instances

        Thread t1 = new Thread( new Sender("text"));
        t1.start();
        t1.join(100);


        Assert.assertEquals( 10000, countMessages( ) );
    }

    @Test
    public void two_senders_produce_20000_messages( ) throws Exception
    {

        //TODO call join on the thread instances

        Assert.assertEquals( 20000, countMessages( ) );
    }

    private int countMessages( )
    {
        return messages.toString( ).trim( ).split( " " ).length;
    }
}
