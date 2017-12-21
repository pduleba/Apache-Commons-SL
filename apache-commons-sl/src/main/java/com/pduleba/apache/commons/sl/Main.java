package com.pduleba.apache.commons.sl;

import org.apache.commons.lang3.time.StopWatch;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		StopWatch started = StopWatch.createStarted();
		Thread.sleep(500);
		started.stop();

		System.out.println("Time duration :: " + started.getTime());
	}

}
