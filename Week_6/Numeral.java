public class Numeral extends Expression{
    private int value;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Numeral() {

    }

    public Numeral(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.getValue() + " ";
    }

    @Override
    public double evaluate() {
        return this.getValue();
    }
}