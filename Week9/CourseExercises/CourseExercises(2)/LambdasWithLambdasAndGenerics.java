package LambdaFunctions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdasWithLambdasAndGenerics<T> {
    private List<T> elements = new ArrayList<>(  );

    public void addAll( T... elements )
    {
        this.elements.addAll( Arrays.asList( elements ) );
    }

    public List<T> filterBy( Predicate1<T> p )
    {
        List<T> result = new ArrayList<>( );
        for( T e : elements )
        {
            if( p.accept( e ) )
            {
                result.add( e );
            }
        }
        return result;
    }

    public List<T> apply (Function2<T> f) {
        List<T>result = new ArrayList<>();
        for (T e : elements) {
             result.add(f.apply(e));
        }
        return result;
    }
}

interface Predicate1<T>
{
    boolean accept(T instance);
}
interface Function2<T>{
    T apply (T instance);
}

class User<T> {
    public String firstName;
    public String lastName;

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public User (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

}

class LambdasTest1
{
    //DANIEL a generic container that can filter using any condition any type of object
    public static void main( String[] args )
    {
        LambdasWithLambdasAndGenerics<Integer> lambdaNumbers = new LambdasWithLambdasAndGenerics<>( );//creez o instanta de Lamdas si ii spun tipul Integer
        lambdaNumbers.addAll( 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 );//adaug numerele

        System.out.println( "Greater than 6: " + lambdaNumbers.filterBy( n -> n > 6 ) );
        System.out.println( "Less than 6: " + lambdaNumbers.filterBy( n -> n < 6 ) );
        System.out.println("Numbers diveded by 2: " + lambdaNumbers.filterBy(n-> n%2 == 0) );
        System.out.println("Numbers ^ 2: " + lambdaNumbers.apply(n->(int) Math.pow(n,2)));
        System.out.println("\n");


        LambdasWithLambdasAndGenerics<String> lambdaStrings = new LambdasWithLambdasAndGenerics<>();//instanta de string uri
        lambdaStrings.addAll( "", "abc", "", "", "bcd", "cde", "def" );

        System.out.println( "Non-empty strings: " + lambdaStrings.filterBy( s -> !s.isEmpty() ) );
        System.out.println( "Strings with vowels: " + lambdaStrings.filterBy( s -> s.matches( ".*[aeiou].*" ) ) );
        System.out.println( "Non-empty strings: " + lambdaStrings.filterBy( s -> !s.startsWith("a") ) );
        System.out.println("\n");

        LambdasWithLambdasAndGenerics<User>lambdaUser = new LambdasWithLambdasAndGenerics<User>();
        lambdaUser.addAll(new User ("ion","ionescu"), new User ("vasile","popescu"), new User("vali", "stanescu"), new User("raluca", "padurariu"));
        System.out.println("Users starting with v:" + lambdaUser.filterBy(u -> u.firstName.startsWith("v")));
        System.out.println("Users starting with i:" + lambdaUser.filterBy(u -> u.firstName.startsWith("i")));
        System.out.println("Users with last name Stanescu:" + lambdaUser.filterBy(u -> u.lastName.equals("stanescu")));
        System.out.println("Users with first name Raluca" + lambdaUser.filterBy(u -> u.firstName.matches("raluca")));
        System.out.println("Users with last name ending in escu:" + lambdaUser.filterBy(u -> u.lastName.endsWith("escu")));

    }
}




