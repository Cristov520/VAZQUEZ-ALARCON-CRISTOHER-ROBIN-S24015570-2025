import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        double ventas[] = new double[7];
        double ventaTotal = 0, mayorVenta = 0;
        int dia = 0;
        
        for(int i = 0; i < ventas.length; i++) {
            System.out.print("Ingresa la venta del dia " + (i + 1) + ": ");
            ventas[i] = input.nextDouble();
            ventaTotal += ventas[i];
            if(ventas[i] > mayorVenta) {
                mayorVenta = ventas[i];
                dia = (i + 1);
                
            }
        }
        
        System.out.println("Las ventas totales fueron de: " + ventaTotal + " MXN");
        System.out.println("El dia con mayor venta fue el dia " + dia + " con una venta de: " + mayorVenta + " MXN");
        
        input.close();
    
    }
}

