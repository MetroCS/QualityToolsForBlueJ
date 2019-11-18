# How to build and install the QT4BJ extension

## Building the Extension
- Compile the extension source code.  Note that `bluejext.jar` must appear in the compilation classpath.

- Verify that **manifest.txt** has the correct information for the extension.  In particular, it must include the line

```Main-Class: edu.msudenver.bluejext.qualitytools.QualityToolsExtension```

- Create a `QualityTools.jar` file containing the manifest and all compiled classes of the extension.
The following is an example that includes classes **QualityToolsExtension** and **Preferences** rooted in directory **build/main/java**

```jar mcf manifest.txt QualityTools.jar -C build/main/java/ edu/msudenver/bluejext/qualitytools/QualityToolsExtension.class -C build/main/java/ edu/msudenver/bluejext/qualitytools/Preferences.class```

- The extension now exists as the file `QualityTools.jar`

## Installing the Extension
- Copy the `QualityTools.jar` file into any of the [`extensions` directories](https://www.bluej.org/extensions/extensions.html) supported by the BlueJ application.

- The extension should load when you next run BlueJ.
