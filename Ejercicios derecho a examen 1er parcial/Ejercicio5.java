import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("=====Convertidor de temperatura=====");
        System.out.print("Ingresa una temperatura en grados centígrados: ");
        double gCentigrados = input.nextDouble();
        
        double gFahrenheit = (gCentigrados * 9 / 5) + 32;
        double gKelvin = gCentigrados + 273.15;
        
        System.out.println(gCentigrados + "° centigrados son " + gFahrenheit + "° Fahrenheit");
        System.out.println(gCentigrados + "° centigrados son " + gKelvin + "° Kelvin");
        
        input.close();
    
    }
}
