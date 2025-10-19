import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        
        double totalComision = 0;
        double totalVentas = 0;

        System.out.println("=====Calcular comision=====");

        System.out.print("Ingrese el valor de la primera venta: ");
        double venta1 = input.nextDouble();
        double comision1 = 0;
        if(venta1 <= 10000000) comision1 = venta1 * 0.02;
        else if(venta1 > 10000000 && venta1 < 15000000) comision1 = venta1 * 0.04;
        else comision1 = venta1 * 0.10;
        
        System.out.println("Comision de esta venta: " + comision1);
        totalComision += comision1;
        totalVentas += venta1;

        System.out.print("Ingrese el valor de la segunda venta: ");
        double venta2 = input.nextDouble();
        double comision2 = 0;
        if(venta2 <= 10000000) comision2 = venta2 * 0.02;
        else if(venta2 > 10000000 && venta2 < 15000000) comision2 = venta2 * 0.04;
        else comision2 = venta2 * 0.10;
        
        System.out.println("Comision de esta venta: " + comision2);
        totalComision += comision2;
        totalVentas += venta2;

        System.out.print("Ingrese el valor de la tercera venta: ");
        double venta3 = input.nextDouble();
        double comision3 = 0;
        if(venta3 <= 10000000) comision3 = venta3 * 0.02;
        else if(venta3 > 10000000 && venta3 < 15000000) comision3 = venta3 * 0.04;
        else comision3 = venta3 * 0.10;
        
        System.out.println("Comision de esta venta: " + comision3);
        totalComision += comision3;
        totalVentas += venta3;

        System.out.print("Ingrese el valor de la cuarta venta: ");
        double venta4 = input.nextDouble();
        double comision4 = 0;
        if(venta4 <= 10000000) comision4 = venta4 * 0.02;
        else if(venta4 > 10000000 && venta4 < 15000000) comision4 = venta4 * 0.04;
        else comision4 = venta4 * 0.10;
        
        System.out.println("Comision de esta venta: " + comision4);
        totalComision += comision4;
        totalVentas += venta4;

        System.out.println("=============================================");
        System.out.println("Total de las ventas: " + totalVentas);
        System.out.println("Comision total: " + totalComision);

        input.close();
    }
}
        
        
    
  
