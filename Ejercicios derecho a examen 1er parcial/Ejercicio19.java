import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("=====Presupuesto=====");
        System.out.print("Ingrese el presupuesto anual para el hospital: ");
        double presupuesto= input.nextDouble();
        
        double ginecologia = presupuesto * 0.40;
        double traumatologia = presupuesto * 0.30;
        double pediatria = presupuesto * 0.30;
        
        System.out.println("El presupuesto anual del hospital es: $" + presupuesto);
        System.out.println("El area de ginecologia recibira: $" + ginecologia);
        System.out.println("El area de traumatologia recibira: $" + traumatologia);
        System.out.println("El area de pediatria recibira: $" + pediatria);
        
        input.close();
    
    }
}
