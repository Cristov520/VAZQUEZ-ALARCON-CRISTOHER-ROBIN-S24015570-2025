import java.util.Scanner;
public class ArrayMesesDias {
    public static void main(String[] args) {
    
    	Scanner input = new Scanner(System.in);
    	String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    	int dias[] = new int[12];
    	
    	for(int i = 0; i < dias.length; i++) {
    	    
    	    System.out.print("Ingresa los dias del mes de " + meses[i] + ": ");
    	    dias[i] = input.nextInt();
    	
    	}
    	
    	for(int i = 0; i < dias.length; i++) {
    	    System.out.println(meses[i] + " tiene " + dias[i] + " dias");
    	}
    	
    	input.close();
    
    }
}
