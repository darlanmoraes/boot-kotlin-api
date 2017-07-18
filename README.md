## Spring Boot with Gradle, Kotlin, Jersey, MongoDB and Jackson

This project can be used to view **Spring Boot** basics using **Kotlin** as first programming language.

You can copy, change the package and will be ready for development.

To turn usage more simple, please import it on **Intellij Idea** with **Kotlin** support. Then you can just start running `main` function that can be found on `BootKotlinApiApplication.kt` file.

I'd recommend **Docker** to start **MongoDB**. The config for *MongoDB* can be found on `application.properties` file.

### Starting Docker
```sh
docker run -it -p27017:27017 mongo
```

### Starting Application
You can start with `Intellij Idea` or manually:
```sh
cd ~/Projects/boot-kotlin-api
gradle build
java -jar build/libs/boot-kotlin-api-0.0.1-SNAPSHOT.jar
```

### Creating Users
```sh
curl -v -X POST \
-H 'Accept: application/json' \
-H 'Content-Type: application/json' \
-d '{
  "id": "596e55f4f57390023df4c0f8",
  "name": "Darlan de Moraes",
  "age": 26
}' \
'http://localhost:8080/users'
```

### Updating Users
```sh
curl -v -X PUT \
-H 'Accept: application/json' \
-H 'Content-Type: application/json' \
-d '{
  "name": "Darlan de Moraes Silveira",
  "age": 26
}' \
'http://localhost:8080/users/596e55f4f57390023df4c0f8'
```

### Listing Users
```sh
curl -v -X GET \
-H 'Accept: application/json' \
'http://localhost:8080/users'
```

### Searching Users
```sh
curl -v -X GET \
-H 'Accept: application/json' \
'http://localhost:8080/users/596e55f4f57390023df4c0f8'
```

### Removing Users
```sh
curl -v -X DELETE \
-H 'Accept: application/json' \
'http://localhost:8080/users/596e55f4f57390023df4c0f8'
```