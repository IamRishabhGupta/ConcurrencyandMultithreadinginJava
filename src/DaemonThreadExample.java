public class DaemonThreadExample {

    public static void main(String[] args) {
        System.out.println("Main thread starts.");

        // Create a user thread
        Thread userThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("User thread starts.");
                try {
                    Thread.sleep(5000); // Simulate work for 5 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("User thread ends.");
            }
        });

        // Create a daemon thread
        Thread daemonThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Daemon thread starts.");
                try {
                    while (true) {
                        Thread.sleep(1000); // Daemon thread does continuous work
                        System.out.println("Daemon thread is running...");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Daemon thread ends.");
            }
        });

        // Set the daemon thread to be a daemon
        daemonThread.setDaemon(true);

        // Start both threads
        userThread.start();
        daemonThread.start();

        // Main thread ends
        System.out.println("Main thread ends.");
    }
}
