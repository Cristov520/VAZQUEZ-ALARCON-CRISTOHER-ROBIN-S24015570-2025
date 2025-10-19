import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        System.out.println("=====Calcular promedio=====");
        System.out.println("Ingresa cuantos hombres hay en el salón: ");
        int hombres = input.nextInt();
        System.out.println("Ingresas cuantas mujeres hay en el salón");
        int mujeres = input.nextInt();
        
        int canTotal = hombres + mujeres;
        
        double promedioH = (hombres * 100.0) / canTotal;
        double promedioM = (mujeres * 100.0) / canTotal;
        
        System.out.println("Cantidad de personas en el salón: " + canTotal);
        System.out.println("Porcentaje de hombres: " + promedioH + "%");
        System.out.println("porcentaje de mujeres: " + promedioM + "%");
    
    }
}
