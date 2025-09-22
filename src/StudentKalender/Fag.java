package StudentKalender;

public class Fag {
    public Fag[] fag;

    public Fag(String navn, String farve) {
        fag = new Fag [2];

        fag[0] = new Fag("it", "Blå");
        fag[1]= new Fag ("ProjectManagment", "Rød");
        fag[2] = new Fag ("Weekend", "Gul");

    }

}
