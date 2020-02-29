package nICE;
//clase hija llamada Television que hereda de Electrodomestico
public class Television extends Electrodomestico {
	private final int resolucionBase = 20;
	private final boolean sintonizadorTDTbase = false;
	private int resolucion;
	private boolean sintonizadorTDT;
//creacion de constructores
public Television()
{
	
}

public Television(int precio, int peso)
{
	super.setPrecio(precio);
	super.setPeso(peso);
}

public Television(String tipo, int precio, int peso, String color, char consumoEnergetico, int resolucion, boolean sintonizadorTDT)
{
	this.resolucion = resolucion;
	this.sintonizadorTDT = sintonizadorTDT;
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
public int getResolucionBase()
{
	return resolucionBase;
	
}

public int getResolucion()
{
	return resolucion;
	
}

public void setResolucion(int resolucion)
{
	this.resolucion = resolucion;
}
public boolean getSintonizadorTDTbase()
{
	return sintonizadorTDTbase;
	
}

public boolean getSintonizadorTDT()
{
	return sintonizadorTDT;
	
}

public void setSintonizadorTDT(boolean sintonizadorTDT)
{
	this.sintonizadorTDT = sintonizadorTDT;
}
//al igual que precio final de padre, sirve para darle mas valor al electrodomestico. Se incrementa el valor dependiendo de su
//resolucion y si es que tiene o no sintonizador.

public void precioFinal()
{
	if (resolucion > 40)
	{
		super.precioFinal();
		super.setPrecio((int)(super.getPrecio()*1.30));
	}
	if (sintonizadorTDT == true)
	{
		super.precioFinal();
		super.setPrecio(super.getEuro()*50);
		
	}
}


}
