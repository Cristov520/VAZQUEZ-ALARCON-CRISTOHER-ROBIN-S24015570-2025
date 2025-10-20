import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        double radio, area;
        final double PI = 3.1416;
        Scanner input = new Scanner(System.in);
        System.out.println("=====Calcular area del un circulo=====");
        System.out.print("Ingresa un valor para el radio: ");
        radio = input.nextDouble();
        area = PI * (radio * radio);
        
        System.out.println("El area del circulo es: " + area);
        
        input.close();
        
    
    }
}
