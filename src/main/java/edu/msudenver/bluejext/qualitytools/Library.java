/*
 * Example source code for the Quality Tools for BlueJ project.
 */
package edu.msudenver.bluejext.qualitytools;

import java.io.File;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    // Method checks to see if a file exists
    public static boolean checkFileExists(String path){
        File file = new File( path );
        boolean exists = file.exists();
        if (file.exists() && file.isFile()){
            return(true);
        }
        return(false);
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



}
