public class Odrelinje {

    private Vare vare;
    private int antal;

    public Odrelinje(Vare vare, int antal) {
        this.vare = vare;
        this.antal = antal;
    }

    public static int Odrelinje1(Vare vare, int antal) {
        return vare.getPris() * antal;
    }

    @Override
    public String toString() {
        return "Odrelinje{" +
                "vare=" + vare +
                ", antal=" + antal +
                '}';
    }
}
