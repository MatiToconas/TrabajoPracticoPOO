package eje_7_Agenda;

import eje_4y6_Persona.Persona;

public class Agenda 
{
	//ATRIBUTOS
	Persona[] contactos;
	String[] telefonos;
	
	//CONSTRUCTOR
	Agenda(int tamanio)
	{
		this.contactos = new Persona [tamanio];
		this.telefonos = new String [tamanio];
	}
	
	void guardar(Persona contacto, String telefono)
	{
		boolean bandera=true;
		
		for(int i=0; i<contactos.length && bandera; i++)
		{
			if(contactos[i] == null)
			{
				contactos[i] = contacto;
				telefonos[i] = telefono;
				bandera=false;
			}
		}
	}
	
	public void eliminar(Persona contacto)
	{
		boolean bandera=true;
		
		for(int i=0; i<contactos.length && bandera; i++)
		{
			if(contactos[i].mismaPersona(contacto))
			{
				contactos[i] = null;
				telefonos[i] = null;
				bandera=false;
			}
		}
	}
	
	public boolean pertenece(Persona contacto)
	{
		for(int i=0; i<contactos.length; i++)
		{
			if(contactos[i] != null && contactos[i].mismaPersona(contacto))
			{
				return true;
			}
		}
		return false;
	}
	
	public String dameTelefono(Persona contacto)
	{
		
		for(int i=0; i<contactos.length; i++)
		{
			if(pertenece(contacto) == true) 
			{
				if(contactos[i].mismaPersona(contacto))
				{
					return telefonos[i];
				}
			}
		}
		System.out.println("El contacto no esta en la agenda");
		return null;
	}
	
	public void imprimir()
	{
		for(int i=0; i<contactos.length; i++)
		{
			System.out.println("Persona: " + contactos[i] +" con numero de telefono: "+ telefonos[i] );
		}
	}
	
}
