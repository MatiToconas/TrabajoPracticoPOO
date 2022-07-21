package eje_2_Punto;

public class Punto 
{
	//ATRIBUTOS
	private double x;
	private double y;
	
	//CONSTRUCTOR
	public Punto()
	{
		this.x = 0;
		this.y = 0;
	}
	
	//CONSTRUCTOR
	public Punto(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	public void imprimir()
	{
		System.out.printf("\nVALOR X:" + this.x + "\nVALOR Y:" + this.y);
	}
	
	public void desplazar(Punto p1, double desp_x, double desp_y)
	{
		p1.x=p1.x+desp_x;
		p1.y=p1.y+desp_y;
	}
	
	public static double distancia(Punto p1, Punto p2)
	{
		return (Math.sqrt(Math.pow(p1.x-p2.x, 2) + Math.pow(p1.x-p2.x, 2)));
	}
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
}
