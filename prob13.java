import java.util.Scanner;

public class prob13 {

    public static void main(String[] args) {

        int x1,x2,x3,x4,y1,y2,y3,y4;

        Scanner sc = new Scanner(System.in);

        System.out.print("Please insert the column for the knight: ");
        int a = sc.nextInt();

        System.out.print("Please insert the row for the knight: ");
        int b = sc.nextInt();

        x1 = a - 2;
        x2 = a - 1;
        x3 = a + 1;
        x4 = a + 2;

        y1 = b - 1;
        y2 = b + 1;
        y3 = b - 2;
        y4 = b + 2;

        System.out.println("The knight can move to the following positions: ");

        if(x1 > 0 && x1 <= 8)
        {
            if (y1 > 0 && y1 <= 8)
            {
                System.out.print("(" + x1 + "," + y1 + ") ");
            }
            else if (y2 > 0 && y2 <= 8)
            {
                System.out.print("(" + x1 + "," + y2 + ") ");
            }
        }
        if(x2 > 0 && x2 <= 8)
        {
            if (y3 > 0 && y3 <= 8)
            {
                System.out.print("(" + x2 + "," + y3 + ") ");
            }
            else if (y4 > 0 && y4 <= 8)
            {
                System.out.print("(" + x2 + "," + y4 + ") ");
            }
        }

        if(x3 > 0 && x3 <= 8)
        {
            if (y3 > 0 && y3 <= 8)
            {
                System.out.print("(" + x3 + "," + y3 + ") ");
            }
            else if (y4 > 0 && y4 <= 8)
            {
                System.out.print("(" + x3 + "," + y4 + ") ");
            }
        }

        if(x4 > 0 && x4 <= 8)
        {
            if (y1 > 0 && y1 <= 8)
            {
                System.out.print("(" + x4 + "," + y1 + ") ");
            }
            else if (y2 > 0 && y2 <= 8)
            {
                System.out.print("(" + x4 + "," + y2 + ") ");
            }

        }
    }
}

