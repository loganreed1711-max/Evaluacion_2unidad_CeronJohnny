public class Ejercicio2 {
    static int pot(int b, int e) { 
        if (e == 0) 
        return 1; 
        return b * pot(b, e - 1); 
    }
    public static void main(String[]args){
        System.out.println(pot(3, 4));
   


    }

    
}
// Respuesta: 81