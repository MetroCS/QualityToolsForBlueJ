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

    public static boolean checkdirectoryExists(String path){
        // test "/var/tmp" directory
        File tmpDir = new File( path );
        boolean exists = tmpDir.exists();
        if (exists){
            return(true);
        }
        return(false);
    }

    }
