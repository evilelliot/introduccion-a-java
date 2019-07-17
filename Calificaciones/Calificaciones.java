import java.util.Scanner;
import java.lang.Math;

public class Calificaciones
{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		int aux;
		double total = 0;
		double[] notas = new double[10];
		String  alumno = "";
		String[] materias = {"Lenguas", "Calculo", "Fisica 3", "Lenguaje C", "Finanzas", "Servidores", "Sistemas operativos", "Etica profesional", "Electronica 3", "Matematicas aplicadas"};

		System.out.println("-- Calculadora de promedios escolares --\r\n");
		System.out.println("-- Escribe el nombre del alumno: \r\n");

		alumno = in.nextLine();

		System.out.println("-- A continuacion ingresará las calificaciones de cada materia: --\r\n");
		for(int i = 0; i <= 10; i++) {
			aux = i + 1;
			if(i == 10)
			{
				break;
			}
			else
			{
				System.out.println("-- " + materias[i] + ": \r\n");			
				notas[i] = in.nextDouble();	
				if(notas[i] > 10)
				{
					System.out.println("-- La calificacion no puede ser mayor a 10, ingrese un valor entre 0-10 --\r\n");			
					notas[i] = in.nextDouble();	
				}
			}
		}

		System.out.println("-- Calculando el promedio... \r\n");
		for(int i = 0; i <= 10; i++) {
			aux = i + 1;
			if(i == 10)
			{
				break;
			}
			else
			{
				total += notas[i];	
			}
		}
		System.out.println("-- Alumno: " + alumno + " \r\n");
		System.out.println("-- Calificacion total: " + total + " \r\n");
		System.out.println("-- Promedio: " + total / 10 + " \r\n");
	}
}