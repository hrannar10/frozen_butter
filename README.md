# Frozen Butter


curl -s get.pi4j.com | sudo bash

gradle init --type java-library

gradle tasks

##Modify build.gradle with this line
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

