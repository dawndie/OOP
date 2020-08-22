public class Square extends Expression{
    private Expression expression;

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public Square(Expression expression){
        this.expression =  expression;
    }

    @Override
    public String toString() {
        return  expression + " ^ 2";
    }

    @Override
    public double evaluate() {
        return this.getExpression().evaluate()*this.getExpression().evaluate();
    }
}