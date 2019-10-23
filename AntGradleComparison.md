# Ant and Gradle Comparison

A comparison of relevant characteristics of Ant and Gradle through their pros and cons.

## Why Ant and Gradle?

[Ant](https://ant.apache.org/) and [Gradle](https://gradle.org/) are common build tools for Java projects. Ant was created in 2000, while Gradle was more recently created in 2007. While other tools (such as Maven) exist, the features of Ant and Gradle outweigh, and in some cases include features of the others. Ant was considered to be the first among “modern” build tools <a href="#reference_2">[2]</a>, giving you control over the entire build process, while Gradle was created around “ease of use” <a href="#reference_2">[2]</a>, simplifying build scripts and increasing readability. Both of these tools have similar functionality, and therefore choosing between them requires comparing them side by side, relative to the requirements of the specific project.

## Ant

<!-- Ant pros and cons -->
<table>
    <tr>
        <th>Pros</th>
        <th>Cons</th>
    </tr>
    <tr>
        <!-- Pros -->
        <td>
            <ul>
                <li>
                    More transparent; easier to understand what the script does <a href="#reference_4">[4]</a>
                </li>
                <li>
                    Parsed on every build; shorter build time <a href="#reference_4">[4]</a>
                </li>
                <li>
                    Shallower learning curve <a href="#reference_6">[6]</a>
                </li>
                <li>
                    More robust IDE integration <a href="#reference_7">[7]</a>
                </li>
                <li>
                    Longer lifespan; possibly more stable <a href="#reference_2">[2]</a> <a href="#reference_3">[3]</a>
                </li>
            </ul>
        </td>
        <!-- Cons -->
        <td>
            <ul>
                <li>
                    Longer build script; more time consuming development <a href="#reference_6">[6]</a> <a href="#reference_3">[3]</a>
                </li>
                <li>
                    Harder to manage in larger projects <a href="#reference_7">[7]</a>
                </li>
                <li>
                    Less popular on GitHub; less community input
                </li>
                <li>
                    Does not offer training courses <a href="#reference_7">[7]</a>
                </li>
                <li>
                    No core support for dependency management <a href="#reference_5">[5]</a>
                </li>
            </ul>
        </td>
    </tr>
</table>

## Gradle

<!-- Gradle pros and cons -->
<table>
    <tr>
        <th>Pros</th>
        <th>Cons</th>
    </tr>
    <tr>
        <!-- Pros -->
        <td>
            <ul>
                <li>
                    Shorter build script; less time consuming development <a href="#reference_6">[6]</a> <a href="#reference_3">[3]</a>
                </li>
                <li>
                    Easier to manage in larger projects <a href="#reference_7">[7]</a>
                </li>
                <li>
                    More popular on GitHub; more community input 
                </li>
                <li>
                    Offers free bi-monthly introductory and advanced training courses <a href="#reference_7">[7]</a>
                </li>
                <li>
                    Core support for dependency management <a href="#reference_5">[5]</a>
                </li>
            </ul>
        </td>
        <!-- Cons -->
        <td>
            <ul>
                <li>
                    Less transparent; harder to understand what the script does <a href="#reference_1">[1]</a> <a href="#reference_6">[6]</a>
                </li>
                <li>
                    Recompiled on every build; longer build time <a href="#reference_4">[4]</a>
                </li>
                <li>
                    Steeper learning curve <a href="#reference_6">[6]</a>
                </li>
                <li>
                    Less robust IDE integration <a href="#reference_7">[7]</a>
                </li>
                <li>
                    Shorter lifespan; possibly less stable <a href="#reference_2">[2]</a> <a href="#reference_3">[3]</a>
                </li>
            </ul>
        </td>
    </tr>
</table>

## References

<div id="reference_1"></div>

* __[1]__ [Few points on Java Build Tools: Ant vs Maven vs Gradle](https://medium.com/@kapil.sharma91812/few-points-on-java-build-tools-ant-vs-maven-vs-gradle-e149a43325b8)

<div id="reference_2"></div>

* __[2]__ [Java Build Tools: Ant vs Maven vs Gradle](https://technologyconversations.com/2014/06/18/build-tools/)

<div id="reference_3"></div>

* __[3]__ [Why use Gradle instead of Ant or Maven?](https://stackoverflow.com/questions/1163173/why-use-gradle-instead-of-ant-or-maven/1165553#1165553)

<div id="reference_4"></div>

* __[4]__ [Apache Ant vs Gradle](https://www.slant.co/versus/2106/11592/~apache-ant_vs_gradle)

<div id="reference_5"></div>

* __[5]__ [Build tools head-to-head](https://image.slidesharecdn.com/migrating-25k-lines-of-ant-scripting-to-gradle-160526190042/95/migrating-25k-lines-of-ant-scripting-to-gradle-45-638.jpg?cb=1464289334)

<div id="reference_6"></div>

* __[6]__ [Java Build Tools Comparisons: Ant vs Maven vs Gradle](https://www.programmingmitra.com/2016/05/java-build-tools-comparisons-ant-vs.html)

<div id="reference_7"></div>

* __[7]__ [Gradle vs. Maven vs. Ant](https://www.bizety.com/2018/11/08/gradle-vs-maven-vs-ant/)