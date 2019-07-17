import java.util.Scanner;
public class Negativos
{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		double num;

		System.out.println("-- Revisar si un numero es negativo --\r\n");
		System.out.println("-- Ingresa un numero para revisar: \r\n");

		num = in.nextDouble();

		if(num < 0)
		{
			System.out.println(num + " es negativo\r\n");
		}
		else
		{
			System.out.println(num + " es positivo\r\n");
		}
	}
}