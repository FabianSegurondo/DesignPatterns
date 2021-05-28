package interpreter.ejercicio.ghenkinsTranslate;

public class TerminalExpressionNoWord  extends AbstractExpression {

    public TerminalExpressionNoWord(int userStory)
    {
        this.userStory=userStory;
    }

    @Override
    public void interpreter(ContextGhenkinsTranslate context) {
            String textoSinCambioUserStory = context.input;
            context.output= context.output.concat(textoSinCambioUserStory.substring(0, this.userStory));
            context.input= context.input.substring(this.userStory);

    }
}
