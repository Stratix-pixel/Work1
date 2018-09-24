import java.util.Scanner;
public class prob3 {

    public static void main(String[] args) {
        //lab1, prob3

        int h,m,s,sum,res;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter number of hours: ");

        h = sc.nextInt();


        System.out.println("The hours value is : " + h);

        System.out.println("Please enter number of minutes: " );

        m = sc.nextInt();


        System.out.println("The minutes value is : " + m);

        System.out.println("Please enter number of seconds: " );

        s = sc.nextInt();

        System.out.println("The seconds value is : " + s);


        int condm = (m <= 60) && (m >= 0) ? m : -1;

        int conds = (s <= 60) && (s >= 0) ? s : -1;
        int condh = (h >= 0) ? h : -1;

        //System.out.println(condh);

        System.out.println( (condh == -1) ? "Invalid hours value" : "" );
        System.out.println( (condm == -1) ? "Invalid minutes value" : "");
        System.out.println( (conds == -1) ? "Invalid seconds value" : "");

        res = 1000;
        s *= res;
        m *= 60*res;
        h *= 60*60*res;

        int ssum = m + h;
        int msum = s + h;
        int hsum = m + s;

        boolean summ = (condh != -1) && (condm != -1) && (conds != -1);
        boolean summm = (condh == -1) && (condm == -1) && (conds == -1);

        sum = s + m + h;

        System.out.println( (condh != -1) ? "The number of milliseconds for the given hours :" + h : "Cannot convert negative hours value");
        System.out.println( (condm != -1) ? "The number of milliseconds for the given minutes :" + m : "Cannot convert negative minutes value");
        System.out.println( (conds != -1) ? "The number of milliseconds for the given seconds :" + s : "Cannot convert negative seconds value");


        System.out.println( summ ? "\nThe total number of milliseconds for the values given :" + sum :
                (summm ? "Cannot sum negative values" :
                        ((condh == -1) && (condm == -1) ? "The total number of milliseconds for the given values : " + s :
                                ((condm == -1) && (conds == -1) ? "The total number milliseconds for the given values : " + h :
                                        ((conds == -1) && (condh == -1) ? "The total number milliseconds for the given values : " + m :
                                                ((condh == -1) ? "The total number of milliseconds for the given values :" + hsum :
                                                        ((condm == -1) ? "The total number of milliseconds for the given values :" + msum :
                                                                ("The total number of milliseconds for the given values :" + ssum))))))));


    }

}

