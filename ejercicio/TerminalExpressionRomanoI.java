package interpreter.ejercicio;

public class TerminalExpressionRomanoI extends AbstractExpression{
    @Override
    public void interpreter(ContextOperacionRomanos context) {
        for(int i = 0 ; i < Integer.parseInt(context.input.substring(0, 1)); i++) {
            context.output = context.output + "I";
        }
        context.output = context.output + " ";
        context.input = context.input.substring(1);
    }
}
