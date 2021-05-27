package interpreter.ejercicio;

public class TerminalExpressionRomanoX extends AbstractExpression{
    @Override
    public void interpreter(ContextOperacionRomanos context) {
        int digit = Integer.parseInt(context.input.substring(0, 1));
        if(digit == 9){
            context.output = context.output + "IX";
        } else {
            context.input = context.input.substring(1);
            context.output = context.output + "X";
        }
        context.output = context.output + " ";
        context.input = context.input.substring(1);
    }
}
