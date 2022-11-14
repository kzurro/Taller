# EJERCICO DE LA ASIGNATURA DE PROGRAMACIÓN ORIENTADA A OBJETOS

[Ejercicio Original](github.com/Awes0meM4n/codigoHijosDelSpectrum/tree/master/Java/practicas/AsistenciaMotor#pr%C3%A1ctica-taller)

**Enunciado:**

Se quiere implementar un programa para un taller de reparación de vehículos.   
Inicialmente nuestro taller será similar al que se puede encontrar en cualquier barrio.
Nuestro programa deberá gestionar el `Taller` y el `Almacen` que tiene asociado todo negocio de este tipo.  

Nuestra Aplicación debe cumplir los siguientes requisitos:   

Se pide crear e implementar una Clase Taller que admita distintos tipos de vehículos particulares (coches, motos, etc...)  

1. La clase `Taller` de encargará de arreglar `vehículos averiados`. Puede ser que tengan varias averías distintas, las cuales normalmente llevarán asociado un presupuesto basado en el `número de horas` de mano de obra y las piezas de `repuesto` que necesite.  
1. Cuando se ingrese un vehículo al taller para su reparación se debe dar la estimación de horas que llevará su reparación tras hacerle un diagnóstico y el presupuesto estimado.  
1. El turno para reparar los vehículos los dará en primer lugar la existencia de piezas de `repuesto` para reparar todas las `averías`, después la `fecha de entrada` del vehículo al taller y finalmente el menor tiempo de reparación estimado.
1. La reparación tendrá una fecha de entrega del vehículo y tiene un periodo de garantía de un año. En caso de surgir la misma avería en menos de un año, el taller reparará dicha avería sin coste para el cliente a menos que en la diagnosis de detecte algún tipo de mal uso o fraude.


## [Posible Solución](./Solucion.md)
