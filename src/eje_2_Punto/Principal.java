package eje_2_Punto;

import unpaz.ayp3.Consola;

public class Principal {

	public static void main(String[] args) 
	{
		int x = Consola.pedirEntero("Ingrese el valor de X del primer punto:");
		int y = Consola.pedirEntero("Ingrese el valor de Y del primer punto:");
		int X = Consola.pedirEntero("Ingrese el valor de X del segundo punto:");
		int Y = Consola.pedirEntero("Ingrese el valor de Y del segundo punto:");
		
		Punto p1 = new Punto(x,y);
		Punto p2 = new Punto(X,Y);
		
		System.out.print("Valores del primer punto: ");
		p1.imprimir();
		
		System.out.println("");
		System.out.print("\nValores del primer punto desplazado: ");
		p1.desplazar(p1, 2, 3);
		p1.imprimir();
		
		System.out.println("");
		System.out.println("\nDistancia entre los 2 puntos: "+Punto.distancia(p1,p2));
		
	}

}
