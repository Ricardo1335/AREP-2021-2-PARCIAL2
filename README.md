# Parcial segundo corte 

Para este parcial las funciones designadas fueron: 
* ln
* atan

## Cedula
1000722771

## Funcionamiento

* ATAN

![](https://github.com/Ricardo1335/AREP-2021-2-PARCIAL2/blob/main/images/img1.png)

* LN

![](https://github.com/Ricardo1335/AREP-2021-2-PARCIAL2/blob/main/images/img2.png)

## Correr proyecto

Primero Clonaremos el repositorio, para eso desde nuestro navegador nos dirigiremos al siguiente link

```sh
https://github.com/Ricardo1335/AREP-2021-2-PARCIAL2
```

Para clonar el repositorio debemos de correr el siguiente comando en cmd o en la terminal 

```sh
git clone https://github.com/Ricardo1335/AREP-2021-2-PARCIAL2
 ```

 Y luego entraremos a la carperta Ec2ParcialSegundoTercio

```sh
$ cd AREP-2021-2-PARCIAL2
 ```
Compilaremos los proyectos taller-cinco y load-balancer con el siguiente comando, debemos de entrar a la carpeta de cada uno

 ```sh
$ mvn package
 ```
Luego ejecutamos el siguiente comando para ejecutar el docker

```sh
$ docker build --tag parcialamaya .
$ docker run -d -p 5000:6000 --name parcialamaya parcialamaya
 ```
## Video

[]!(https://youtu.be/WI5NMTVxEK0)

### Prerequisitos

* Docker
* Docker Compose
* UNIX / Linux
* Java SE Development Kit 8 -Java SE Runtime Environment 8 -Apache Maven.

## Correr Pruebas

Para correr las pruebas, ejecutamos el siguiente comando

```sh
$ mvn test
 ```

### Generar Javadoc

Para generar el javadoc, corremos el siguiente comando

```sh
$ mvn javadoc:javadoc 
 ```

## Construido con

* [Maven](https://maven.apache.org/) - Dependency Management
* [JUnit](https://mvnrepository.com/artifact/junit/junit) - Test framework

## Author

 - Ricardo Amaya Rivera
 - Estudiante de la Escuela Colombiana De Ingeniería Julio Garavito 
 - Noveno Semestre

## License

Este proyecto está licenciado bajo la GNU v3.0 - ver el archivo LICENSE.md para más detalles
