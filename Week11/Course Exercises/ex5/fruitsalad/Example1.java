package ex5.fruitsalad;

public class Example1
{
    public static void main( String[] args )
    {
        Fruit banana = new Fruit( "banana", 3 );
        Fruit apple = new Fruit( "apple", 2 );
        Fruit orange = new Fruit( "orange", 4 );

        banana.start();
        apple.start();
        orange.start();
    }
}
