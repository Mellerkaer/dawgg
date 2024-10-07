public class Main {

    public static void main(String[] args) {

        Vare mælk = new Vare("mælk", 13);
        Vare æg = new Vare("æg", 30);
        Vare shuffi = new Vare("shuffi", 700);

//        Odrelinje odre1 = new Odrelinje(mælk, 2);
//        Odrelinje odre2 = new Odrelinje(æg, 5);
//        Odrelinje odre3 = new Odrelinje(shuffi, 3);

        Indkøbskurv kurv = new Indkøbskurv();
        kurv.addVare(String.valueOf(mælk),2);
        kurv.addVare(String.valueOf(æg),5);
        kurv.addVare(String.valueOf(shuffi),3);

        System.out.println("Din indkøbskurv består af: " + kurv);


//        System.out.println(Indkøbskurv.addVare("mælk", 2));
//
//        System.out.println(Odrelinje.Odrelinje1(mælk, 5));
//        System.out.println(Odrelinje.Odrelinje1(æg, 4));
//        System.out.println();

    }
}
