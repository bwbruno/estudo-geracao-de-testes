#!/bin/sh

java -classpath .:/simplesrh/target/classes:/randoop/randoop-all-4.3.3.jar randoop.main.Main gentests --classlist=/classes.txt --time-limit=10 --junit-output-dir=/testes-gerados