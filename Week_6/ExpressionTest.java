public class ExpressionTest extends Expression {
    @Override
    public String toString() {
        return "((((10) ^ 2 + -3) + (4 * 3))) ^ 2";
    }

    @Override
    public double evaluate() {
        return (10^2 - 3 + 4*3)^2;
    }


}