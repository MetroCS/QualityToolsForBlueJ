# Quality Tools for BlueJ (QT4BJ) - Development Conventions

This document describes intended and preferred conventions
for development and maintenance of the _Quality Tools for BlueJ_ software product.
* [Agile Principles](#Agile-Principles)
* [Coding Convention Guide](#Coding-Convention-Guide)
* [Build Environment](#Build-Environment)
* [Repository Structure](#Repository-Structure)

_____ 
## Agile Principles

### Working Software
#### The project code base is always buildable and runnable.

For example, no merge results in a non-buildable state or a buildable product that does not execute.

### Incremental Development
#### The project code base is relevant to the current iteration.

Architectural elements, tests, and implementation code match requirements associated with the current and previous versions of the product.

For example, tests and code for features identified for future versions are excluded from the project code base.
 
### Behavior-Driven Development
#### All code is associated with an explicit requirement specification (User Story).

_Tracing backward_ from tests reveals the requirement(s) that such tests verify in the product.

_Tracing backward_ from code likewise reveals the requirement(s) that such code implements in the product.

### Test-Driven Development
#### All code is associated with an explicit means for verification.

For example, new code is not merged into the project code base prior to the existence of automated test code for that new code.

_Tracing backward_ from the code reveals the tests used to verify the behavior of the code.

The intent is for code to be developed using a _test-first_ methodology,
in which automated tests are written prior to writing the implementation.

Tests associated with successful implementation remains in the code base as _regression tests._

(Note: Test coverage tools may facilitate _tracing forward_ from a test to code that the test is intended to verify.)

_____
## Coding Convention Guide

### Style Convention Precedence and References

#### [Project-specific conventions](/ConventionGuide.md#Project-Specific-Conventions) take precedence.

If no project-specific convention is applicable, use the [Sun Convention](https://www.oracle.com/technetwork/java/codeconvtoc-136057.html) guide.

If something is not covered in the project-specific or the Sun Convention guide, use the [Google Convention](https://google.github.io/styleguide/javaguide.html) guide.

If a topic is not covered by any guides, use best judgement and consider opening a project issue to formalize the decision.

- Sun Convention guide: https://www.oracle.com/technetwork/java/codeconvtoc-136057.html
- Google Convention guide: https://google.github.io/styleguide/javaguide.html


### Project-Specific Conventions

- Multiple authors are indicated using multiple @author tags, one tag per line, one author per tag.
- Where practicable, style conventions are embodied in configuration files for the [Checkstyle](https://checkstyle.sourceforge.io) tool.

_____
## Build Environment

The following tools are established as comprising and contributing to the build environment for the QT4BJ project.

### Build Automation
#### [Gradle](https://www.gradle.org/)
Compromise between configuration and convention, uses a Groovy-based DSL instead of XML.

### Unit Testing Framework
#### [JUnit5](https://junit.org/junit5/)
Framework for testing Java 8+. Supports multiple testing styles.

### Test Coverage Assessment
#### [JaCoCo](https://www.eclemma.org/jacoco/)
Java code coverage library that can also analyze code complexity

### Design Complexity Assessment
#### [JaCoCo](https://www.eclemma.org/jacoco/)
Java test coverage and code complexity analyzer
 
### Source Code Shortcoming Identification
#### [CheckStyle](https://checkstyle.sourceforge.io/)
Identifies violation of coding conventions

#### [PMD](https://pmd.github.io/)
Identifies common programming weaknesses 

#### [Spotbugs](https://spotbugs.github.io/)
Identifies bugs and potentially buggy code in Java code; a successor to FindBugs
_____
_The following tools are under consideration for inclusion in the QT4BJ build environment._
#### [Travis CI](https://travis-ci.com/)
Continuous integration
#### [OpenClover](http://openclover.org/features)
Code coverage analysis
#### [AccessLint](https://www.accesslint.com/)
Automated web accessibility testing

_____ 
## Repository Structure 

```
.
├── .github/ISSUE_TEMPLATE/  	# Templates for new issues (e.g., user stories, bug reports)
├── archive/                    # Historical artifacts
├── docs/                    	# GitHub Pages website content
├── gradle/        		# See Gradle documentation
├── src/                     	# Source files
├── .gitignore                  # Directories and file types to be ignored by git
├── DevelopmentConventions.md	# Development and maintenance conventions
├── LICENSE                     # Open source license file
├── README.md
├── RequirementsSourceInfo.md	# Goals of previous, related project
├── Vision.md                   # Vision statement and stakeholder identification
├── build.gradle                # See Gradle documentation
├── gradlew                     # See Gradle documentation
├── gradlew.bat                 # See Gradle documentation
├── settings.gradle	        # See Gradle documentation
└── toolsForIntegration.md      # List of code analysis tools to be implemented and descriptions
```
```
Github Issue Templates

.
├── ...
├── .github
│   ├──ISSUE_TEMPLATE  		
│      ├── bug_report.md       # Bug report template
│      ├── user-story.md       # User story template
│   └── ...                    # etc.
└── ...
```
```
Archive

.
├── ...
├── archive                         # Historical artifacts
│   ├── decisionNotes               # Documentation that informed project decision-making
|      ├── AntGradleComparison.md   # Comparison report of Ant and Gradle build tools
│      ├── IvyAntGradleMavenComparisonReport.md     	 
|                                   # Comparison report of Ant, Ivy, Gradle and Maven build tools
│   └──
└── ...
```
```
GitHub Pages Website

.
├── ...
├── docs                    # GitHub Pages website content	
│   ├── README.md           # Project overview
│   ├── _config.yml         # Jekyll configuration
│   └── ...                 # etc.
└── ...
```
```
Gradle Wrapper

├── ...
├── gradle 			# See Gradle documentation
│   ├── wrapper                      # Gradle Wrapper
│      ├── gradle-wrapper.jar        # Gradle packages and distributions
│      ├── gradle-wrapper.properties # Gradle Wrapper configuration
│   └──
└── ...
```
```
Source

├── ...
├── src 			# Project source code
│   ├── main    		# Implementation source code
│      ├── java
│         ├── edu/msudenver/bluejext/qualitytools/  # QT4BJ implementation
│   └──
│   ├── test 			# Testing source code
│      ├── java
│         ├── edu/msudenver/bluejext/qualitytools/  # QT4BJ tests
│   └──
└── ...
```
Gradle structure based on [Organizing Gradle Projects](https://docs.gradle.org/current/userguide/organizing_gradle_projects.html)
