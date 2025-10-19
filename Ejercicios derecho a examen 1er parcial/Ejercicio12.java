import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("=====Calcular salario=====");
        System.out.println("Categoria 1 [20,000$]");
        System.out.println("Categoria 2 [15.000$]");
        System.out.println("Categoria 3 [10,000$]");
        System.out.println("Categoria 4 [7,500$]");
        System.out.print("Ingrese la categoria a la que pertenece el empleado: ");
        int categoria = input.nextInt();
        System.out.print("Ingrese cuantas horas trabajo en el mes: ");
        int horas = input.nextInt();
        double salario = 0;
        
        switch(categoria) {
            case 1: 
                salario = horas * 20000.0;
                break;
            case 2:
                salario = horas * 15000.0;
                break;
            case 3:
                salario = horas * 10000.0;
                break;
            case 4:
                salario = horas * 7500.0;
                break;
            default:
                System.out.println("Error, esa opción no existe");
                return;
        }
        
        if(salario < 1000000) salario = salario + (salario * 0.15);
        
        salario = salario - (salario * 0.072);
        
        System.out.println("El salario a pagar al trabajador es de: " + salario + "$");
        
        input.close();
        
        
    }
}
