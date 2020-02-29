package nICE;
//clase padre de las que heredaran Lavadora y Television sus atributos y metodos
public class Electrodomestico {
//inicializacion de variables
	private final int precioBase = 100000, pesoBase = 5;
	private final String colorBase = "blanco";
	private final char consumoEnergeticoBase = 'F';
	private int precio;
	private int peso,euro = 896;	
	private String color, tipo;
	private char consumoEnergetico;
	//creacion de constructores
public Electrodomestico()
{
	
}

public Electrodomestico(int precio, int peso)
{
	this.precio = precio;
	this.peso = peso;
}

public Electrodomestico(int precio, int peso, String color, char consumoEnergetico)
{
	this.precio = precio;
	this.peso = peso;
	this.color = color;
	this.consumoEnergetico = consumoEnergetico;
	//aca se hace un llamado a los metodos de comprobacion
	comprobarConsumoEnergetico(consumoEnergetico);
	comprobarColor(color);
	
}
//Se crean los get y set de cada atributo, para los atributos constantes solo se crearan los get
public int getPrecioBase()
{
	return precioBase;
	
}

public int getPrecio()
{
	return precio;
	
}

public void setPrecio(int precio)
{
	this.precio += precio;
}


public int getPesoBase()
{
	return pesoBase;
}

public int getPeso()
{
	return peso;
}

public void setPeso(int peso)
{
	this.peso = peso;
}


public String getColorBase()
{
	return colorBase;
}

public String getColor()
{
	return color;
}

public void setColor(String color)
{
	this.color = color;
}


public char getConsumoEnergeticoBase()
{
	return consumoEnergeticoBase;
}

public char getConsumoEnergetico()
{
	return consumoEnergetico;
}

public void setConsumoEnergetico(char ConsumoEnergetico)
{
	this.consumoEnergetico = ConsumoEnergetico;
}

public int getEuro()
{
	return euro;
}

public void setEuro(int euro)
{
	this.euro = euro;
}

public String getTipo()
{
	return tipo;
	
}

public void setTipo(String tipo)
{
	this.tipo = tipo;
}
//metodo para comprobar el consumo, se verifica mediante switch en donde si se coloca un valor fuera del margen establecido se 
//le asigna el valor de una constante.
public void comprobarConsumoEnergetico(char letra)
{
	switch (letra)
	{
		case 'A':
			break;
		case 'B':
			break;
		case 'C':
			break;
		case 'D':
			break;
		case 'E':
			break;
		case 'F':
			break;
		default:
			consumoEnergetico = consumoEnergeticoBase;
			break;
	}
}
//metodo para comprobar el color, se verifica mediante switch en donde si se coloca un valor fuera del margen establecido se 
//le asigna el valor de una constante.
public void comprobarColor(String color)
{
	switch (color)
	{
		case "blanco":
			break;
		case "negro":
			break;
		case "rojo":
			break;
		case "azul":
			break;
		case "gris":
			break;
		default:
			this.color = colorBase;
			break;
	}	
}
//metodo para agregar valor dependiendo de su consumo energetico y su peso. Se llamara en otras clases para ir agregando
//valor al producto
public void precioFinal()
{
	switch (consumoEnergetico)
	{
		case 'A':
			precio += euro * 100;
			break;
		case 'B':
			precio += euro * 80;
			break;
		case 'C':
			precio += euro * 60;
			break;
		case 'D':
			precio += euro * 50;
			break;
		case 'E':
			precio += euro * 30;
			break;
		case 'F':
			precio += euro * 10;
			break;
		default:
			break;
	}

	if(peso >= 0 && peso <= 19)
	{
		precio += euro * 10;
	}
	else if(peso >= 20 && peso <= 49)
	{
		precio += euro * 50;
	}
	else if(peso >= 50 && peso <= 79)
	{
		precio += euro * 80;
	}
	else if(peso >= 80)
	{
		precio += euro * 100;
	}
}




}
