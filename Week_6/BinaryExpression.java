public class BinaryExpression extends Expression {
    protected Expression left;
    protected Expression right;

    public void setLeft(Expression left){
        this.left = left;
    }
    public Expression getLeft(){
        return this.left;
    }
    public void setRight(Expression right){
        this.right = right;
    }
    public Expression getRight(){
        return this.right;
    }

    public BinaryExpression(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }
    @Override
    public double evaluate() {
        return 0;
    }

    @Override
    public String toString() {
        return null;
    }
}
