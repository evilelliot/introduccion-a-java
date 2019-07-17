import java.util.Scanner;
public class Comparacion
{
	// Compara dos números y mostrar cual es el mas grande.
	public static void main(String args[]){
		// Asignar escaner.
		Scanner in = new Scanner(System.in);
		// Asignar variables.
		float a, b;

		// Mostrar un mensaje al usuario.
		System.out.println("-- Comparando numeros --\r\n");

		// Leer los valores de los numeros.
		System.out.println("Ingrese el primer numero: \r\n");		
		a = in.nextFloat();

		System.out.println("Ingrese el segundo numero: \r\n");		
		b = in.nextFloat();

		// Comparar los valores.
		if(a > b)
		{
			System.out.println(a + " es mayor a "+ b + "\r\n");		
		}
		else
		{
			System.out.println(b + " es mayor a "+ a + "\r\n");		
		}
	}
}