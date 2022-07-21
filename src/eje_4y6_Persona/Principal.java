package eje_4y6_Persona;

import unpaz.ayp3.Consola;

public class Principal {

	public static void main(String[] args) 
	{
		System.out.println("=============================================================");
		System.out.println("||Ingreso del nombre y fecha de nacimiento de la 1er Perona||");
		System.out.println("=============================================================");
		String nombre1 = Consola.pedirTexto("Ingrese el nombre de la persona: ");
		int dia = Consola.pedirEntero("Ingrese el dia");
		int mes = Consola.pedirEntero("Ingrese el mes");
		int anio = Consola.pedirEntero("Ingrese el anio");
		Fecha f1 = new Fecha (dia,mes,anio);
		
		System.out.println("=============================================================");
		System.out.println("||Ingreso del nombre y fecha de nacimiento de la 2da Perona||");
		System.out.println("=============================================================");
		String nombre2 = Consola.pedirTexto("Ingrese el nombre de la persona: ");
		int dia2 = Consola.pedirEntero("Ingrese el dia");
		int mes2 = Consola.pedirEntero("Ingrese el mes");
		int anio2 = Consola.pedirEntero("Ingrese el anio");
		Fecha f2 = new Fecha (dia2,mes2,anio2);
		
		Persona p0;
		Persona p1 = new Persona(nombre1,f1);
		Persona p2 = new Persona(nombre2,f2);
		Persona personas[] = new Persona [] { p1,p2};
		
		System.out.println("Quien es mas joven");
		if(p1.masJovenQue(p2))
			System.out.println(p1+ " ES MAS JOVEN QUE "+p2);
		
		else 			
			System.out.println(p1+ " ES MAS GRANDE QUE "+p2);
		
		System.out.println();
		
		if (p1.tocayo(p2))
			System.out.println(p1+ " y " +p2+" Si son tocayo ");
		else 
			System.out.println(p1+ " y " +p2+ " No son tocayo ");
		
		System.out.println();
		if(p1.mismaPersona(p2))
			System.out.println(p1+ " y " +p2+" son las mismas personas ");
		else
			System.out.println(p1+ " y " +p2+" no son las mismas personas ");
		
		System.out.println();
		
		System.out.println("La persona mas joven es: " +Persona.masJoven(personas));
		
		System.out.println();
		
		String buscar = Consola.pedirTexto("Ingrese el nombre de la persona a buscar: ");
		p0=Persona.buscar(personas, buscar);
		if(p0 != null)
			System.out.println("Se encontro la persona " +p0);
		else
			System.out.println("No se encontro la persona que busca");	
	
	}

}
