public class Vare {

    public String navn;
    public int pris;

    public Vare(String navn, int pris) {
        this.navn = navn;
        this.pris = pris;
    }

    public int getPris() {
        return pris;
    }

    public String getNavn() {
        return navn;
    }

    @Override
    public String toString() {
        return "Vare{" +
                "navn='" + navn + '\'' +
                ", pris=" + pris +
                '}';
    }

}
