import java.util.Scanner;
import java.lang.Math;
public class Longitud
{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		double radius, lon;

		System.out.println("-- Calculando la longitud de una circunferencia --\r\n");
		System.out.println("-- Ingresa el valor del radio:  --\r\n");

		radius = in.nextDouble();
		lon    = Math.round((radius * 2) * 3.1415);

		System.out.println("-- La longitud de la circunferencia cuyo radio es: " + radius + " es igual a: " + lon + "  --\r\n");		

	}
}