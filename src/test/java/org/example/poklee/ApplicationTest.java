package org.example.poklee;

import org.junit.Test;

import junit.framework.TestCase;


public class ApplicationTest extends TestCase {


	@Test
	public void test() {
		System.out.println("Running " + this.getClass().getName() + ".test()");
		
		// This should always be true!
		assertEquals(1, 1);
	}
}
