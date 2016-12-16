package com.project;

import junit.framework.Test;
import junit.framework.TestSuite;

public class Runner {
   
	   public static Test suite() {

	        TestSuite suite = new TestSuite();
	  
		suite.addTestSuite(TestCalcul.class);
		

		return suite;
	    }

	    /**
	     * Runs the test suite using the textual runner.
	     */
	    public static void main(String[] args) {
	        junit.textui.TestRunner.run(suite());
	    }
} 
