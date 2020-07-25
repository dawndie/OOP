/**
 * Created by CCNE on 25/07/2020.
 */
public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator){
        if (denominator == 0) {
            denominator = 1;
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }
    public Fraction add(Fraction other) {
        this.numerator = this.numerator * other.denominator;
        other.numerator = other.numerator * this.denominator;
        this.denominator = this.denominator * other.denominator;
        this.numerator += other.numerator;
        return this;
    }

    // subtract
    public Fraction subtract(Fraction other) {
        this.numerator = this.numerator * other.denominator;
        other.numerator = other.numerator * this.denominator;
        this.denominator = this.denominator * other.denominator;
        this.numerator -= other.numerator;
        return this;
    }

    // multiple
    public Fraction multiple(Fraction other) {
        this.numerator = this.numerator * other.numerator;
        this.denominator = this.denominator * other.denominator;
        return this;
    }

    // divide
    public Fraction divide(Fraction other) {
        this.numerator = this.numerator * other.denominator;
        this.denominator = this.denominator * other.numerator;
        return this;
    }

    /**
     * compare this with other, notice that param is Object type
     */
    public boolean equals(Object obj) {
        if(obj instanceof Fraction) {
            if(this.subtract((Fraction) obj).getNumerator() == 0) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
}

