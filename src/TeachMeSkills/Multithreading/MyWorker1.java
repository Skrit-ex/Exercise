package TeachMeSkills.Multithreading;

public class MyWorker1 implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<100; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
}
