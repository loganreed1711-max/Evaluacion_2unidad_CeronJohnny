public class Ejercicio5 {

    public static int sumaPares(int n) {
        if (n < 2) return 0;
        if (n % 2 != 0) n--;
        return n + sumaPares(n - 2);
    }

    public static boolean esCapicua(char[] palabra, int inicio, int fin) {
        if (inicio >= fin) return true;
        if (palabra[inicio] != palabra[fin]) return false;
        return esCapicua(palabra, inicio + 1, fin - 1);
    }

    public static void main(String[] args) {
        System.out.println(sumaPares(10));
        System.out.println(sumaPares(7));

        char[] palabra = {'1', '2', '3', '2', '1'};
        System.out.println(esCapicua(palabra, 0, palabra.length - 1));
    }
}
