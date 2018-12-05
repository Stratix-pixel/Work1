package HomeworkWeek11.Problem2;


public class Thread1 implements Runnable{

    @Override
    public void run()
    {
        getThread(50);
    }

    public void getThread(int counter)
    {
        Thread th = new Thread();
        if(counter != 1){
            getThread(counter - 1);
        }
        System.out.println("Hello from " + th.getName());
    }
}
