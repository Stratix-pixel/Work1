package ex3.postoffice;

import java.util.stream.IntStream;

public class Sender implements Runnable
{
    private String message;

    public Sender( String message )
    {
        this.message = message;
    }

    @Override
    public void run( )
    {
        IntStream.range(0,10000).forEach(i -> System.out.print( " " + message ));
    }



}
