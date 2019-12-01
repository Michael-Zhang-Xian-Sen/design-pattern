package InterpreterPattern;


import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        ArrayList<AbstractExpression> abstractExpressions = new ArrayList<AbstractExpression>();
        abstractExpressions.add(new TerminalExpression());
        abstractExpressions.add(new TerminalExpression());
        abstractExpressions.add(new NonterminalExpression());
        abstractExpressions.add(new TerminalExpression());

        for(AbstractExpression abstractExpression:abstractExpressions){
            abstractExpression.Interpret(context);
        }
    }
}
