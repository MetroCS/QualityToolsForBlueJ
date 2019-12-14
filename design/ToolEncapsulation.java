/**
 * This file is intended to be the starting point to encapsulate one tool that 
 * will then be used by the QualityTools extension.
 * 
 * @author Justin Singleton, Anna Krajeski, Brian LaProwse, Michael Kerl
 * @version 0.0
 */
public class ToolEncapsulation {

	public static void main(String[] args) {
		
	}

	/** 
	 * @param URI referencing the location of the tool
	 *
	 * this constructor will establish the connection to the
	 * tool which is to be encapsulated
     */
	public ToolEncapsulation() {
	 // TODO: Find what goes into the URI to use as a parameter in constructor	
	}
	
	/**
	 * @return the name of the tool being encapsulate
	 *
	 * getToolName() returns the name of the tool to be encapsulated
	 */
	public String getToolName() {
		return "";
	}
	
	/** 
	 * @return the version of the tool being encapsulated
	 *
	 * getToolVersion returns the version number of the tool to
	 * be encapsulated
	 */
	public String getToolVersion() {
		return "";
	}

	/**
	 * @return If the connection to the tool has been made
	 *
	 * isConnected() returns whether or not the ToolEncapsulation
	 * object has connected to the tool application in question
	 */
	public boolean isConnected() {
		return false;
	}
	
	/** 
	 * @param String command designates which command is to be invoked
	 *
	 * invokeCommand(String command) takes a String to determine which 
	 * command is to be invoked from the encapsulated tool
	 */
	public void invokeCommand(String command) {
		
    }

}
