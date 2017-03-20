package com.cubic.threading;

public class Testing {

	public static void main(String[] args) {

		ThreadingSynchronization TS1= new ThreadingSynchronization();
			Thread1 m1 = new Thread1 (TS1);
			Thread2 m2 = new Thread2 (TS1);
			m1.start();
			m2.start();
	}

}
