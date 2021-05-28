package interpreter.ejercicio.ghenkinsTranslate;

public class TerminalExpressionComo extends AbstractExpression {

    public TerminalExpressionComo(int userStory)
    {
        this.userStory=userStory;
    }

    @Override
    public void interpreter(ContextGhenkinsTranslate context) {
        if (context.input.contains("Como")){
            context.output= context.output+ "Given";
            context.input= context.input.substring(4);
        }
    }
}
