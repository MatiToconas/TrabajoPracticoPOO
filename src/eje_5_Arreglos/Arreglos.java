package eje_5_Arreglos;

public class Arreglos 
{
	public static boolean esSinRepetidos(int[] arr) 
	{
		for (int i=0; i < arr.length; i++)
		{
			for (int j=i+1; j<arr.length-1; j++)
			{
				if(arr[j] == arr[i])
					return false;
			}
		}
		
		return true;
	}
	
	public static int [] pegar(int[] arr, int [] arr2)
	{
		int i;
		int [] resultado = new int [arr.length+ arr2.length];
		for (i=0; i<arr.length; i++)
		{
			resultado[i] = arr[i];
		}
		for (int j=arr.length; j<arr.length+arr2.length; j++)
		{
			resultado[j] = arr2[j-arr2.length];
		}
		return resultado;
	}
	
	static int [] agregarAlFinal(int[] arr, int elem)
	{
			
		int [] agregar = new int [arr.length+1];
		
		for (int i=0; i<arr.length; i++)
		{
			agregar[i] = arr[i];
		}
		
		agregar [arr.length] = elem;
		return agregar;
		
	}
	
	static int [] sinRepetidos(int[] arr)
	{
		int [] arr2 = new int [arr.length];
		for (int i=0; i<arr.length-1; i++)
		{
			for (int j=i+1; j<arr.length; j++)
			{
				if (arr[i]== arr[j]) 
				{
				 arr[j]=0;
				}
				else arr2[i]= arr[i];
			}
		}
		return arr2;
	}

	public static void invertir(int[] arr)
	{
	    int [] invertir = new int [arr.length];
        int aux = arr.length;
 
        for (int i = 0; i<arr.length; i++) 
        {
            invertir[aux - 1] = arr[i];
            System.out.print(+aux--+ " ");
        }
		
		
	}	
	
	
	public static void imprimir (int[] arr)
	{
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}
}
