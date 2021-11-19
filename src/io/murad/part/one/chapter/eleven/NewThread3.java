package io.murad.part.one.chapter.eleven;

//Create multiple threads
public class NewThread3 implements Runnable {

	String name; // thread name
	Thread t;

	public NewThread3(String threadName) {
		this.name = threadName;
		t = new Thread(this, name);
		System.out.println("New Thread: " + t);
	}

	// this is the entry point for thread.
	@Override
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(name + ": " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(name + "interrupted");
		}

		System.out.println(name + " exiting..");
	}

}
