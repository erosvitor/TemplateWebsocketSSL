# TemplateWebsocketSSL

## Descrição
O **TemplateWebsocketSSL** é um projeto que mostra como implementar um servidor websocket SSL com certificado auto-assinado.

## Tecnologias utilizadas
* Java 11.0.7
* Apache Maven 3.6.3
* Biblioteca TooTallNate/Java-WebSocket 1.5.1
* SLF4J 1.7.5
* Eclipse 2020-03

## Certificado auto-assinado
Para gerar um certificado auto-assinado para o servidor Websocket SSL, deve-se utilizar a ferramenta 'keytool' presente no pacote JDK.

```
$ JAVA_HOME/bin/keytool \
    -genkeypair \
    -alias <nome-alias> \
    -keyalg RSA \
    -keypass <senha> \
    -keystore <path>/<nome-arquivo>.jks \
    -storepass <senha> \
    -dname "cn=<nome-empresa>, ou=<nome-departamento>, o=<nome-empresa>, L=<nome-cidade>, ST=<sigla-estado>, c=<sigla-pais>"
```

## Documentação

### Diagrama de classes

![](docs/diagrama-classes.png) 

## Histórico de lançamentos

* 1.0.0 (2020-12-06)
    * Primeira versão
