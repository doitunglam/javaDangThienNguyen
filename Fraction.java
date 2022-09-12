public class Fraction {
    private int numer = 0;
    private int denom = 1;

    public Fraction(){
        numer = 0;
        denom = 1;
    }

    public Fraction(int x, int y) {
        this.numer = x;
        this.denom = y;
    }

    public Fraction(Fraction f) {
        this.numer = f.numer;
        this.denom = f.denom;
    }

    @Override
    public String toString() {
        return this.numer + "/" + this.denom;
    }

    @Override
    public boolean equals(Object f) {
        if (f instanceof Fraction) {

            Fraction fg = (Fraction) f;
            return fg.numer * denom == fg.denom * numer;
        }

        return false;
    }
}
