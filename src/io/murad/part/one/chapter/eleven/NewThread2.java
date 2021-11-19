package io.murad.part.one.chapter.eleven;

public class NewThread2 extends Thread{

	public NewThread2() {
		// Create a new, second thread
		super("Demo Thread");
		System.out.println("Child Thread: " + this);
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
