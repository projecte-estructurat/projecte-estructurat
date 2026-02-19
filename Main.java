public class Main {
    public static void main(String[] args) {
        int suma = 0;
        
        for (int i = 2; i <= 100; i++) {
            boolean primo = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    primo = false;
                }
            }
            if (primo) {
                suma += i;
            }
        }
        System.out.println("Suma primers del 1 al 100: " + suma);
    }
}
