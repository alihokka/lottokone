import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner skanneri = new Scanner(System.in);
        Arvontakone arvontakone = new Arvontakone();
        Kayttoliittyma kayttoliittyma = new Kayttoliittyma(skanneri, arvontakone);

        kayttoliittyma.kaynnista();
    }
}
