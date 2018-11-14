package LambdaFunctions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaWithClasses {
    private List<Integer> numbers = Stream.of( 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ).collect( Collectors.toList( ) );

  
    public List<Integer> pow () {
        return apply(new Function() {
            @Override
            public int apply(int n) {

                return (int) Math.pow(n,2);
            }
        });
    }

   
    public  List<Integer> divideBy (int d) {
        return filterBy(new Predicate() {
            @Override
            public boolean accept(int n) {
                return n%d==0;
            }
        });
    }



    public List<Integer> greaterThan( int limit )
    {
        return filterBy( new Predicate( )
        {
            @Override
            public boolean accept( int n )
            {
                return n > limit;
            }
        } );
    }

    public List<Integer> lessThan( int limit )
    {
        return filterBy( new LessThan( limit ) );
    }

    public List<Integer> filterBy( Predicate p )
    {
        List<Integer> result = new ArrayList<>( );

        for( Integer n : numbers )
        {
            if( p.accept( n ) )
            {
                result.add( n );
            }
        }

        return result;
    }


    public List<Integer> apply( Function f )
    {
        List<Integer> result = new ArrayList<>( );
        for( Integer n : numbers )
        {
                result.add( f.apply(n) );
        }
        return result;
    }

}


interface Predicate
{
    boolean accept(int number);
}

interface Function {
    int apply(int number);
}

class LessThan implements Predicate
{
    private int limit;

    public LessThan( int limit )
    {
        this.limit = limit;
    }

    @Override
    public boolean accept( int number )
    {
        return number < limit;
    }
}

class LambdasTestClasses
{
    public static void main( String[] args )
    {
        LambdaWithClasses lambda = new LambdaWithClasses( );

        System.out.println( "Greater than 2: " + lambda.greaterThan( 2 ) );
        System.out.println( "Less than 2: " + lambda.lessThan( 2 ) );
        System.out.println("Numbers diveded by 2: " + lambda.divideBy(2));
        System.out.println("Numbers ^ 2: " + lambda.pow());
    }
}
