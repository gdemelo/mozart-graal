# Mozart-Graal

[![Build Status](https://travis-ci.org/eregon/mozart-graal.svg?branch=master)](https://travis-ci.org/eregon/mozart-graal)

An implementation of Oz on top of Truffle and Graal.

The bootcompiler and Oz libraries are imported from [Mozart 2](https://github.com/mozart/mozart2).

## Current Status

Early stage.

Many simple tests pass and the Panel is working:
![The Panel On Mozart-Graal](https://pbs.twimg.com/media/Cf_bHhQXIAAtp_X.png)

## Dependencies

* Java SE Development Kit 8u92 from [here](http://www.oracle.com/technetwork/java/javase/downloads/java-archive-javase8-2177648.html#jdk-8u92-oth-JPR)
* Maven 3
* C/C++ toolchain (`build-essential`) for building Graal
* Python 2.7 (for `mx`)
* Ruby >= 2.2.0 (for the launcher)

## Build instructions

```bash
mkdir mozart-dev
cd mozart-dev
git clone https://github.com/eregon/mozart-graal.git
cd mozart-graal
rake
```

It takes around 5 min to build everything.
When asked for which Java, pick Java 1.8.0_92.

Run with
```bash
./oz
```

## Graal

Graal is not built by default to save time.
To build it, run
```bash
rake build:graal
```

## IDE: Scala IDE for Eclipse

Eclipse files are auto-generated for the two projects.
We recommend using `mozart-dev` as the workspace.
You can then import the projects with:
`File` => `Import...` => `General` => `Existing Projects into Workspace`.
Click `Browse...`, select `mozart-graal` and click `Finish`.

If you want to run inside Eclipse, look for the `Main` class
in the `mozart-graal` project and add in the User Entries of the Classpath tab the Scala library jar,
`org.scala-lang.scala-library_*.jar` which you can find under your Eclipse installation `plugins/` directory.
