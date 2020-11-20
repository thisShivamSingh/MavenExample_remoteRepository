package com.lti.mavenDemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestWelcome {

	
	@Test
    void testShow() {        
        Welcome w= new Welcome();        
        assertEquals("Hello!!",w.show());
    }
//	public void testShow() {
//		//fail("Not yet implemented");
//		assertEquals("Hello world-DevOps");
//	}

}
