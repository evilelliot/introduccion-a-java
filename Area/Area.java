import java.util.Scanner;
import java.lang.Math;

public class Area
{
	// Calculando el area de un circulo.
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		double r, aux, a;

		System.out.println("-- Calculadora de area de un circulo --\r\n");
		System.out.println("-- Ingrese el valor del radio: \r\n");

		r = in.nextDouble();

		a = 3.1415 * r;

		System.out.println("area = " + a);

	}
}