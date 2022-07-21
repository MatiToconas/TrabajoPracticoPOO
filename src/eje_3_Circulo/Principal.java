package eje_3_Circulo;

import unpaz.ayp3.Consola;

public class Principal {

	public static void main(String[] args) 
	{
		System.out.println("Ingresamos los valores del Circulo");
		System.out.println("==================================");
		double n1 = Consola.pedirDecimal("Ingrese el valor de X: ");
		double n2 = Consola.pedirDecimal("Ingrese el valor de Y: ");
		double n3 = Consola.pedirDecimal("Ingrese el valor del Radio: ");

		Circulo cir = new Circulo(n1,n2,n3);
		
		System.out.println("Valores del circulo");
		cir.imprimir();
		System.out.println("");
		System.out.print("Perimetro: " +cir.perimetro()+ " Superficie: " +cir.superficie());
		System.out.println("");
	
		System.out.println("");
		double escalar = Consola.pedirDecimal("Ingrese un valor para modificar el radio del circulo: ");
		cir.escalar(cir,escalar);
		cir.imprimir();
		System.out.println("");
		
		double despX = Consola.pedirDecimal("Ingrese un valor para despazar X: ");
		double despY = Consola.pedirDecimal("Ingrese un valor para despazar X: ");
		cir.desplazar(despX, despY);
		cir.imprimir();
		
		System.out.println("");
		System.out.println("Ingresamos Otro Circulo");
		System.out.println("=======================");
		double n4 = Consola.pedirDecimal("Ingrese el valor de X: ");
		double n5 = Consola.pedirDecimal("Ingrese el valor de Y: ");
		double n6 = Consola.pedirDecimal("Ingrese el valor del Radio: ");
		
		Circulo cir2 = new Circulo(n4,n5,n6);
		System.out.println("Valores del Otro Circulo");
		cir2.imprimir();
		
		System.out.println("");
		System.out.println("Distancia entre los dos Circulos: " +Circulo.distancia(cir, cir2));
		
		System.out.println("");
		if (Circulo.seTocan(cir, cir2)== true) 
		{
			System.out.println("Los circulos se tocan");
		}
			else
			{
				System.out.println("Lo circulos no se tocan");
			}
		
		System.out.println("");
			if (cir.loContiene(cir2)== true) 
			{
				System.out.println("El primer Circulo Lo contiene al Otro Circulo");
			}
				else 
				{
					System.out.println("El primer Circulo No lo contiene al Otro Circulo");
				}
	}

}
