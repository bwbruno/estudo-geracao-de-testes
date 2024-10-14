#!/bin/sh

export CLASSPATH=/simplesrh/target/dependency/hamcrest-core-1.3.jar:/simplesrh/target/dependency/jackson-core-2.14.0.jar:/simplesrh/target/dependency/jackson-datatype-jsr310-2.15.2.jar:/simplesrh/target/dependency/picocli-4.7.5.jar:/simplesrh/target/dependency/jackson-annotations-2.14.0.jar:/simplesrh/target/dependency/jackson-databind-2.14.0.jar:/simplesrh/target/dependency/junit-4.12.jar

java -jar /evosuite-bin/evosuite.jar -generateTests -prefix br.ufrn.simplesrh.service -projectCP /simplesrh/target/classes