# Quality Tools for BlueJ (QT4BJ) - Development Conventions

This document describes intended and preferred conventions
for development and maintenance of the _Quality Tools for BlueJ_ software product.
* [Gradle File Hierarchy](#Gradle-File-Hierarchy)
* [Agile Principles](#Agile-Principles)
* [Coding Convention Guide](#Coding-Convention-Guide)
* [Build Environment](#Build-Environment)

_____ 
## Gradle File Hierarchy 

### General structure for file hierarchy in gradle build environment.
### Doc Link: https://docs.gradle.org/current/userguide/organizing_gradle_projects.html

        QualityToolsForBlueJ
        ├── build.gradle
        │
        ├── gradle
        │   └── integration-test.gradle
        │
        ├── gradlew*    (Use gradlew to ensure project version of gradle is declared.)
        │
        ├── settings.gradle
        │
        └── src         (Source code for compilation goes in main or test.)
            │
            ├── main 
            │   │
            │   └── java    (Place Java class files here for compilation.)
            │       │
            │       └── HelloWorld.java
            │
            └── test
                │
                └── java    (Place Java test class files here for compilation.)  
                    │
                    └── HelloWorldTest.java
            
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
#### Gradle
TODO: add overview and external links

### Unit Testing Framework
#### Junit 5
TODO: add overview and external links

### Test Coverage Assessment
#### JaCoCo
TODO: add overview and external links

### Design Complexity Assessment
#### JaCoCo
TODO: add overview and external links
 
 
### Source Code Shortcoming Identification
#### Checkstyle
TODO: add overview and external links

#### PMD
TODO: add overview and external links

#### SpotBugs
TODO: add overview and external links

_____
_The following tools are under consideration for inclusion in the QT4BJ build environment._
#### Travis CI
TODO: add overview and external links
#### OpenClover
TODO: add overview and external links
#### AccessLint
TODO: add overview and external links
