package io.murad.part.one.chapter.eleven;

//Create s second thread.
public class NewThread implements Runnable {

	Thread t;

	public NewThread() {
		// Create a new, second thread
		t = new Thread(this, "Demo Thread");
		System.out.println("Child Thread: " + t);
	}

	// This is entry point for second thread
	@Override
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Child Thread: " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("Child interrupted.");
		}

		System.out.println("Exiting child thread...");
	}

}
