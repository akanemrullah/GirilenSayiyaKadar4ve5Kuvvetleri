import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Degisken tanimlandi.
        int k = 0;

        // Scanner sinifina ait nesne tanimlandi.
        Scanner input = new Scanner(System.in);

        // Kullanicidan veri alinip bu veri degiskene atandi.
        System.out.print("Sayi gir: ");
        k = input.nextInt();

        // 4 un kuvvetlerini ekrana yansitan dongu kodlandi.
        for (int i = 1; i<=k; i*=4){
            System.out.println(i);
        }

        // 5 in kuvvetlerini ekrana yansitan dongu kodlandi.
        for (int i = 1; i<=k; i*=5){
            System.out.println(i);
        }

    }
}