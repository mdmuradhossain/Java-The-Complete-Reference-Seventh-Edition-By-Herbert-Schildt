package io.murad.part.one.chapter.eleven;

public class Caller implements Runnable {

	String msg;
	Callme target;
	Thread t;

	public Caller(Callme target, String s) {
		this.target = target;
		this.msg = s;
		t = new Thread(this);
	}

	@Override
	public void run() {
		synchronized (target) {
			target.call(msg);
		}

	}

}
