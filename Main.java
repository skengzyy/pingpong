public class Main {
    public static void main(String[] args) throws InterruptedException {

        // Runnable-Version
        PingPongR pingR = new PingPongR("Ping (R)");
        PingPongR pongR = new PingPongR("Pong (R)");

        Thread t1 = new Thread(pingR);
        Thread t2 = new Thread(pongR);

        // Thread-Version
        PingPongT pingT = new PingPongT("Ping (T)");
        PingPongT pongT = new PingPongT("Pong (T)");

        // Start all
        t1.start();
        t2.start();
        pingT.start();
        pongT.start();

        // Wait 10 seconds
        Thread.sleep(10_000);

        // Stop all
        pingR.stopRunning();
        pongR.stopRunning();
        pingT.stopRunning();
        pongT.stopRunning();

        // Optional: wait for clean exit
        t1.join();
        t2.join();
        pingT.join();
        pongT.join();

        System.out.println("All threads stopped cleanly.");
    }
}

