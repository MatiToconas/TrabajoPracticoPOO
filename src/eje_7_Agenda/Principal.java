package eje_7_Agenda;

import eje_4y6_Persona.Fecha;
import eje_4y6_Persona.Persona;

public class Principal {

	public static void main(String[] args) 
	{
		Agenda ag= new Agenda(4);
		
		String nombre1 = "NOELIA";
		Fecha f1 = new Fecha (8,11,1995);
		
		String nombre2 = "Matias";
		Fecha f2 = new Fecha (9,12,1995);
		
		String nombre3 = "Elias";
		Fecha f3 = new Fecha (20,10,1980);
		
		String nombre4 = "Fernando";
		Fecha f4 = new Fecha (12,03,1983);
		
		Persona p1 = new Persona (nombre1,f1);
		
		Persona p2 = new Persona (nombre2,f2);
		
		Persona p3 = new Persona (nombre3,f3);
		
		Persona p4 = new Persona (nombre4,f4);
		System.out.println("==========");
		System.out.println("||Agenda||");
		System.out.println("==========");
		ag.guardar(p1, "12345");
		ag.guardar(p2, "54328");
		ag.guardar(p3, "92563");
		ag.guardar(p4, "54321");
		ag.imprimir();
		
		System.out.println();
		System.out.println("====================================");
		System.out.println("||Agenda con el contacto eliminado||");
		System.out.println("====================================");
		ag.eliminar(p1);
		System.out.println("Se elimino a la persona " +p1);
		ag.imprimir();
		
		System.out.println();
		System.out.println("Resultado de la busqueda del contacto");
		System.out.println("=====================================");
		if(ag.pertenece(p2))
			System.out.println("El contacto " +p2+ " esta en la agenda");
		else
			System.out.println("El contacto " +p2+ " no esta en la agenda");
		
		System.out.println();
		System.out.println("Resultado de la busqueda del telefono");
		System.out.println("=====================================");
		System.out.println("El numero de telefono buscado es: " +ag.dameTelefono(p1));
		System.out.println();
	}

}
