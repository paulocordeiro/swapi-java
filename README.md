# swapi-java
A [**SWAPI**](https://swapi.dev/) client written with Java

This is a java impletation from [SWAPI](https://swapi.dev/) client with [Spring Boot](https://spring.io/projects/spring-boot).

use to start aplication;
```
# gradle bootRun 
```

use run aplication tests;
```
# gradle test 
```

use to get all films:
```
curl --request GET \
     --url http://localhost:8080/films/
```
use to get list names of films:
```
curl --request GET \
     --url http://localhost:8080/films/names
```

use to get a film by episode id:
```
curl --request GET \
     --url http://localhost:8080/films/1
```

use to get a film with all details:
```
curl --request GET \
     --url http://localhost:8080/films/details/5
```

use update a film description and increment film version:
```
curl --request PUT \
  --url http://localhost:8080/films/updatedescription/5 \
  --header 'Content-Type: application/json' \
  --data 'New description'
```