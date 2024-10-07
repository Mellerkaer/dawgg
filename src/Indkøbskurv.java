import java.util.ArrayList;
import java.util.List;

public class Indkøbskurv {

    static private List<Vare> kurv = new ArrayList<>();

    public static Vare addVare(String vare, int pris) {
        Vare varer = new Vare(vare, pris);
        kurv.add(varer);
        return varer;
    }

}
