package es.infomatica;

public class Veicolo 
{
	//attribute
	private String marca;
	
	//constructor
	public Veicolo(String marca)
	{
		this.marca=marca;
	}
	
	//methods
	public String getMarca()
	{
		return marca;
	}
	@Override
	public String toString()
	{
		return marca;
	}
	public boolean isEqual(Object other)
	{
		
		if(this.marca==((Veicolo)other).getMarca())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
