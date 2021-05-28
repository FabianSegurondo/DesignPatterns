package interpreter.ejercicio.ghenkinsTranslate;

public class TerminalExpressionPara extends AbstractExpression {

    public TerminalExpressionPara(int userStory)
    {
        this.userStory=userStory;
    }

    @Override
    public void interpreter(ContextGhenkinsTranslate context) {
        if (context.input.contains("Para")){
            context.output= context.output+ "Then";
            context.input= context.input.substring(4);
        }
    }
}
