import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * if, while, int[]
 * Sulle antakse ette mitu gruppi tudengite hindeid. Kuna maksimum hinne on
 * tegelikult 60 punkti, pead esiteks kõik suuremad arvud 60 peale ümardama.
 * Teiseks leia mitu tudengit said alla mediaani?
 */
public class Algoritm {

    // Main klass on ainult sulle endale testimiseks
    public static void main(String[] args) {

        System.out.println(allaMediaani(new int[]{19, 45, 55, 67, 89}));
        System.out.println(allaMediaani(new int[]{55, 23, 88, 56, 43, 90, 34}));
        System.out.println(allaMediaani(new int[]{21, 85, 45}));

    }

    // Siia meetodi sisse kirjuta lahendus.
    private static int allaMediaani(int[] ints) {
        ArrayList<Integer> hinded = new ArrayList(ints.length);

        for (int i = 0; i < ints.length; i++) {
            hinded.add(ints[i]);    // esiteks lisan kõik  intsi väärtused minu arraylisti.
        }

        for (int i = 0; i < hinded.size(); i++) { //sätin suuremad kuuekümneks

            if (hinded.get(i)>60){
                hinded.set(i,60);
            }

        }

        Collections.sort(hinded); //sordin järjekorda - väiksemast suuremaks

        System.out.print("sorditud jada on ");


        for (int x:hinded) {
            System.out.print(x + " ");
        }



        int mediaan = hinded.size()/2;

        System.out.println("mediaan on "+ hinded.get(mediaan));




        int mitutykki=0;

        for(int x:hinded){
            if (x<hinded.get(mediaan)){
                mitutykki = mitutykki +1;
            }
        }
        System.out.println("alla mediaani on" + mitutykki);

        return mitutykki;
    }
}
