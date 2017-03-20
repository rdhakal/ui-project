package com.cubic.threading;

public class Thread1 extends Thread{

	ThreadingSynchronization ts1; //entity reference
	public Thread1(ThreadingSynchronization ts1) {
		super();
		this.ts1 = ts1;
	}
	public void run() {
		
		ts1.Alphabet();
		
	}
	
}
