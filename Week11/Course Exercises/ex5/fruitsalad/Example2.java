package ex5.fruitsalad;

public class Example2
{
    public static void main( String[] args )
    {
        Fruit banana = new Fruit( "banana", 3 );
        Fruit apple = new Fruit( "apple", 2 );
        Fruit orange = new Fruit( "orange", 4 );
        Fruit melon = new Fruit( "melon", 1 );
        Fruit grapes = new Fruit( "grapes", 2 );
        Fruit pear = new Fruit( "pear", 1 );

        banana.start();
        apple.start();
        orange.start();
        melon.start();
        grapes.start();
        pear.start();
    }
}
