package eje_4y6_Persona;

public class Persona 
{
	//ATRIBUTOS
	String nombre;
	Fecha fecha_nacimiento;
	
	//CONSTRUCTOR
	public Persona(String nombre, Fecha f_nac)
	{
		this.nombre = nombre;
		this.fecha_nacimiento = f_nac;
	}
	
	public boolean masJovenQue(Persona otro)
	{
		if(this.fecha_nacimiento.anio > otro.fecha_nacimiento.anio)
		{
			return true;
		}
		else 
		{
			if(this.fecha_nacimiento.anio == otro.fecha_nacimiento.anio)
			
			if(this.fecha_nacimiento.mes > otro.fecha_nacimiento.mes)
			{
				return true;
			}
			else
			{
				if(this.fecha_nacimiento.mes == otro.fecha_nacimiento.mes)	
					
					if(this.fecha_nacimiento.dia > otro.fecha_nacimiento.dia)
					{
						return true;
					}
					else return false;
			}
		}	
				return false;
	}	
	
	public boolean tocayo(Persona otro)
	{
		if(this.nombre.equals(otro.nombre))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean mismaPersona(Persona otro)
	{
		if(this.nombre.equals(otro.nombre) && this.fecha_nacimiento.equals(otro.fecha_nacimiento))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static Persona masJoven(Persona[] grupo)
	 {
		Persona aux;
		 aux= grupo[0];
	
		  for(int i=1; i<grupo.length; i++)
		   {
			   if(grupo[i].masJovenQue(aux))
				   
				aux= grupo[i];
		    }
	 
		  		return aux;
	  }

	 public static Persona buscar(Persona[] grupo, String nombre)
	  {
		 Persona persona = null;
		 for(int i=0; i<grupo.length;i++)
		  {
			 if(grupo[i].nombre.equalsIgnoreCase(nombre))
			 {
			    return grupo[i];
			 }
		
		  }
		 		return persona;
	   }

	 @Override
	public String toString() {
	return nombre + fecha_nacimiento ;
}
}

