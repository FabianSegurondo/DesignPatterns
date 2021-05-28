package interpreter.ejercicio.ghenkinsTranslate;

public class TerminalExpressionQuiero extends AbstractExpression {

    public TerminalExpressionQuiero(int userStory)
    {
        this.userStory=userStory;
    }

    @Override
    public void interpreter(ContextGhenkinsTranslate context) {
        if (context.input.contains("Quiero")){
            context.output= context.output+ "When";
            context.input= context.input.substring(6);
        }
    }
}
