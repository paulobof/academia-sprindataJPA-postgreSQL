### Subir todo projeto

```shell
mvn clean package -DskipTests
```
```shell
docker-compose -f docker-compose.yml -p academia-springboot up -d
```


### Subir somente Postgres e PgAdmin
```shell
docker-compose -f docker-compose.yml -p academia-springboot up -d postgres pgadmin
```