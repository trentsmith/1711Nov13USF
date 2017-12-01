package com.revature.threads;

public class Blue implements Runnable {

	@Override
	public void run() {
		while(true) {
			System.out.println("Blue rules.");
			synchronized(RedvsBlueDeadlock.blueFlag){
				synchronized(RedvsBlueDeadlock.redFlag){
					RedvsBlueDeadlock.blueFlag="secure";
					RedvsBlueDeadlock.redFlag="taken";
					System.out.println("Red: "+RedvsBlueDeadlock.redFlag+" Blue: "+RedvsBlueDeadlock.blueFlag);
				}
			}
		}
	}
}