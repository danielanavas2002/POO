import java.util.Scanner;

class Main{
    public static void main(String[] args){
        int cuenta = 6;

        if (cuenta < 8){
            System.out.println("La cuenta es menor a 8");
        }
            
        else{
            System.out.println("La cuenta es menor a 8");
            cuenta = 0;
        }
            

        System.out.println("Cuenta: " + cuenta);

        int numero = 90;
        String mensaje = "";

        mensaje = numero > 100 ? "Mayor" : "Menor";

        // ES EQUIVALENTE:
        //if (numero > 100){
        //    mensaje = "Mayor";
        //}
        //else {
        //    mensaje = "Menor";
        //}

        System.out.println("Mensaje: " + mensaje);

        Scanner sc = new Scanner(System.in);

        String nombre = sc.nextLine();

        

        if (nombre.equals( "Erick")){ //Para comparar Strings PREFERIBLE .equals
            System.out.println("Hola Profe");
        }

        else {
            System.out.println("Hola " + nombre);
        }

        sc.close();

    }

}
