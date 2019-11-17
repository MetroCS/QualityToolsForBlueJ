/*
 * Unit test class example for the Quality Tools for BlueJ project.
 */
package edu.msudenver.bluejext.qualitytools;

import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class LibraryTest {
    @Test public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }
    // Method to check if a directory exists
    public static boolean checkDirectoryExists(String path){
        File tmpDir = new File( path );
        boolean exists = tmpDir.exists();
        if (exists){
            return(true);
        }
        return(false);
    }

    // Test to see if BlueJextensionsClass directory exists
    @Test public void testExtensionsDirectoryExists() {
        String path = System.getProperty("user.dir") + "/gradle/BlueJextensionClass" ;
        assertTrue( checkDirectoryExists( path ) );
    }

    public static boolean checkFileExists(String path){
        File file = new File( path );
        boolean exists = file.exists();
        if (file.exists() && file.isFile()){
            return(true);
        }
        return(false);
    }





}
