package eje_8_Conjunto;

public class Conjunto 
{
	//ATRIBUTOS
	private int[] elementos;
	private int cantidad;
	private int tamanio = 5;
	
	//CONSTRUCTOR
	Conjunto()
	{
		elementos = new int [tamanio];
		cantidad = 0;
	}
	
	void agregar(int n)
	{
		if(!pertenece(n))
		{
			if (lleno())
			{
				redimencion();
				elementos[cantidad++]=n; 
			}
			else
				elementos[cantidad++]=n;
		}
	}
		
		public void redimencion()
		{
			int [] nuevo = new int [cantidad*2];
			for(int i=0; i<this.cantidad;i++)
			{
				nuevo[i]=elementos[i];
				elementos= nuevo;
			}
		}
		
		public boolean pertenece(int n)
		{
			for (int i=0; i<this.cantidad; i++)
			{
				if (this.elementos[i] == n)
					return true;
			}
			
			return false;
		}
		
		public boolean lleno()
		{
			if(this.elementos.length == this.cantidad)
				return true;
			else
				return false;
		}
		
		
		public void imprimir()
		{
			for(int i=0; i<this.cantidad;i++)
			{
				System.out.print(this.elementos[i]+" ");
			}
		}
		
		public void quitar(int n)
		{
			int i=0;
			int j=0;
			
			if(pertenece(n))
			{
				if(cantidad == 1)
					elementos[--cantidad]=0;
				else
				{
					do
					{
						if(elementos[i] == n)
							i++;
						else
						{
							elementos[j] = elementos[i];
							i++;
							j++;
						}
					}while(i<cantidad);
					elementos[--cantidad]=0;
					
				}
			}
		}
		
		public static Conjunto union(Conjunto c1, Conjunto c2)
		{
			Conjunto co1 = new Conjunto();
			
			for(int i=0; i<c1.cantidad;i++)
			{
				co1.agregar(c1.elementos[i]);
			}
			for(int j=0;j<c2.cantidad;j++)
			{
				co1.agregar(c2.elementos[j]);
			}
			return co1;
		}
		
		public static Conjunto interseccion(Conjunto c1, Conjunto c2)
		{
			Conjunto co2 = new Conjunto();
			
			for(int i=0; i<c1.cantidad; i++)
			{
				for(int j=0; j<c2.cantidad; j++)
				{
					if(c1.elementos[i]==c2.elementos[j])
					{
						co2.agregar(c1.elementos[i]);
					}
				}
			}
			
			return co2;		
		}
		public static Conjunto resta(Conjunto c1, Conjunto c2)
		{
			Conjunto co3 = new Conjunto();
			
			for(int i=0; i<c1.cantidad;i++)
			{
				if(!c2.pertenece(c1.elementos[i]))
					co3.agregar(c1.elementos[i]);
			}
			return co3;
		}
		
		
		public void restar(Conjunto c)
		{
			
			for(int i=0; i<this.cantidad;i++)
			{
				if(this.pertenece(c.elementos[i]))
					quitar(c.elementos[i]);
			}
		}
}
