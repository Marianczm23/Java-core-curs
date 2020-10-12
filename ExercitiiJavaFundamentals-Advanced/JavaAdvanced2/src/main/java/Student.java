public class Student extends Person implements Examinator{

    private int notaFizica;
    private int notaInfo;
    private int notaMate;
    private boolean admisPoli;

    public Student(String firstName, String lastName, int notaInfo, int notaFizica, int notaMate) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.notaInfo = notaInfo;
        this.notaFizica = notaFizica;
        this.notaMate = notaMate;
    }

    public Student() {

    }

    public int getNotaFizica() {
        return notaFizica;
    }

    public int getNotaInfo() {
        return notaInfo;
    }

    public int getNotaMate() {
        return notaMate;
    }

    public boolean isAdmisPoli() {
        return admisPoli;
    }
    public void computeAverage() throws BadGradesException {
        int medie = (this.notaFizica + this.notaMate + this.notaInfo) / 3;
        if (medie < 6) {
            throw new BadGradesException("Studentul este repetent");

        } else if (medie > 6 && medie < 9) {
            this.admisPoli = false;
        } else {
            this.admisPoli = true;
        }
    }
}
