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


    // Test to see if BlueJextensionsClass directory exists
    @Test public void testLibDirectoryExists() {
        String path = System.getProperty("user.dir") + "/libs" ;
        assertTrue( Library.checkDirectoryExists( path ) );
    }


    // Test to see if bluejext.jar file exists inside the BlueJextensionClass directory
    @Test public void testBluejextJarFileExists() {
        String path = System.getProperty("user.dir") + "/libs/bluejext.jar" ;
        assertTrue( Library.checkDirectoryExists( path ) );
    }

}
