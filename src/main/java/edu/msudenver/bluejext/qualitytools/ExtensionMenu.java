package edu.msudenver.bluejext.qualitytools;

import bluej.extensions.*;
import javax.swing.*;
import java.awt.event.*;

public class ExtensionMenu extends MenuGenerator {
	
	public JMenuItem getToolsMenuItem(BPackage aPackage) {
		return new JMenuItem(new SimpleAction("Quality Tools", "Menu:"));
	}
	
	class SimpleAction extends AbstractAction {
		private String messageHeader;
		public SimpleAction(String mName, String message) {
			putValue(AbstractAction.NAME, mName);
			messageHeader = message;
		}
		
		public void actionPerformed(ActionEvent event) {
			System.out.println(messageHeader);
		}
	}
}