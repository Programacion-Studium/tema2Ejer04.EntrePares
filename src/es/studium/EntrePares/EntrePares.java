package es.studium.EntrePares;
//importamos la utilidad del teclado.
import java.util.Scanner;

public class EntrePares 
{
	public static void main(String[] args)
	{
		int numero1, numero2, i;
		//Creamos el objeto que nos permite leer por teclados
		java.util.Scanner teclado = new Scanner(System.in);
		//mostramos por pantalla y recojemos un numero por teclado
		System.out.println("Dame un número");
		numero1 = teclado.nextInt();
		//mostramos por pantalla y recojemos un numero por teclado
		System.out.println("Dame otro número");
		numero2 = teclado.nextInt();
		//Mientras numero1<=numero2 hacer
		for(i=numero1; i<=numero2;i++) 
		{
			//Si i modulo2 da 0 hacer
			if (i%2==0)
			{
			System.out.println("El resultado es "+ (i));
			}
		}
		//cerramos teclado
		teclado.close();
		System.out.println("Fin del programa");
	}
}
