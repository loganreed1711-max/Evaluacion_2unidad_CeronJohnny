//Explica por qué a no cambia y v[1] sí.
public class Ejercicio3 {
    static void m(int a, int[] v) { 
        a++; v[1] += a; 
    }
public static void main (String []args){
    int a = 5;
    int [] v= {1,2,3};// Arreglo inicial.
    m(a, v);
    System.out.println(a+" " + v[1]);




} 
// int a = 5; 
// int[] v = {1, 2, 3};
//  m(a, v); 
// System.out.println(a + " " + v[1]);

//Imprime: 5  8
//Explicacion: a no cambia por que se le asiga un valor y []v cambia por el arreglo que le damos al inicio.
}
