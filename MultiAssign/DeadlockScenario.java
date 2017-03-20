package com.cubic.threading;

public class DeadlockScenario extends Thread{

	public static void main(String[] args) {
		   final String Para1 = "Subin";  
		    final String Para2 = "Shahukhal";  
		    // Thread1  tries to lock Parameter1 then Parameter2  
		    Thread T1 = new Thread() {  
		      public void run() {  
		          synchronized (Para1) {  
		           System.out.println("Thread 1: locked with parameter 1");  
		           try { 
		        	   Thread.sleep(100);} 
		           catch (Exception e) {}  
		           synchronized (Para2) {  
		            System.out.println("Thread 1: locked with parameter 2");  
		           }  
		         }  
		      }  
		    };  
		  
		    // Thread2  tries to lock Parameter2 then Parameter1  
		    Thread T2 = new Thread() {  
		      public void run() {  
		        synchronized (Para2) {  
		          System.out.println("Thread 2: locked with parameter 2");  
		          
		          try { Thread.sleep(100);} 
		          catch (Exception e) {}  
		          synchronized (Para1) { 
		        	 System.out.println("Thread 2: locked with parameter 1");  
		          }  
		        }  
		      }  
		    };  
		  
		    T1.start();  
		    T2.start();  
		  }  

	}
