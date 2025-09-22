package StudentKalender;

public class Fag {
    private String dage;
    private String farve;
    public Fag[] fag;

    public void StudentFag(String dage, String farve) {
        this.dage = dage;
        this.farve = farve;
    }

    public Fag(String dage, String farve) {
        fag = new Fag [2];

        fag[0] = new Fag("it", "Blå");
        fag[1]= new Fag ("ProjectManagment", "Rød");
        fag[2] = new Fag ("Weekend", "Gul");

    }

}
