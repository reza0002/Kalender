package StudentKalender;

public class Student {
    public String navn;
    public String farve;

    public Student(String navn, String farve) {
        this.navn = navn;
        this.farve = farve;
}
    public String[] fag;

    public Student(String skolefag) {
        fag = new String [2];

        fag[0] = skolefag;
        fag[1]= skolefag;
        fag[2] = skolefag;

    }
}
