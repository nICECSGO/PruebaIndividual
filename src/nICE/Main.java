package nICE;

//clase padre tiene precio, peso, color, consumoEnergetico.
//lavadora tiene solo carga
//television tiene resolucion y TDT
public class Main {

	public static void main(String[] args) {
		//se crea un vector de objetos y se llenan sus datos
		Electrodomestico array[] = new Electrodomestico[10];
		array[0] = new Lavadora("Lavadora",170000,4,"azul",'E',50);
		array[1] = new Lavadora("Lavadora",200000,10,"rojo",'D',50);
		array[2] = new Lavadora("Lavadora",250000,50,"verde",'B',50);
		array[3] = new Lavadora("Lavadora",300000,11,"naranja",'A',50);
		array[4] = new Lavadora("Lavadora",80000,45,"negra",'G',50);
		array[5] = new Lavadora("Lavadora",100000,7,"blanca",'c',50);
		array[6] = new Television("Television",175456,4,"azul",'D',30,true);
		array[7] = new Television("Television",170000,4,"azul",'D',45,true);
		array[8] = new Television("Television",170000,4,"azul",'D',60,false);
		array[9] = new Television("Television",170000,4,"azul",'D',70,false);
		//Se crean contadores y sumas para mostrarlos por pantalla
		int contadorLavadora = 0;
		int contadorTelevisor = 0;
		int sumaLavadora = 0;
		int sumaTelevisor = 0;
		//se recorre el vector ejecutando el metodo precioFinal() para que se actualizen los precios, luego se muestra por pantalla
		//y se acumulan tanto los precios como la cantidad de tipos de electrodomesticos.
		for (int i = 0; i<10;i++)
		{
			array[i].precioFinal();
			System.out.println("esto es un(a) " + array[i].getTipo()+" que tiene un precio de: "+array[i].getPrecio());
			if(array[i].getTipo() == "Lavadora")
			{
				contadorLavadora += 1;
				sumaLavadora += array[i].getPrecio();
			}
			else
			{
				contadorTelevisor += 1;
				sumaTelevisor += array[i].getPrecio();
			}
			
		}
		//se muestra por pantalla el resultado del programa
		System.out.println("La cantidad de lavadoras son: "+contadorLavadora);
		System.out.println("La cantidad de televisores son: "+contadorTelevisor);
		System.out.println("La suma total de las lavadoras es: "+sumaLavadora);
		System.out.println("La suma total de las Televisores es: "+sumaTelevisor);
		System.out.println("La suma total de todo es: "+(sumaLavadora+sumaTelevisor));

		
	}

}
