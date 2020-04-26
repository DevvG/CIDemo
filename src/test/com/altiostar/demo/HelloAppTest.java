package com.altiostar.demo;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloAppTest {

	@Test
	void sayHelloPass() {
		HelloApp app = new HelloApp();
		String result = app.sayHello("Dev");
		assertTrue(result.equalsIgnoreCase("Dev, say Hello Kubernetes World"));
	}

}
