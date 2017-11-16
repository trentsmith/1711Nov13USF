package com.ex.alive;

public interface Livable {
	// prior to Java 8, interfaces could not implement methods
	
	default void testingDefault() {
		System.out.println("This will be the case for all things living");
		// new
	}
	
	int reproduce(int numPartiesInvolved);
	void consume(String... substance);
	int perish(double timeToLive);
	String waste();
	String move();
}
