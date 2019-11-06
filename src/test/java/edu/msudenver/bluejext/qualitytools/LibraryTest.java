/*
 * Unit test class example for the Quality Tools for BlueJ project.
 */
package edu.msudenver.bluejext.qualitytools;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    @Test public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }
}
