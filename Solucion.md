# SOLUCIÓN 
_Esto son los pasos seguidos para una de la múltiples soluciones que se pueden dar a este ejercicio_


1. Creamos `Vehículo` de la que heredarán las demás clases que en un futuro reparará  nuestro `Taller`.  
1. Los vehículos pueden tener ruedas o no, por lo que creamos la `Clase Abstracta VehiculoConRuedas `(se querrá crear especialidades de `VehiculoConRuedas` no instancias suyas)
1. Creamos las Clases `Moto` y `Coche` con herencia de `VehiculoConRuedas`. commit [aquí](http://github.com/kzurro/Taller/commit/dd8e198353f1d54ec9a9551c40be8ccd68b2d6c3)
1. Crear la `interface` `Arrancable` que tendrá el método `default void arrancar()`  
1. Por mi diseño determino que los `vehiculoConRueda` son los que implementan la `interface Arrancable`  
1. En `Coche` sobrescribo el método `arrancar() `para que sea customizado con la `matrícula` del `Coche`   commit [aquí](http://github.com/kzurro/Taller/commit/6e797b423f4d0ca6417354946841795761dddcd9)
1. Implementar todo lo necesario para Taller:  
   1. Un `Taller` estará formado por un `Almacen` y una `Colección` de `hojas de trabajo`  
   1. Un `Almacen` estará formado por una `Colección` de `Respuestos`  
   1. Un `Repuesto`  será un `identificador`, un `nombre` y un `precio`.  
   1.  Una `Hoja de Trabajo` será un `VehiculoConRuedas` (_más adelante será un `Reparable`_), un número determinado de `Averias` y una `fecha de entrada`.  
   1. Una `Averia` será un `nombre`, una serie de `Repuestos` necesarios y el `numero de horas` que llevará la reparación 
   1. Al tener la `Averia` el `precio` de la Mano de obra, y el `Repuesto`, realizo un método para calcular el precio de la `Averia` (precio repuesto más mano de obra)  commit [aquí](http://github.com/kzurro/Taller/commit/1e13f1dca6b41d1b9b2c2995ad44158a6f9ca90c)
1. `Almacen`   
      1. Un método que nos diga si tenemos la cantidad de repuestos necesarios para abordar una `Averia`. Esto nos obligara a sobrescribir el `equals` en `Repuesto` lo que nos facilitará saber si dos repuestos son iguales. [aquí](http://github.com/kzurro/Taller/commit/82fc8bc04a518b142997f6801b04b132ea3a18bf)
      1. Un método que nos sirva para "almacenar" repuestos en el `Almacen`, bien sea uno, varios (`colección` o `array`). commit [aquí](http://github.com/kzurro/Taller/commit/70af668d0f431fd903c66e1b80f7cd4c3b799d17)  
      1. Un método que asigne un `id` al `repuesto` según lo vayamos a "almacenar" en nuestro `Almacen`, creo un nuevo `constructor` en `Repuesto` sin `id` para facilitar las cosas.  commit [aquí](http://github.com/kzurro/Taller/commit/82fc8bc04a518b142997f6801b04b132ea3a18bf)
1. Implementar los vehículos a reparar. Hasta Ahora lo único que podíamos reparar era `VehiculosConRueda` pero no se había asociado un `Vehiculo` con las `averias` que tiene. Para ello:  
    1. Crear  un `CocheReparable` que será un `Coche` con `Averias`. commit [aquí](http://github.com/kzurro/Taller/commit/9434fcfaae791144a480bfcf3377eb90eece7f6b)  
    1. Si lo dejamos así nuestro `Taller` (`HojaDeTrabajo`) solo podrá reparar CocheReparable, creo una `Interface Reparable ` para que todas la clases que la implementen se puedan reparar. Se implementan varios métodos `Default` en la `interface` que serán comunes para todos los `Reparables`. commit [aquí](http://github.com/kzurro/Taller/commit/aca3617e0a87e2421836794482bb8bb61896b390).  
        *  Nos permitirá reparar cualquier cosa, ya no tendrá que ser algo que herede de Vehiculo. Los métodos que hagamos deberán ser comunes a todo lo que queremos arreglar para ello:  
           1. Un método que nos devuelva todas las averías.  
           1. Un método que nos diga si está reparado o no.  
           1. Un método que nos diga las horas de reparación
           1. Un método que nos diga cual es el coste de la reparación Los métodos 2, 3 y 4 para mi son `default` porque serán iguales para todas las cosas que queramos reparar (coches, motos, ordenadores o móviles) 
    1. Implementar `Reparable` a `CocheReparable` y modificar el atributo de `HojaDeTrabajo` `vehiculoAReparar` de tipo `VehiculoConRuedas` a  tipo `Reparable`. commit [aquí](http://github.com/kzurro/Taller/commit/6fdda94f3ec1273847dfefe6d499d8be46c695cc)
    1. En `HojaDeTaller` un método que sirva para cambiar las `Averias` del `vehiculoAReparar` a `averiasReparación`. Cambio el nombre de   `Collection<Averia>` `averiasReparacion` a `Collection<Averia>` `averiasArregladas` para darle mayor semántica. commit [aquí](http://github.com/kzurro/Taller/commit/06f8a55dd360beedd2f2a0474ba0639621fd175b)
1. Más Lógica al `Almacen`:  
   1. Un método que nos diga si hay un determinado Repuesto, este método tendrá un par de sobrecargas de tal forma que admita si tenemos un repuesto y si tenemos una cantidad de un Repuesto commit [aquí](http://github.com/kzurro/Taller/commit/82fc8bc04a518b142997f6801b04b132ea3a18bf) 
   1. Un método que nos permita almacenar un `Repuesto` en nuestro `Almacen`, deberá tener varias sobrecargas para que admita un `Repuesto`, una `Colección` de `Repuesto` o una `Array` de `Repuesto`.   commit [aquí](http://github.com/kzurro/Taller/commit/70af668d0f431fd903c66e1b80f7cd4c3b799d17)  
   1. Un método que nos permita asignar un nuevo `id` en nuestro `Almacen` para cuando queramos almacenar un `Producto`. commit [aquí](http://github.com/kzurro/Taller/commit/af06af00167b41055d5bb572a493ff16cf2965c8) 
1. Terminar de dar la lógica a  `Taller`:
   * Un método que nos permita hacer diagnosis, este método "meterá" una serie de `Averias` aleatorias al `Reparable`  
   1.   Creo una clase para las `Constantes` que nos puedan hacer falta, una es un listado de `Averia`  solo a efectos  de que el método `diagnosticar` de `Taller`. commit [aquí](http://github.com/kzurro/Taller/commit/7209899ec2658d721959992726ddd704ad386d0f)    
    _​Modifico clase CocheReparable porque en el constructor no había iniciado Lista Averia_  commit [aquí](http://github.com/kzurro/Taller/commit/4a77583cc54e79b46b2bc10558b29e48ce24f495)  
   1.  Creo una sobrecarga del método `diagnosticar` para que un `Reparable` con una `Averia` se le pueda meter otra, hay que controlar que no se puede meter la misma `Averia` dos veces.  
      _​Implementar `hasCode()` y `Equals()` en `Averia`, dos averias son iguales si tienen el mismo nombre y utilizan los mismos repuestos_ commit [aquí](http://github.com/kzurro/Taller/commit/ceef7f6f5e85f19f511887664101ee6b22b9da73)  
   1. Crear los métodos necesarios para cumplir con la garantía de un año.   
      1. Recuperar las `HojasDeTrabajo` de un `Reparable`  commit [aquí](http://github.com/kzurro/Taller/commit/6ec6d1e5785caa1265bd315c3525774037cf9229)  
      1. Recuperar las `hojasDeTrabajo` de un `Reparable` del ultimo año  
      1. Recuperar las `Coleccion` de `Averia` en garantía de un `Reparable`.  
      1. Comprobar si las `Coleccion` de `Averia` de un `Reparable` están en garantía. commit [aquí](http://github.com/kzurro/Taller/commit/a0d9b0088e6674257fb048c071e2032954d68e2a)
1. Probar el funcionamiento en un `main`. commit [aquí](http://github.com/kzurro/Taller/commit/336b6957874d62d6b99a2c08fe8a9b3b7a538773)

