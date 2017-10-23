## Demonstração simples do SpringBoot


# JPA

Para realizar as configurações de JPA, não existe mais a necessidade de configurar um `@Bean` que disponibiliza um 
LocalContainerEntityManagerFactory, basta apenas colocar as configurações no `application.properties` ou `application.yml`

Caso tenha dúvidas do que é possível configurar através do arquivo de configuração aqui é um bom [caminho][springproperties]


## Interagindo com a JPA

Foi criado um endpoint `/mysql/sample`, através dele é possível CRUD, seguindo as regras do http (GET, PUT, POST, DELETE) e também uma pesquisa por nome
utilizando a regra `/mysql/sample/{nome que deseja pesquisar}`.

# MongoDB 

O spring-data também já nos oferece uma abstração para trabalhar com bancos não relacionais, nesse caso fiz um pequeno exemplo utilizando o `mongoDB`
Para salvar as coisas no `mongoDB` basta usar o endpoint: `/mongodb/sample`


# Feign

O Feign é uma biblioteca que facilita a parte de realizar comunicação com sistemas externos, nesse exemplo eu faço a consulta de cep
utilizando a API: [postmon][postmon].

No endpoint `/feign/cep/{cep}` o retorno do conteúdo é exatamente o mesmo que é retornado pela api.

Já no endoint `/feign/cep/customizado/{cep}` é retornado um objeto reduzido que criamos na nossa aplicação. 
Internamente o feign já esta fazendo o parse do json para nós.


# Infraestrutura

Para essa aplicação funcionar corretamente é necessário que esteja rodando o mongodb e mysql na máquina. 

Caso esteja familiarizado com docker, é possível rodar esses dois bancos com os comando abaixo: 

## mongodb
```sh
  docker run -d --name mongo -p 27017:27017 mongo
  ```

## mysql
```sh
  docker run --name mysql -e MYSQL_ROOT_PASSWORD=root -p 3306:3306 -d mysql
```




[postmon]: http://postmon.com.br/
[springproperties]:   https://docs.spring.io/spring-boot/docs/current/reference/html/common-application-properties.html
