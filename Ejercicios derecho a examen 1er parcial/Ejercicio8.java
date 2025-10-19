import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        System.out.println("=====Calcular Beneficio=====");
        System.out.print("Ingresa el capital a invertir: ");
        double capital = input.nextDouble();
        
        double capitalFinal = capital + (capital * 0.02);
        
        System.out.println("Su ganancia sera de. " + (capital * 0.02));
        System.out.println("Con un capital final de: " + capitalFinal);
        
        input.close();
    
    }
}
