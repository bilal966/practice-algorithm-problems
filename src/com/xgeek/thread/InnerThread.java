package com.xgeek.thread;
/**
 * 
 * @author bilal966
 *
 */
public class InnerThread {

	public static void main(String[] args) {
		Q q = new Q();
		new Produce(q);
		new Consumer(q);
	}
}
class Q{
	int num;
	boolean valueSet = false;
	public synchronized void put(int number) {
		while(valueSet) {
			try {wait(); }catch(Exception e) {}
		}
		System.out.println("Put - "+number);
		this.num = number;
		valueSet = true;
		notify();
		
	}
	public synchronized void get() {
		while(!valueSet) {
			try {wait(); }catch(Exception e) {}
		}
		System.out.println("Get - "+num);
		valueSet = false;
		notify();
	}
}
class Produce implements Runnable{
	Q q;
	public Produce(Q q) {
		this.q = q;
		Thread t = new Thread(this,"Producer Thread");
		t.start();
	}
	@Override
	public void run() {
		int i=0;
		while(true) {
			q.put(i++);
			try { Thread.sleep(1000); } catch(Exception e) { }
		}
		
	}
	
}
class Consumer implements Runnable{
	Q q;
	public Consumer(Q q) {
		this.q = q;
		Thread t = new Thread(this,"Consumer Thread");
		t.start();
	}
	@Override
	public void run() {
		while(true) {
			q.get();
			try { Thread.sleep(1000); } catch(Exception e) { }
		}
		
	}
	
}