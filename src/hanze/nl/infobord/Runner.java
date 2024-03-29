package hanze.nl.infobord;

public class Runner {
	
	public static void thread(Runnable runnable, boolean daemon) {
		Thread brokerThread = new Thread(runnable);
		brokerThread.setDaemon(daemon);
		brokerThread.start();
	}

    public static void main(String[] args) throws Exception {
        thread(new ListenerStarter("(SELECTOR INVULLEN"),false);
    }
}
