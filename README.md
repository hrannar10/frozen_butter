# Frozen Butter

curl -s get.pi4j.com | sudo bash

gradle init --type java-library

gradle tasks

## Modify build.gradle with this line
* mainClassName = "net.frozen_butter.filename.classname"
* apply plugin: 'application'
* Under dependencies: compile files('opt/pi4j/lib/pi4j-core.jar')
* And add this code and the end:
```sh
jar {
    manifest {
        attributes 'Main-Class': 'net.frozen_butter.filename.classname'
        attributes 'Class-Path': '/opt/pi4j/lib/pi4j-core.jar'
    }
}
```

## To run the project
```java
java -jar build/libs/frozen_butter.jar
```

This should give output something like this and this only work on raspberry pi
```sh
----------------------------------------------------
HARDWARE INFO
----------------------------------------------------
CPU Revision      :  7
CPU Architecture  :  7
CPU Part          :  0xb76
CPU Temperature   :  42.2
CPU Core Voltage  :  1.2
CPU Model Name    :  ARMv6-compatible processor rev 7 (v6l)
Processor         :  0
Hardware Revision :  0003
Is Hard Float ABI :  true
Board Type        :  ModelB_Rev1
```
