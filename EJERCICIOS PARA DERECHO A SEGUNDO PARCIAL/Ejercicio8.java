public class Ejercicio8 {
    public static void main(String[] args) {
    
        double monto = 0;
        
        for(int i = 1; i <= 12; i++) {
            //El interes solo se aplica al dinero que estuvo en el mes, por ende no se le aplica al que apenas se entra
            monto += (monto * 0.09);
            monto += 500;
        }
        
        System.out.println("El monto final es de: " + monto);
    
    }
}

