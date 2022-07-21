package eje_3_Circulo;

import eje_2_Punto.Punto;

public class Circulo 
{
	//ATRIBUTOS
	double radio;
	Punto centro;
	
	//CONSTRUCTOR
	public Circulo(double centro_x, double centro_y, double radio)
	{
		centro = new Punto (centro_x, centro_y);
		this.radio = radio;
	}
	
	public void imprimir()
	{
		System.out.println("Centro X: " +centro.getX()+ ", Centro Y: " +centro.getY()+ ", Radio: " +radio);
	}
	
	public double perimetro()
	{
		return (2*radio*Math.PI);
	}
	
	public double superficie()
	{
		return(Math.PI*Math.pow(radio, 2));
	}
	
	public void escalar(Circulo c1, double factor)
	{
		
		c1.radio= c1.radio + factor;
	}
	
	public void desplazar(double desp_x, double desp_y)
	{
		centro.setX(centro.getX()+ desp_x);
		centro.setY(centro.getY()+ desp_y);	
	}
	
	public static double distancia(Circulo c1, Circulo c2)
	{
		double dist;
		dist = Punto.distancia(c1.centro, c2.centro);
		return  dist - (c1.radio + c2.radio);
		
	}
	
	public static boolean seTocan(Circulo c1, Circulo c2)
	{
		if (distancia(c1 , c2) <= 0)
			return true;
		else 
			return false;
	}
	
	public boolean loContiene(Circulo otro)
	{
		if (this.radio >= distancia(this,otro) + otro.radio)
			return true;
		else 
			return false;
	}
}
