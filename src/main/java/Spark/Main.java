package Spark;
import spark.ModelAndView;
import spark.Spark;
import spark.template.handlebars.HandlebarsTemplateEngine;

public class Main {
  public static void main(String[] args) {
    Spark.port(9000);

    Spark.get("/", (request, response) ->
        "<h1>¡Hola " + request.queryParamOrDefault("nombre", "Mundo")+ "!</h1>"
            + "<p>Esta es nuestra primera respuesta HTML</p>");
/* Para indicar un valor en la query lo hacemos de la siguiente manera:
http://localhost:9000/?nombre=Nachi si no hacemos http://localhost:9000/ por defecto se pone "Mundo"
*/

  }
}
