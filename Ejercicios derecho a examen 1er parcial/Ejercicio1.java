import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        double metros, pies, pulgadas;
        Scanner input = new Scanner(System.in);
        System.out.println("====Convertidor de medidas====");
        System.out.print("Ingresa una cantidad de metros: ");
        metros = input.nextDouble();
        
        pulgadas = metros * 39.37;
        pies = metros * 3.28084;
        
        System.out.println(metros + " metros son: " + pulgadas + " pulgadas");
        System.out.println(metros + " metros son: " + pies + " pies");
    
    }
}
