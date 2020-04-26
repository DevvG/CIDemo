package com.altiostar.demo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class HelloAppTest {

	@Test
	public void sayHelloPass() {
		HelloApp app = new HelloApp();
		String result = app.sayHello("Dev");
		assertTrue(result.equalsIgnoreCase("Dev, say Hello Kubernetes World"));
	}

}
