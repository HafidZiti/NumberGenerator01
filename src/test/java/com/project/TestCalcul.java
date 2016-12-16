package com.project;

import junit.framework.TestCase;

public class TestCalcul extends TestCase {

	public void testadd()
	{
		Calcul C = new Calcul();
		
		assertTrue(3==C.add(1,2));
	}
}
