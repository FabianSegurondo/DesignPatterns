package interpreter.ejercicio.ghenkinsTranslate;


import java.util.ArrayList;
import java.util.List;

public class InterpreterUserStory extends AbstractExpression{

    private List<AbstractExpression> parseTree=new ArrayList<>();
    private ContextGhenkinsTranslate context;
    public InterpreterUserStory(String word){
        this.interpretacion(word);
    }

    public void interpretacion(String storys){
        String input =storys;
        context=new ContextGhenkinsTranslate(input.replace(" ",""));
        for (String word : input.split(" ")){
            switch (word){
                case"Como":
                    parseTree.add(new TerminalExpressionComo(word.length()));
                    break;
                case"Para":
                    parseTree.add(new TerminalExpressionPara(word.length()));
                    break;
                case"Quiero":
                    parseTree.add(new TerminalExpressionQuiero(word.length()));
                    break;
                default:
                    parseTree.add(new TerminalExpressionNoWord(word.length()));
                    break;


            }
        }
    }
    public String interpretar(){
        for (AbstractExpression expression : parseTree){
            expression.interpreter(context);
            context.output= (context.output+" ");
        }
        return context.output;
    }


    @Override
    public void interpreter(ContextGhenkinsTranslate context) {

    }
}



