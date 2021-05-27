package interpreter.ejercicio;

public class TerminalExpressionRomanoV extends AbstractExpression {
    @Override
    public void interpreter(ContextOperacionRomanos context) {
        int digit = Integer.parseInt(context.input.substring(0, 1));
        if(digit == 4){
            context.output = context.output +"IV";
        } else if (digit == 5){
            context.output = context.output + "V";
        } else {
            context.output = context.output + "V";
            for(int i = 0 ; i < (digit - 5); i++) {
                context.output = context.output + "I";
            }
        }
        context.output = context.output + " ";
        context.input = context.input.substring(1);
    }
}
