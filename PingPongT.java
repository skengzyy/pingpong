public class PingPongT extends Thread {

    private final String text;
    private volatile boolean running = true;

    public PingPongT(String text) {
        this.text = text;
    }

    public void stopRunning() {
        running = false;
    }

    @Override
    public void run() {
        while (running) {
            System.out.println(text);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                interrupt();
                break;
            }
        }

        System.out.println(text + " (Thread) stopped.");
    }
}

