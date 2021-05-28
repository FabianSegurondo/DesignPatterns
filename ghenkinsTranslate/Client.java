package interpreter.ejercicio.ghenkinsTranslate;

public class Client {
    public static void main (String[] args ){
        String userstory1 ="Como administrador Quiero generar un reporte diario Para evaluar las ganancias";
        InterpreterUserStory story = new InterpreterUserStory(userstory1);
        System.out.println("User Story descripcion en espanol : "+userstory1);
        System.out.println("User Story english description: "+ story.interpretar());


        String userstory2 ="Como administrador de la empresa Quiero generar un reportes Como licencias de venta diarias " +
                "Para evaluar las ganancias Para ver si la empresa va Como yo Quiero que vaya";
        InterpreterUserStory story2 = new InterpreterUserStory(userstory2);
        System.out.println("User Story descripcion en espanol : "+userstory2);
        System.out.println("User Story english description: "+ story2.interpretar());
    }
}
