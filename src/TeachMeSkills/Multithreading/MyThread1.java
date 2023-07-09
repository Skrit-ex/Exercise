package TeachMeSkills.Multithreading;

public class MyThread1 extends Thread{
    public void run() {
        for (int i =0; i<100; i++){
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(getName() + " " + i);
        }
    }
}
