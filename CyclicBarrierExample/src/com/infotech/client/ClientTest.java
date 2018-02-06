package com.infotech.client;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

import com.infotech.tasks.PassengerThread;

/**
 * * Java Program to demonstrate how to use CyclicBarrier, Its used when number
 * of threads * needs to wait for each other before starting again.
 */
public class ClientTest {
	public static void main(String args[]) throws InterruptedException, BrokenBarrierException {
		
		System.out.println(Thread.currentThread().getName() + " has started");
		
		CyclicBarrier barrier = new CyclicBarrier(4);
		
		PassengerThread p1 = new PassengerThread(1000, barrier, "John");
		PassengerThread p2 = new PassengerThread(2000, barrier, "Martin");
		PassengerThread p3 = new PassengerThread(3000, barrier, "Joya");
		PassengerThread p4 = new PassengerThread(4000, barrier, "Sam");
		
		PassengerThread p5 = new PassengerThread(1000, barrier, "Pipa");
		PassengerThread p6 = new PassengerThread(2000, barrier, "Dolly");
		PassengerThread p7 = new PassengerThread(3000, barrier, "Harman");
		PassengerThread p8 = new PassengerThread(4000, barrier, "Brad");
		
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		
		p5.start();
		p6.start();
		p7.start();
		p8.start();
		
		System.out.println(Thread.currentThread().getName() + " has finished");
	}
}
