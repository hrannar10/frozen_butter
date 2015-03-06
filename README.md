# Frozen Butter

gradle init --type java-library
gradle tasks

Modify build.gradle with this line
- mainCÃlassName = "net.frozen_butter.filename.classname"
- apply plugin: 'application'
- Under dependencies: compile files('opt/pi4j/lib/pi4j-core.jar')
- And this code:
jar {
    manifest {
        attributes 'Main-Class': 'com.bangsapabbi.helloworld.helloworld'
        attributes 'Class-Path': '/opt/pi4j/lib/pi4j-core.jar'
    }
}
