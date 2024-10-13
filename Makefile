DIR_SOURCE=./projeto/simplesrh
JAR_SUFIX=0.0.1-jar-with-dependencies

build: 
	./mvnw package -f $(DIR_SOURCE) -Dmaven.test.skip -DskipTests

clean:
	./mvnw clean -f $(DIR_SOURCE)

run-randoop:
	docker compose run randoop