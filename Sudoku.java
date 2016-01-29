import java.util.*;

/**
 * Created by lii5a on 28/01/16.
 * /**
 * Prindi konsooli 27x27 maatriks, kus on täidetud eesti tähestiku sudoku.
 * https://et.wikipedia.org/wiki/Eesti_t%C3%A4hestik
 */

public class Sudoku {
    public static void main(String[] args) {
        kolmsudokurida();

    }

    private static ArrayList lootahestik() {
        ArrayList<String> tahed = new ArrayList<>(Arrays.asList("Aa", "Bb", "Dd", "Ee", "Ff", "Gg", "Hh", "Ii", "Jj", "Kk", "Ll", "Mm", "Nn", "Oo", "Pp", "Rr", "Ss", "Šš", "Zz", "Žž", "Tt", "Uu", "Vv", "Õõ", "Ää", "Öö", "Üü"));
        return tahed;
    }

    private static void kolmsudokurida() {


        for (int i = 0; i < lootahestik().size(); i++) { //27 korda. niimitu rida tuleb.

            for (int j = 0; j<27; j++) { //27 korda. niimitu tähte igasse ritta.
                int suva = (int)(Math.random()*lootahestik().size()); //ütle üks number, 0-27
                Object taht = lootahestik().get(suva); //salvesta sellel suval positsioonil olnud rida element stringi taht
                System.out.print(taht + " "); //prindi täht välja
                lootahestik().remove(suva); //eemalda reast seesama suva element.
                lootahestik().trimToSize();
            }
            System.out.println();

        }
    }


}
