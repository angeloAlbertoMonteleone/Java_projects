public class ThreadExample extends Thread{
    @Override
    public void run() {
        System.out.println("I am a thread " + getName());

        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
