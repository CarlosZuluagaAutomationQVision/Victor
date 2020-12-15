package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirPaginaTienda implements Task {
    private static final String URL="http://automationpractice.com/index.php";
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(URL));
    }

   public static AbrirPaginaTienda en (){
        return instrumented(AbrirPaginaTienda.class);
   }
}
