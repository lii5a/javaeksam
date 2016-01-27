package src;

import java.util.ArrayList;

/**
 * Created by lii5a on 26/01/16.
 */
public class Kassa {

    private String kaup;
    private String kassaneiu;
    private ArrayList<String> kaubad = new ArrayList<>();

    public Kassa(String kassapidaja) {

    }

    public void lisaToode(String toode) {
        kaubad.add(kaup);
    }

    public void eemaldaToode(String toode) {
        kaubad.remove(kaup);
    }

    public String votaTooted() {
        return null;
    }

    public String votaToodeteArv() {
        return null;
    }

    public String votaKassapidajaNimi() {
        return null;
    }


    public void kliendilPoleRaha() {
    }
}
