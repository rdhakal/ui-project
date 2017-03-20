package com.cubic.threading;

public class Thread2 extends Thread{
	ThreadingSynchronization ts2;
	public Thread2(ThreadingSynchronization ts2) {
		super();
		this.ts2 = ts2;
	}
public void run() {
		
	ts2.Alphabet();
		
	}
	
	
}
