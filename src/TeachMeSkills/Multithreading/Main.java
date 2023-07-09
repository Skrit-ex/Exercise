package TeachMeSkills.Multithreading;

public class Main {
    public static void main(String[] args) {

        Thread thread = new Thread(new MyWorker1());
        Thread thread1 = new Thread(new MyWorker2());

        thread.start();
        thread1.start();
    }
}
