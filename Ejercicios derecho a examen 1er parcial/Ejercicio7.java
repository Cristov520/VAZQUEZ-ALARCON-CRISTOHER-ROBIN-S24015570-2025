import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        System.out.println("=====Descuento de compra=====");
        System.out.print("Ingrese el monto de la compra: ");
        double monto = input.nextDouble();
        
        double montoFinal = monto - (monto * 0.15);
        
        System.out.println("El monto inicial es: " + monto + "$");
        System.out.println("El monto final con el descuento aplicado es de: " + montoFinal + "$");
        
        input.close();
    
    }
}
