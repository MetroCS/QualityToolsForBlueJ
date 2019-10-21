
# Ivy, Ant, Gradle and Maven Comparison Report

**Story:** Compare Common-Use Automated Build Tools Suitable for the Project [#17](https://github.com/MetroCS/QualityToolsForBlueJ/issues/17)

**Description:** The intent of this document is to clearly show the use cases or specific advantages of each build tool to deduce which would be most suitable to the QualityToolsForBlueJ Java project.

We decided to compare four of the most common Java build tools Ivy, Ant, Gradel, and Maven with Java developers opinions on why or why not they use the build tool they use, in order to more easily come to a conclusion by showing real world user experience on top of what each tool is capable of on paper.

## Ivy 
* **Unique Features**
    * Dependancy manager focussed on configurability and simplicity. 
    * Ivy is not commonly used by itself because many larger build tools provide additional usefull functionality that contribute greatly to a project. Ivy would be best suited for small irregular projects.
* **Reviews** [Source](https://www.g2.com/products/apache-ivy/reviews#survey-response-2015176)
    * "Ivy makes organizing dependencies easy and efficient" as one user reviewed, however many agree its biggest con are that it's already integrated with other tools.

## Ant 
* **Unique Features**
    * Easily integrated with Ivy, which overcomes one of its major drawbacks: dependancy manegement.
    * Ant has its own testing framework, AntUnit, but also integrates very well with almost any other testing tools like JUnit, Selenium etc.
    * Ant can also be used effectively to build non Java applications, for instance C or C++ applications.
    * Ant has the most customizable build configurations.
* **Reviews** [Source](https://www.g2.com/products/apache-ant/reviews)
    * Overall the build process is easy and extremely customizable which is the major pro that most often outweighs the cons of having maybe some outdated features that newer tools may have and that everyone's build will be different leading larger investment in time and effort to learn, according to multiple reviewers opinions.
    * As one reviewer says "Ant gives you a lot of freedom and control over your builds, it also means that you will have to constantly reinvent the wheel on how your project structure and how everything fits together for every new project."says Raiu. This makes it more difficult for others to pick up your project because it is different than most every other project.
## Gradle
* **Unique Features** 
[Source](https://gradle.org/features/)
    * Gradle makes it easy to integrate and migrate from existing ant/maven projects.
    * Allows sharing of configurations between machines and developers. 
    * It uses DSL based on programming language Groovy, which makes build scripts much shorter and clearer compared to XML.
* **Reviews** [Source](https://www.g2.com/products/gradle/reviews#survey-response-147860)
    * Most reviews praise Gradle for one thing: saving time.  This is accomplished by two factors: 
        * Gradle Build Configuration files are much easier to read and write due them NOT being XML files, but instead uses a Domain Specific Language based on Groovy.  As a bonus, since the DSL is a programming language, there are certain tasks that one program in the Configuration files themselves.
        * Gradle Build Times are significantly faster than its competitors.  Although there were some reviews that critiqued Gradle for slow build times, it turns out that Gradle has functionality that can significantly reduce your build time.  Though it takes time to set up those functions (making build caches, building libraries incrementally), afterwards Gradle can be up to 100 times faster than Maven [Source](https://gradle.org/gradle-vs-maven-performance/)
    * A lot of developers praised Gradle’s ability to customize certain build features, without the need to get specific plug-ins (like Maven)
    * Most complaints (aside from slow build times, see above) focused on how many times when there are some build errors, it was easier to simply start out with a clean build rather than try to find and fix the issue.  Developers complain how Gradle often gives ambiguous or confusing error messages.

## Maven
* **Unique Features** [Source](https://maven.apache.org/maven-features.html)
    * Uses plugins to add additional tools and features
        * Has a library of existing plugins including build plugins and report plugins [Source](https://maven.apache.org/plugins/)
        * Custom plugins can be created
    * Can run ant tasks 
    * Build system is standardized, favors convention over configuration (Maven Features)
* **Reviews** [Source](https://maven.apache.org/maven-features.html)
    * Overall, reviews state that Maven is easy to use and plugins allow for a wide range of features to be added to a projects build. You can manage many features of a project such as dependencies, build and deployment in one location(POM.xml)
    * However, xml file can become cluttered and hard to manage later in the project.

## Created By
**Hybrd-dX** 

**Authors:**
Yadap Adhikari,
Evan Birt,
Rabin Ghimire,
Henry Gray,
Roman Khamov











