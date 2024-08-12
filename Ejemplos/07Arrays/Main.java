class Main {
    public static void main(String[] args) {
        int[] notas = new int[10];

        notas[0] = 100;
        notas[1] = 90;

        char[] codes = new char[10];

        codes[0] = 'A';
        codes[1] = 'B';
        
        //Recorrer un Array

        // 1. ciclo for 
        for (int i = 0; i < notas.length; i++){
            System.out.println(notas[i]);
        }

        // 2. for each
        for(int nota: notas){
            System.out.println(nota);
        }

        for(char code: codes){
            System.out.println(code);
        }

    }

    

    
}
