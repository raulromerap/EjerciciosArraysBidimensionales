package ejerciciosbidi;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		// Se crea un objeto Scanner a partir de llamar a la funcion Scanner
		Scanner sc = new Scanner(System.in);

		// Se crea una variable para la tabla bidimensional y se les da el valor de la
		// cantidad de alumnos y la cantidad de asignaturas
		int tabla[][] = new int[4][5];

		// Se crea una variable para las notas
		int nota;

		// Se crea una variable que servirá de contador para saber a que alumno estamos
		// añadiendo la nota
		int cont = 1;

		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 5; j++) {

				do {
				// Se imprime por pantalla un mensaje al usuario para que inserte la nota de los
				// alumnos
				System.out.print("Inserte la nota de Alumno " + cont + " : ");
				// Se escanea el numero entero que ha insertado el usuario
				nota = sc.nextInt();
				}while(nota<0||nota>10);

				tabla[i][j] = nota;

			}
			
			cont++;
		}
		
		System.out.println();
		cont = 1;
		
		for(int fila[] : tabla) {
			System.out.print("Alumno " + cont + "\t");
			for(int valor : fila) {
				System.out.print(valor + "\t");
			}
			System.out.println();
			cont++;
		}

		
		sc.close();
	}

}
