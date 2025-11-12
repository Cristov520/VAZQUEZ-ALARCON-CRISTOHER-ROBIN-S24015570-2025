import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Ingrese la cantidad de filas para el pino: " );
	int filas = input.nextInt();

	for(int i = 1; i <= filas; i++) {
	    for(int j = 1; j <= (filas - i); j++) {

		System.out.print(" ");
	    }
	    for(int k = 1; k <= (2 * i) - 1; k++) {
		System.out.print("*");
	    }
	    System.out.println("");
	}

	input.close();

    }
}