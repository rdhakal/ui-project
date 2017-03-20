package com.cubic.threading;

public class ThreadingSynchronization {
	
	synchronized void Alphabet(){
		char[] alpharr={'a','e','i','o','u'};
		for (int i=0;i<=4;i++){
	    System.out.print(alpharr[i]);
	    try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	}
}