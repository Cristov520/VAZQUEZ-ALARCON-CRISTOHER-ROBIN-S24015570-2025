import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("=====Descuento de tienda====");
        System.out.println("Ingrese el monto de la compra: ");
        double monto = input.nextDouble();
        System.out.println("Ingrese un numero: ");
        int num = input.nextInt();
        
        double descuento;
        if(num < 74) {
            System.out.println("Felicidades, obtuvo un descuento del 15%!!!");
            descuento = monto * 0.15;
        } else {
           System.out.println("Felicidades, obtuvo un descuento del 20%!!!");
           descuento = monto * 0.20;
        }
        
        monto -= descuento;
        
        System.out.println("El descuento es de: $" + descuento);
        System.out.println("El monto con el descuento aplicado es de: $" + monto);
        
        input.close();
        
    }
}
