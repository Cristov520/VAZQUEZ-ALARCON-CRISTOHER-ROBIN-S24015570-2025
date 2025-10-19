import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
	System.out.println("======Calcular promedio======");
	System.out.println("Ingrese la primera calificación: ");
	double calf1 = input.nextDouble();
	System.out.println("Ingrese la segunda calificación: ");
	double calf2 = input.nextDouble();
	System.out.println("Ingrese la tercera calificación: ");
	double calf3 = input.nextDouble();
	
	double promedio = (calf1 + calf2 + calf3) / 3;
	
	System.out.println("Su promedio es de: " + String.format("%.2f", promedio));
	
	input.close();
	
    
    }
}
