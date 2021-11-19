package io.murad.part.one.chapter.eleven;

public class DemoJoin {

	public static void main(String[] args) {
		NewThread4 nt1 = new NewThread4("One");
		NewThread4 nt2 = new NewThread4("Two");
		NewThread4 nt3 = new NewThread4("Three");

		// start the threads
		nt1.t.start();
		nt2.t.start();
		nt3.t.start();

		System.out.println("Thread one is alive: "+nt1.t.isAlive());
		System.out.println("Thread two is alive: "+nt2.t.isAlive());
		System.out.println("Thread two is alive: "+nt3.t.isAlive());
		
		//waiting for threads to finish
		try {
			System.out.println("Waiting for threads to finish");
			nt1.t.join();
			nt2.t.join();
			nt3.t.join();
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted");
		}
		
		System.out.println("Thread one is alive: "+nt1.t.isAlive());
		System.out.println("Thread two is alive: "+nt2.t.isAlive());
		System.out.println("Thread two is alive: "+nt3.t.isAlive());
		
		System.out.println("Main thread exiting...");
	}


}
