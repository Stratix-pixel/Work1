package ex1.dice;
import java.util.*;

public class Dice extends Thread
{
    @Override
    public void run( )
    {

        int DiceResult = new Random ().nextInt(6) + 1;
        System.out.println(this.getName() + " result " + DiceResult);

    }


}
