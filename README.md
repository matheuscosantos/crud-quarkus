# CRUD REST com Quarkus
Este projeto foi desenvolvido para testar a implementação e eficiência do Quarkus, framework Java nativo do Kubernetes feito para a GraalVM.

## Fontes
Para implementar este projeto foram seguidas as instruções de: 

* [JUG Vale - Introdução ao Quarkus.io [CRUD]](https://www.youtube.com/watch?v=WmGkErE00H0)
* [Tutorial: Criando um CRUD utilizando Quarkus Java + REST + CDI + Panache, Hibernate com Postgres (Docker) + Postman](https://medium.com/@marcus.paulo/tutorial-criando-um-crud-utilizando-quarkus-java-rest-cdi-panache-hibernate-com-postgres-59793e0d7162)
* [Quarkus - Building a Native Executable](https://quarkus.io/guides/building-native-image)
* [Site oficial](https://quarkus.io/)

## Comandos para execução e compilação
* Compila e executa o projeto
```
mvnw compile quarkus:dev
```
* Executa o jar que está no diretório 
```
java -jar rest-quarkus-1.0-SNAPSHOT-native-image-source-jar
```
* Constrói um container Docker do projeto
```
./mvnw package -Pnative -Dquarkus.native.container-runtime=docker
```
## [Postman](https://documenter.getpostman.com/view/9737508/SzmZcfPj)

:shipit:
