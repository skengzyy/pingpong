public class PingPongR implements Runnable {

    private final String text;
    private volatile boolean running = true;

    public PingPongR(String text) {
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
                Thread.currentThread().interrupt();
                break;
            }
        }

        System.out.println(text + " (Runnable) stopped.");
    }
}

