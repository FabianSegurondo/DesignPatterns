package interpreter.ejercicio;


import java.util.ArrayList;
import java.util.List;

public class InterpreterOperaciones  extends AbstractExpression {

    private List<AbstractExpression> parseTree = new ArrayList<>();
    private ContextOperacionRomanos context;


    public InterpreterOperaciones(String word) {
        this.interpretecion(word);

    }
    public void interpretecion(String words) {
        String input = words;
        context= new ContextOperacionRomanos(input.replace(" ",""));
        for (String word : input.split(" ")) {
            switch (word){
                case "1":
                    case "2" :
                        case "3":
                    parseTree.add(new TerminalExpressionRomanoI());
                    break;
                     case "4":
                         case "5":
                             case "6":
                                 case "7":
                                     case "8":
                    parseTree.add(new TerminalExpressionRomanoV());
                    break;
                    case "9":
                    case "10":
                    parseTree.add(new TerminalExpressionRomanoX());
                    break;
                default:
                    break;
            }

        }
    }


    public String interpretar(){
        for (AbstractExpression terminalExpresion: parseTree) {
            terminalExpresion.interpreter(context);
        }
        return  context.output;
    }

    @Override
    public void interpreter(ContextOperacionRomanos context) {

    }
}
