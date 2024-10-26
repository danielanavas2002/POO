public class EjemploExcepciones {
    public static void main(String[] args) {
        try {
            int resultado = dividir(10, 0);

            System.out.println("Resultado: " + resultado);

            
        } catch (ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
            
        } finally{
            System.out.println("Bloque Finally: Liberando Espacio");
        }

        System.out.println("Programa continua...");
        
    }

    public static int dividir(int dividiendo, int divisor){
        if (divisor == 0){
            throw new ArithmeticException("No se puede divir entre 0");
        }
        return dividiendo/divisor;
    }
    
}
