import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("========Mayor de tres numeros=======");
        System.out.print("Ingresa el primer numero: ");
        int num1 = input.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        int num2 = input.nextInt();
        System.out.print("Ingresa el tercer numero: ");
        int num3 = input.nextInt();
        
        double promedio = (num1 + num2 + num3) / 3.0;
        
        
	
    	if(num1 == num2 && num2 == num3) {
	        System.out.println("Los tres numeros son iguales");
    	} else {
    	    int mayor = num1, menor = num1;
	    
	        if(num2 > mayor) mayor = num2;
    	    else if(num3 > mayor) mayor = num3;
	    
    	    if(num2 < menor) menor = num2;
    	    else if(num3 < menor) menor = num3;
	    
	        System.out.println("El numero mayor es: " + mayor);
    	    System.out.println("El numero menor es: " + menor);
	    
    	}
	
    	System.out.println("El promedio de los tres numeros es: " + promedio);
	
    	input.close();
	
	
        
        
    
    }
}

