#!/bin/sh

java -classpath .:/simplesrh/target/classes:/randoop/randoop-all-4.3.3.jar randoop.main.Main gentests --testclass=br.ufrn.simplesrh.SimplesRH --time-limit=10 --junit-output-dir=/testes-gerados