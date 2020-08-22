public class Addition extends BinaryExpression {
    public Addition(Expression left, Expression right){
        super(left, right);
    }

    public String toString() {
        return ;
    }

    public double evaluate() {
        return ;
    }
    @Override
    public double evaluate() {
        return this.getLeft().evaluate() + this.getRight().evaluate();
    }

    public String toString() {
        return  left.toString() + " + " + right.toString() ;
    }
}