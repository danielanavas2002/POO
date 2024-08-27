import java.util.ArrayList; 

class Main 
{
    public static void main(String[] args) 
    {
        ArrayList<String> fruits = new ArrayList<String>();
        System.out.println(fruits);
        System.out.println("Número de elemetos: " + fruits.size());
        fruits.add("Watermelon");
        fruits.add("Apple");
        fruits.add("Orange");
        System.out.println(fruits);
        System.out.println("Número de elemetos: " + fruits.size());

        // Obtener elementos
        System.out.println( fruits.get(1));

        // Recorrer Lista
        System.out.println("For each");
        for (String i : fruits) {
            System.out.println(i);
          }
        
        System.out.println("For");
        for(int i = 0; i < fruits.size(); i++){
            System.out.println(fruits.get(i));
        }

        // Quitar
        fruits.remove(1);
        System.out.println(fruits);
        System.out.println("Número de elemetos: " + fruits.size());

        boolean done = fruits.remove("Orange");
        System.out.println(done);
        System.out.println(fruits);
        System.out.println("Número de elemetos: " + fruits.size());

        // Limpiar
        fruits.clear();
        System.out.println(fruits);
        System.out.println("Número de elemetos: " + fruits.size());
    }


    
}
