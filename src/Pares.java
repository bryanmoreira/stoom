public class Pares {
    public static void imprimirPares(int n) {
        System.out.println("Números pares de 1 até " + n + ":");

        for (int i = 1; i <= n ; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
