package bo.zhao.action.interpreter;

/**
 * @author Bo.Zhao
 * @since 19/6/12
 */
public class PlusExpression extends Expression {

    private Expression leftExpression;
    private Expression rightExpression;

    public PlusExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret() {
        return leftExpression.interpret() + rightExpression.interpret();
    }

    @Override
    public String toString() {
        return "+";
    }
}
