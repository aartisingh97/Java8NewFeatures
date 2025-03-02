package com.Thread.practice;

public class ThreadPriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThreadPriority t = new MyThreadPriority();
		t.setPriority(10);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}

	}

}

class MyThreadPriority extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}
}
