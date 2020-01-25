import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arvontakone {

    List<Integer> numerot = new ArrayList<>();
    List<Integer> arvotut = new ArrayList<>();

    public Arvontakone() {

    }

    public void lisaaNumerot() { //lisää "pallot" koneeseen, tässä tapauksessa 40kpl
        int i = 1;
        while (i <= 40) {
            numerot.add(i);
            i++;
        }
    }

    public void nostaSeitsemanNumeroa() {
        int i = 1;
        while (i <= 7) {                    //otetaan 7 numeroa "pallokoneesta"
            Collections.shuffle(numerot);
            arvotut.add(numerot.get(0));    //sekoitetaan numerolista joka iteraatiolla ja napataan indeksissä 0 oleva numero
            numerot.remove(0);        //poistetaan valittu numero listalta, jotta se ei tule uudelleen valittuihin
            i++;
        }
    }

    public void reset(){                    //Toiminta käyttöliittymään, putsataan numerot koneista ennen uutta arvontaa
        numerot.clear();
        arvotut.clear();
    }


    public String printArvotut() {
        String arvonta = "";
        String paanumerot = "";

        Collections.sort(arvotut);               //arvottujen numerojen siistintä -> järjestykseen
        int i = 0;
        while (i <= 5) {                         //otetaan 6 ekaa numeroa
            paanumerot += arvotut.get(i) + ", "; //lisätään stringiin pilkulla erotettuna
            i++;
        }

        paanumerot += arvotut.get(6);           //ja viimeinen numero stringiin ilman pilkkua

        arvonta = paanumerot;
        return arvonta;                         //palauta arvotut
    }

}
