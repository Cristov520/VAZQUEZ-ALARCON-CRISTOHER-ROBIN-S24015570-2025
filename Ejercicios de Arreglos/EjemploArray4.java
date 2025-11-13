import java.util.Scanner;

public class EjemploArray4 {
    public static void main(String[] args) {
    
      Scanner input = new Scanner(System.in);
    	int array[] = new int[10];
    	
    	for(int i = 0; i < array.length; i++) {
    	    System.out.print("Ingresa un numero para [" + i + "]: ");
    	    array[i] = input.nextInt();
    	}
    	
    	for(int i = 0; i < array.length; i++) {
    	    System.out.print(array[i] + " ");
    	}
    	
    	input.close();
    
    }
}
