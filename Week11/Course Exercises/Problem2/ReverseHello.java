package HomeworkWeek11.Problem2;

public class ReverseHello {
    public static void main(String[] args) {
        Thread th = new Thread(new Thread1());
        th.start();
    }
}
