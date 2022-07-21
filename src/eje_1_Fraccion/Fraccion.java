package eje_1_Fraccion;

public class Fraccion {
	//ATRIBUTOS
	private int numerador;
	private int denominador;
	
	//METODO CONSTRUCTOR
	 public Fraccion(int numerador, int denominador)
	{
		this.numerador = numerador;
		this.denominador = denominador;
	}

	public void imprimir()
	{
		System.out.println("Fraccion es: " +numerador+ "/" +denominador);
	}
	
	public void invertirSigno()
	{
		numerador = numerador * -1;
		denominador = denominador * -1;
		System.out.println("Fraccion con signo invertido: " +numerador+ "/" +denominador);
	}
	
	public void invertir()
	{
		int temporal;
		temporal = numerador;
		numerador = denominador;
		denominador = temporal;
		System.out.println("Fraccion invertida: " +numerador+ "/" +denominador);
	}
	
	public double aDouble()
	{
		return (double)numerador / denominador;
	}
	
	public static Fraccion producto(Fraccion q1, Fraccion q2)
	{
		Fraccion fraccion = new Fraccion(q1.numerador*q2.numerador, q1.denominador*q2.denominador);
		 return  fraccion;	
	}
	
	static Fraccion suma(Fraccion q1, Fraccion q2)
	{
		Fraccion fraccion = new Fraccion(q1.numerador*q2.denominador + q1.denominador*q2.numerador , q1.denominador*q2.denominador);
		return fraccion;
	}

	@Override
	public String toString() {
		return numerador+ "/" +denominador;
	}
	
	
}
