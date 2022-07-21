package eje_1_Fraccion;

import unpaz.ayp3.Consola;

public class Principal {

	public static void main(String[] args) 
	{
		int n1 = Consola.pedirEntero("Ingrese el numerador de la primer fraccion: ");
		int n2 = Consola.pedirEntero("Ingrese el denominaodr de la primer fraccion: ");
		int n3 = Consola.pedirEntero("Ingrese el numerador de la segunda fraccion: ");
		int n4 = Consola.pedirEntero("Ingrese el denominaodr de la segunda fraccion: ");
		
		Fraccion f1 = new Fraccion(n1,n2);
		Fraccion f2 = new Fraccion (n3,n4);
		Fraccion f3 = new Fraccion (5,4);
		
		System.out.print("La primer ");
		f1.imprimir();
		System.out.print("La segunda ");
		f2.imprimir();
		f1.invertirSigno();
		f2.invertir();
		
		System.out.println("Double de la primer Fraccion: "+f1.aDouble());
		System.out.println("Producto de fracciones: "+Fraccion.producto(f3, f2));
		System.out.println("Suma de fracciones: "+Fraccion.suma(f3, f2));
		
		
	}

}
