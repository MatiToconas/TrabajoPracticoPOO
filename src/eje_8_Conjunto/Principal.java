package eje_8_Conjunto;

public class Principal 
{

	public static void main(String[] args) 
	{
		System.out.println("||Conjuntos||");
		System.out.println("=============");
		Conjunto c1 = new Conjunto();
		Conjunto c2 = new Conjunto();
		c1.agregar(2);
		c1.agregar(6);
		c1.agregar(3);
		c2.agregar(4);
		c2.agregar(2);
		c2.agregar(9);
		
		System.out.print("Conjunto 1: ");
		System.out.print("(");
		c1.imprimir();
		System.out.println(")");
		
		System.out.println("");
		System.out.print("Conjunto 2: ");
		System.out.print("(");
		c2.imprimir();
		System.out.println(")");
		
		System.out.println("");
		System.out.print("Union de los 2 conjuntos:");
		Conjunto union = Conjunto.union(c1, c2);
		System.out.print("(");
		union.imprimir();
		System.out.println(")");
		
		System.out.println("");
		System.out.print("Interseccion de los 2 conjuntos:");
		Conjunto interseccion = Conjunto.interseccion(c1, c2);
		System.out.print("(");
		interseccion.imprimir();
		System.out.println(")");
		
		System.out.println("");
		System.out.print("Resta de 2 conjuntos:");
		Conjunto resta = Conjunto.resta(c1, c2);
		System.out.print("(");
		resta.imprimir();
		System.out.println(")");
		
		System.out.println("");
		System.out.print("Restar:");
		c2.restar(c1);
		System.out.print("(");
		c2.imprimir();
		System.out.println(")");
	}

}
