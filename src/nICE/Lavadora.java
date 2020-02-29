package nICE;
//clase hija llamada Lavadora que hereda de Electrodomestico
public class Lavadora extends Electrodomestico {
	private final int cargaBase = 5;
	private int carga;
//Creacion de constructores
public Lavadora() 
{
		
}
	
public Lavadora(int precio, int peso)
{
	super.setPrecio(precio);
	super.setPeso(peso);
}

public Lavadora(String tipo, int precio, int peso, String color, char consumoEnergetico, int carga)
{
	this.carga = carga;
	//en este constructor se llaman los atributos heredados con la palabra reservada super. Se le asignan valores con los parametros.
	super.setPrecio(precio);
	super.setPeso(peso);
	super.setColor(color);
	super.setConsumoEnergetico(consumoEnergetico);
	super.setTipo(tipo);
	//nuevamente se comprueba color y consumo para ir agregando valor al electrodomestico
	super.comprobarColor(color);
	super.comprobarConsumoEnergetico(consumoEnergetico);
	
}
//creacion de gets y sets
public int getcargaBase()
{
	return cargaBase;
	
}

public int getCarga()
{
	return carga;
	
}

public void setCarga(int carga)
{
	this.carga = carga;
}
//al igual que precio final de padre, sirve para darle mas valor al electrodomestico.
public void precioFinal()
{
	if (carga > 30)
	{
		super.precioFinal();
		super.setPrecio(super.getEuro()*50);
		
	}
}

}
