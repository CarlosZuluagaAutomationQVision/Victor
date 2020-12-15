package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import ui.InicarSesionTiendaUi;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IniciarSesionTienda implements Task {

    private String correoUsuario;
    private String claveUsuario;


    public IniciarSesionTienda(String Usuario, String clave){
        this.correoUsuario=Usuario;
        this.claveUsuario=clave;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(correoUsuario).into(InicarSesionTiendaUi.LBL_EMAIL),
                         Enter.theValue(claveUsuario).into(InicarSesionTiendaUi.LBL_PASSWORD),
                         Click.on(InicarSesionTiendaUi.BTN_SIGN_IN));
    }
    public static IniciarSesionTienda con(String usuario, String clave){
        return instrumented(IniciarSesionTienda.class,usuario,clave);
    }
}
