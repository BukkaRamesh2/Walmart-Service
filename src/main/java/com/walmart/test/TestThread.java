package com.walmart.test;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Resource{
	
	//  create a method with void
	
	private final Lock lock = new ReentrantLock();
	
	
	public synchronized void createUser(Resource  r) {
		try {
			
			
		if(lock.tryLock(50, TimeUnit.MILLISECONDS))
		System.out.println(Thread.currentThread().getName() + " calling create user:  ");
		try {
		Thread.sleep(100);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		r.updateUser(this);
		}catch(InterruptedException ex){
			ex.printStackTrace();
		}finally {
			lock.unlock();
		}
		
		
	}
	
	public synchronized void updateUser(Resource r) {
		try {
		if(lock.tryLock(50, TimeUnit.MILLISECONDS))
		System.out.println(Thread.currentThread().getName() + " calling update user: ");
		try {
		Thread.sleep(100);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		r.createUser(this);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
		
	}
}



public class TestThread implements Runnable{

	@Override
	public void run() {
		for(int i=1; i<5; i++) {
			System.out.println(Thread.currentThread().getName() + " Count: " +i);
			try {
			Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		//TestThread tt = new TestThread(); /// object belongs to this class
	//	TestThread t2 = new TestThread();
		
		Resource r1 = new Resource();
		Resource r2 = new Resource();
	
		
		
		Thread t1 = new Thread(() -> r1.createUser(r2), "Thread 1 ");
		Thread t2 = new Thread(() -> r2.createUser(r1), "Thread 2");
		
		
		
		t1.start();
		t2.start();
	}
	
}
