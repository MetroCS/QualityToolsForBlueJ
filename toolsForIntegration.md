
# Tools For Integration

**Story:** Provide a list of tools to be integrated with a brief description of each one
 [#14](https://github.com/MetroCS/QualityToolsForBlueJ/issues/14)

**Description:** The following is a list of code analysis tools commonly used for java projects.   The title of the tool is also a link to its official developers page, and then follows with a brief description/list of features.  This information can be used by the Maintainer to decide which code analysis tools should be integrated into the project plug-in.


# Static Code Analysis Tools
## [PMD](https://pmd.github.io/)
* Finds programming flaws, such as unused variables and empty methods.
* [Copy-Paste Detector (CPD)](https://pmd.github.io/latest/pmd_userdocs_cpd.html)
    * Copy/Paste Detector (CPD) is an add-on to PMD and CPD shipped with PMD.
    * Duplicate code can be hard to find, especially in a large project. But PMD’s Copy/Paste Detector (CPD) can find it for you!
    * CPD works with Java, JSP, C/C++, C#, Go, Kotlin, Ruby, Swift and many more languages. It can be used via command-line, or via an Ant task. It can also be run with Maven by using the cpd-check goal on the Maven PMD Plugin.

## [CheckStyle](https://checkstyle.sourceforge.io/)
* Examines source code and looks for violation of coding conventions.
* Checks for annotations, whitespace, metrics, duplicate code and more.
* Uses powerful parser generator ANTLR (Another Tool For Language Recognition), for grammar errors. 
* Looks for error within class and method design.Checks for code layout and formatting issues.

## [FindBugs](http://findbugs.sourceforge.net/factSheet.html)
* Faster compared to other code analysis because it looks bugs in Java Byte Code.
* Finds most defects and has high accurate detect rate with less than 50% false positive.
* Supports plugins that allows developers to create new bugs detector.

## [Spotbugs](https://spotbugs.github.io/)
* Free and open source
* Useable standalone and Integratable with Ant, Maven, Gradle, other IDE’s
* Requires JRE (or JDK) 1.8.0 or later to run
* Can analyze programs compiled for any version of Java, from 1.0 to 1.9

# Code Coverage Tools
Most commonly used whenever running unit tests to see what percentage of lines were run during the test execution. This way, a developer can see what parts of their code was actually tested.

## [Travis CI](https://travis-ci.com/)
* Easy setup- enable the project, add basic build instructions, commit code.
* Pre Installed databases and services only need to enabled in build instructions
* Supports deployment of code
* Syncs with github and runs tests every commit
* Supports over 30 languages
* Testing open source is always free.

## [CodeFactor](https://www.codefactor.io/)
* Get a glance of code quality for the whole project, recent commits and the most problematic files. CodeFactor will track new and fixed issues for every commit and pull request.
* CodeFactor will try to prioritize the most critical issues first based on issue code size, file change frequency and file size so you can start fixing only what's important.
* Create and track issues or comments directly from code file or project issues pages. CodeFactor will update status for GitHub or Bitbucket Pull Requests as well.

## [JaCoCo](https://www.eclemma.org/jacoco/)
* Can line test AND branch test (making sure that every and/or block was tested)
* Provides Reports via HTML with helpful visuals
* Non-intrusive to source code, doesn’t have to be complied

## [OpenClover](http://openclover.org/features)
* Over 20 built-in Code metrics (are you looking at methods, branches, statements, etc) and the ability to even make custom metrics
* Variety of ways to create reports, including PDF and TEXT files!
* Provides cross-report linking and can collect historical data for a given project
* Dedicated support for Spock (Unlike JaCoCo
* **BUT** Unlike JaCoCo, Open clover has to be integrated with the build and be recompiled with the code, making it more intrusive/harder to set up

## [Cobertura](https://cobertura.github.io/cobertura/)
* Calculates how much of your code is accessed by tests.
* Calculates code complexity
* Not much support, not updated often.

# Unit Testing Frameworks
## [JUnit4](https://junit.org/junit4/)
* Framework for writing repeatable tests. Requires Java 5+.


## [JUnit5](https://junit.org/junit5/)
* Framework for testing Java 8+. Supports multiple testing styles.

## Created By
**Hybrd-dX**

**Authors:**
Yadap Adhikari,
Evan Birt,
Rabin Ghimire,
Henry Gray,
Roman Khamov
