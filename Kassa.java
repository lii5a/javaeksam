import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created by lii5a on 26/01/16.
 */
public class Kassa {

    private String kaup;
    private String kassaneiu;
    private ArrayList<String> kraam = new ArrayList<>();

    public Kassa(String kassapidaja) {
        kassaneiu=kassapidaja;

    }

    public ArrayList lisaToode(String kaup) {
        kraam.add(kaup);
        return kraam;
    }

    public void eemaldaToode(String kaup) {
        if (kraam.contains(kaup)) {
            kraam.remove(kaup);
        }
    }

    public ArrayList votaTooted() {
       return kraam;
    }

    public int votaToodeteArv() {
        return kraam.size();
    }

    public String votaKassapidajaNimi() {
        return kassaneiu;
    }


    public void kliendilPoleRaha() {
        System.out.println("raha pole, oioi");
        kraam.clear();
        }

    }

