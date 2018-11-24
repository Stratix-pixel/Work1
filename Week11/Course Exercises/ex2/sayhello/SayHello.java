package ex2.sayhello;

public class SayHello implements Runnable {
    private String threadn;

    public SayHello(String threadname) {
        this.threadn = threadname;
    }

    @Override
    public void run() { hello(); }


    private void hello() {
        System.out.print("Hello from a %s!%n", threadn);
    }

}
