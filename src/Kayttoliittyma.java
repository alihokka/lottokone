import java.util.Scanner;

public class Kayttoliittyma {
    Arvontakone arvontakone;
    Scanner scanner;

    public Kayttoliittyma(Scanner scanner, Arvontakone arvontakone) {
        this.scanner = scanner;
        this.arvontakone = arvontakone;
    }

    public void kaynnista() {

        System.out.print("Montako riviä arvotaan? ");

        int maara = Integer.valueOf(scanner.nextLine());                //pyydetään käyttäjältä monta lottoriviä tulostetaan

        if (maara < 1) {
            System.out.println("Tehdään vähintään 1 rivi, kiitos!");    //jos alle 1 rivi -> virheilmoitus
        }

        int i = 1;

        while (i <= maara) {                                            //suoritetaan arvonta käyttäjän määrittämän arvon verran
            arvontakone.lisaaNumerot();
            arvontakone.nostaSeitsemanNumeroa();
            System.out.println(i + "  ||  " + arvontakone.printArvotut()); //tulostus käyttäjälle
            arvontakone.reset();
            i++;
        }
    }
}

