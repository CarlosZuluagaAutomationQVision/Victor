package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import ui.IniciarSesionCorreoUi;

public class CorreoEnviadoQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(IniciarSesionCorreoUi.CONFIRM_MESSAGE).viewedBy(actor).asString();
    }
    public static CorreoEnviadoQuestion enviado(){
        return new CorreoEnviadoQuestion();
    }
}
