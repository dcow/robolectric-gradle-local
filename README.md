gradle-android
==============

Android and Gradle sandbox

This project demonstrates (among other things) running robolectric using the 
[robolectric-gradle-plugin](https://github.com/robolectric/robolectric-gradle-plugin)
with zero source set build script hackery, but that's not the point.

Rather, this project is an example of building an android project against local
maven deploys of both robolectric and the associated gradle plugin. The artifacts 
reside under the group `com.example` in a local maven repository.

I've drafted [instructions for publishing both projects to your local maven repository](https://gist.github.com/dcow/62f7c5257cf4725248f0).
