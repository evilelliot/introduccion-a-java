import java.util.Scanner;

public class Iguales
{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		double a, b;

		System.out.println("-- Compara dos numeros para revisar si son iguales--\r\n");

		System.out.println("-- Ingresa el primer numero: \r\n");
		a = in.nextDouble();

		System.out.println("-- Ingresa el segundo numero: \r\n");
		b = in.nextDouble();

		if(a == b)
		{
			System.out.println(a + " es igual a: " + b +  "\r\n");
		}
		else
		{
			System.out.println(a + " no es igual a: " + b +  "\r\n");
		}
	}
}