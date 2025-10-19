import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("=====Calcular costo de llamada=====");
        System.out.print("¿Cuantos minutos duro la llamada: ");
        int minutos = input.nextInt();
        
        double costo;
        if(minutos <= 3) costo = 10;
        else costo = 10 + (minutos - 3);
        
        System.out.println("El costo de la llamada es de: $" + costo);
        
        input.close();
            
        
    
    }
}
