package tasks;

import model.EnviarCorreoModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import sun.awt.AWTAccessor;
import ui.IniciarSesionCorreoUi;

public class EnviarCorreo implements Task {
    private static final String URL="https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
    EnviarCorreoModel modelo;
    WebDriver driver;

    public EnviarCorreo(EnviarCorreoModel modelo,WebDriver driver){
        this.modelo=modelo;
        this.driver=driver;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(URL));
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        actor.attemptsTo(
                WaitUntil.the(IniciarSesionCorreoUi.CORREO_USUARIO, isEnabled()),
                Enter.theValue(modelo.getCorreoUsuario()).into(IniciarSesionCorreoUi.CORREO_USUARIO),
                Click.on(IniciarSesionCorreoUi.BTN_SIGUIENTE));

                actor.attemptsTo(Enter.theValue(modelo.getClaveUsuario()).into(IniciarSesionCorreoUi.CLAVE_USUARIO),
                                 Click.on(IniciarSesionCorreoUi.BTN_LOGIN_GMAIL)
        );

        actor.attemptsTo(
                WaitUntil.the(IniciarSesionCorreoUi.BTN_REDACTAR, isEnabled()),
                Click.on(IniciarSesionCorreoUi.BTN_REDACTAR),
                WaitUntil.the(IniciarSesionCorreoUi.DESTINATARIO, isEnabled()),
                Click.on(IniciarSesionCorreoUi.DESTINATARIO),
                Enter.theValue(modelo.getCorreoPara()).into(IniciarSesionCorreoUi.DESTINATARIO).thenHit(Keys.TAB),
                WaitUntil.the(IniciarSesionCorreoUi.ASUNTO, isEnabled()),
                Click.on(IniciarSesionCorreoUi.ASUNTO),
                Enter.theValue(modelo.getAsunto()).into(IniciarSesionCorreoUi.ASUNTO).thenHit(Keys.TAB)
        );
        actor.wasAbleTo(
                WaitUntil.the(IniciarSesionCorreoUi.CONTENIDO, isEnabled()),
                Enter.theValue(modelo.getDato()).into(IniciarSesionCorreoUi.CONTENIDO),
                Click.on(IniciarSesionCorreoUi.BTN_ENVIAR)
        );
    }
    public static EnviarCorreo enviar(EnviarCorreoModel modelo, WebDriver driver){
        return instrumented(EnviarCorreo.class, modelo,driver);
    }
}
