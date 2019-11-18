# Tools for Integration into the QT4BJ Extension

This document identifies code quality analysis tools considered by the project as potentially appropriate for integration into the QT4BJ extension.  (We note that BlueJ already integrates the JUnit testing framework, obviating the need for including such tools in the product.)

___
## Preferred Order of Integration

This _Preferred Order of Integration_ establishes the relative priority of tools for inclusion in the extension, ordered from highest to lowest priority.

1. JaCoCo
1. Checkstyle
1. PMD
1. SpotBugs
1. OpenClover

___
## Static Analysis Tools

### CheckStyle (https://checkstyle.sourceforge.io/)
* Examines source code and looks for violation of coding conventions.
* Checks for annotations, whitespace, metrics, duplicate code and more.
* Uses powerful parser generator ANTLR (Another Tool For Language Recognition), for grammar errors. 
* Looks for error within class and method design.Checks for code layout and formatting issues.


### FindBugs (http://findbugs.sourceforge.net/factSheet.html)
* Faster compared to other code analysis because it looks bugs in Java Byte Code.
* Finds most defects and has high accurate detect rate with less than 50% false positive.
* Supports plugins that allows developers to create new bugs detector.


### PMD (https://pmd.github.io/)
* Finds programming flaws, such as unused variables and empty methods.
* Copy-Paste Detector (CPD) (https://pmd.github.io/latest/pmd_userdocs_cpd.html)
    * Locates duplicate code.
    * CPD is an add-on to and shipped with PMD.

### Spotbugs (https://spotbugs.github.io/)
* Free and open source
* Useable standalone and Integratable with Ant, Maven, Gradle, other IDE’s
* Requires JRE (or JDK) 1.8.0 or later to run
* Can analyze programs compiled for any version of Java, from 1.0 to 1.9

## Test Coverage Tools
Determines how much of the code (lines and/or branches) were accessed during test execution.

###  Cobertura (https://cobertura.github.io/cobertura/)
* Calculates code complexity
* Not much support, not updated often.

###  JaCoCo (https://www.eclemma.org/jacoco/)
* Determines line AND branch coverage
* Provides Reports via HTML with helpful visuals
* Non-intrusive to source code, doesn’t require recomplation

### OpenClover (http://openclover.org/features)
* 20+ built-in code metrics and ability to define custom metrics
* Variety of report formats
* Cross-report linking and ability to collect historical data
* Support for Spock
* Must be integrated with the build and requires code recompilation

___
**Original Authors:**
Yadap Adhikari,
Evan Birt,
Rabin Ghimire,
Henry Gray,
Roman Khamov
