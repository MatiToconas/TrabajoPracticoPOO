package eje_5_Arreglos;

import java.util.Scanner;

import unpaz.ayp3.Consola;

public class Principal {

	public static void main(String[] args) 
	{
		try (Scanner n = new Scanner (System.in)) 
		{
			System.out.println("            ||Arreglos||");
			System.out.println("            ============");
			int largo = Consola.pedirEntero("Ingrese la cantidad de elementos que tendra el arreglo");
			
			int [] arr = new int[largo];

			System.out.println("Ingrese los " + largo +" elementos del arreglo ");
			
			for (int i = 0; i < largo; i++)
			{
				System.out.print("Ingrese un numero: ");
				arr[i]= n.nextInt();
			}
			
			//MOSTRAMOS LOS ELEMENTOS DEL ARREGLO
			System.out.println("");
			System.out.print("El Arreglo contiene los siguientes elementos: ");
			System.out.print("[");
			Arreglos.imprimir(arr);
			System.out.println("]");
			
			/*System.out.println("");
			if(Arreglos.esSinRepetidos(arr) == true)
			{
				System.out.println("¡¡El arreglo no tiene elementos repetidos!!");
			}
			else 
			{
				System.out.println("¡¡El arreglo tiene elementos repetidos!!");
			}
			
			System.out.println("");
			int largo2 = Consola.pedirEntero("Ingrese la cantidad de elementos que tendra el nuevo arreglo");
			
			int [] arr2 = new int[largo2];
			
			System.out.println("Ingrese los " + largo2 +" elementos del arreglo ");
			
			for (int i = 0; i < largo2; i++)
			{
				System.out.print("Ingrese un numero: ");
				arr2[i]= n.nextInt();
			}
			
			System.out.println("");
			System.out.print("El Nuevo Arreglo contiene los siguientes elementos: ");
			System.out.print("[");
			Arreglos.imprimir(arr2);
			System.out.println("]");
			
			System.out.println("");
			int [] pegar = new int[arr.length+arr2.length];
			pegar = Arreglos.pegar(arr, arr2);
			System.out.print("Elementos de los arreglos 1 y 2 pegados: ");
			System.out.print("[");
			Arreglos.imprimir(pegar);
			System.out.println("]");
			
			System.out.println("");
			int nuevo = Consola.pedirEntero("Ingrese el nuevo elemento para agregar al final del arreglo 1 ");
			System.out.print("Nuevo Arreglo con el elemento agregado al final: ");
			int [] arrFinal = new int[arr.length+1];
			arrFinal = Arreglos.agregarAlFinal(arr, nuevo);
			System.out.print("[");
			Arreglos.imprimir(arrFinal);
			System.out.println("]");
			
			System.out.println("");
			System.out.println("Arreglo 1 Invertido: ");
			System.out.print("[");
			Arreglos.invertir(arr);
			System.out.println("]");
			*/
			
			int [] sinRep = new int[arr.length];
			sinRep = Arreglos.sinRepetidos(arr);
			System.out.println("Sin repetidos: ");
			System.out.print("[");
			Arreglos.imprimir(sinRep);
			System.out.println("]");
			
		}
		
	}
	

}
