# utils

## Development

### Create the Workspace for Development

```
mkdir openDSB
cd openDSB
git clone git@github.com:opendsb/utils.git
git clone git@github.com:opendsb/core.git
```

You can build both projects this way:

```
for a in `echo core utils`
do
  echo $a
  cd $a; mvn clean install ; cd ..
done
```

but is more robust do this using Maven. See below:


### Create this pom.xml file

```
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>

  <groupId>org.opendsb</groupId>
  <artifactId>opendsb-builder</artifactId>
  <version>1.0-SNAPSHOT</version>
  <packaging>pom</packaging>

  <name>opendsb-builder</name>
  <url>https://github.com/opendsb</url>

  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
  </properties>

  <modules>
    <module>utils</module>
    <module>core</module>  </modules>
</project>
```

### Execute Maven Install

```
mvn clean install
```
