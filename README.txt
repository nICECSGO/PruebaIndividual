En esta prueba individual entendi a traves de la practica todo lo estudiado en la teoria, completando asi un exito personal impuesto desde la tercera semana de clases. Muchas gracias por la oportunidad de estudiar este ciclo del curso de programador java full stack.

Clase Electrodomestico:

Esta clase es la superclase de lavadora y television, es la que mayor informacion y mas trabajo tuvo de esta prueba, si bien solo tenia que leer la guia dada para su creacion, la realizacion de los metodos para que cumplieran con su cometido fue exhausta y complicada.

Tiene las constantes llamadas precioBase, colorBase y consumoEnergeticoBase. Tambien posee los atributos precio, peso, euro (para convertir el euro en peso chileno, se usa como atributo ya que cambia con el tiempo), color, tipo (para saber si es una lavadora o un televisor) y consumoEnergetico.

Los metodos que contiene son: constructores(), get() y set(), comprobarConsumoEnergetico(), comprobarColor() y precioFinal().

comprobarConsumoEnergetico(): metodo para comprobar el consumo, se verifica mediante un switch en donde si se coloca un valor fuera del margen establecido se le asigna el valor de la constante consumoEnergeticoBase.

comprobarColor(): metodo para comprobar el color, se verifica mediante switch en donde si se coloca un valor fuera del margen establecido se le asigna el valor de la constante colorBase.

precioFinal():metodo para agregar valor dependiendo de su consumo energetico y su peso. Se llamara en otras clases para ir agregando valor al producto, se utiliza un switch para agregar valor dependiendo de su consumo y un if para agregar valor dependiendo de su peso.


Clase Lavadora:

Esta clase, es la subclase de Electrodomestico, la cual con la creacion de la clase padre y sus herencias, resulto mucho mas sencilla de crear. Se usaron metodos dentro de metodos para resolver el problema apostando a la seguridad de datos al no tener que llamar a tantos de ellos al realizar comprobacion en la clase Main. Tiene una sola constante llamada cargaBase y solo un atributo llamado carga aparte de los ya heredados.

Los metodos que contiene son: constructores(), get() y set y precioFinal().

precioFinal(): Al igual que en la clase padre, se va agregando valor al electrodomestico dependiendo del valor del atributo carga.

Clase Television:

Al igual que la clase Lavadora, es una subclase de la clase Electrodomestico. Tambien fue sencilla realizarla ya que gracias a la herencia y al polimorfismo simplifico la realizacion de esta.
Tiene 2 constantes llamadas resolucionBase y sintonizadorTDTbase, tambien contiene 2 atributos llamados resolucion y sintonizadorTDT.

Los metodos que contiene son: constructores(), get() y set() y precioFinal().

precioFinal(): En este caso, este metodo contiene 2 if para comprobar si es que los atributos resolucion y sintonizadorTDT presentan los requerimientos minimos para aumentar el precio del electrodomesticos.

Clase Main(ejecutable):

En esta clase se instancia un Vector de objetos de 10 espacios para la creacion de 6 lavadoras y 4 televisores mas sus atributos a criterio del desarrollador. Tambien se crean 4 atributos para contar la cantidad de lavadores y televisores y tambien sumar los valores de estos mismos como tambien imprimir los objetos detectados. Se realizo un for para recorrer el Vector y un if para contar y sumar los electrodomesticos por separados. Al final del bloque for se realizo la impresion de los atributos de suma y contador, para poder mostrar el valor total de los electrodomesticos por separado mas la cantidad de cada tipo como tambien el valor total de los electrodomesticos en general.

La prueba tuvo buena exigencia de conocimientos, aunque si se hubiera realizado el proyecto completo, desde diagramas de clase hasta la documentacion de javadoc, hubiera costado mucho mas. De todas formas se agradece ya que aprendi muchisimo y puli mis conocimientos teoricos y practicos.

Muchas gracias Awaker y Awakelab de adalid.