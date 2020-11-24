package net.sourceforge.opencamera.test;

import android.test.suitebuilder.annotation.SmallTest;

import junit.framework.Test;
import junit.framework.TestSuite;

@SmallTest
public class SubsetTests {
    public static Test suite() {
        TestSuite suite = new TestSuite(MainTests.class.getName());
        // Basic video tests
        suite.addTest(TestSuite.createTest(MainActivityTest.class, "testVideoImuInfo"));
        suite.addTest(TestSuite.createTest(MainActivityTest.class, "testTakeVideo"));
        // Basic photo tests
        suite.addTest(TestSuite.createTest(MainActivityTest.class, "testTakePhoto"));
        return suite;
    }
}

