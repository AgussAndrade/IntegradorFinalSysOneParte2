# Integrador final SysOne

##Consigna 📬
_Tomando como referencia el ejercicio integrador, incorporar en las distintas capas según corresponda, los frameworks jpa/hibernate, spring-mvc, spring-data, springboot._

_Armar la siguiente estructura_

_Capa modelo:_

_@Entitie (JPA/Hibernate)_

_Capa Dao_

_@Repositories ( spring)_

_Capa Service_

_@Service (spring)_

_Capa controlador_

_@RestController (spring)_



### Pre-requisitos 📋

_El programa necesita de una base de datos llamada fabrica_de_autos con dos tablas una adicional y otra auto_

## Comenzando 🚀

_ir a src.main.resources y abrir el archivo aplication.properties, modificar el usuario, contraseña y el nombre de la base de datos segun sea conveniente y correr la aplicacion._

## Cambios respecto la version anterior 📌

- _Se descartaron las capturas de error._
- _Se decidio que la logica de converter se haga en las entities o dtos para que el codigo este mas orientado a objetos._
- _En la base de datos se cambio la relacion entre las tablas de "muchos a muchos" a "uno a muchos" siendo el uno el auto ya que un mismo codigo de Adicional no va a estar en dos autos distintos._
- _Los dtos perdieron el atributo "tipo" y "modelo" a nivel java nativo y se ajustaron a un atributo para formato de libreria jackson para amoldarse con la entrada json._
- _Analogamente, con las entities, paso algo similar pero con la libreria Springboot con el objetivo de amoldarse a la base de datos._
- _Para que los dtos no se metan en temas de bases de datos ( en este caso guardarse la id como atributo) se decidio que modificar en "autoController" reciba dos parametros: un "AutoDTO" y un "Integer"._
## Autor ✒️

* **Agustin** - [AgussAndrade](https://github.com/AgussAndrade)
