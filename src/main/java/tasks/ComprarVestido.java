package tasks;

import interactions.ObtenerMayorPrecio;
import model.IniciarSesionTiendaModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import ui.IndexTiendaVirtualUi;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ComprarVestido implements Task {

    IniciarSesionTiendaModel modelo;


    public ComprarVestido(IniciarSesionTiendaModel modelo){
        this.modelo=modelo;
    }

    @Step ("El actor inicia la compra del vestido")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(IndexTiendaVirtualUi.BTN_VESTIDOS));
        WaitUntil.the(IndexTiendaVirtualUi.BTN_LISTAR_VESTIDOS, WebElementStateMatchers.isEnabled());
        actor.attemptsTo(Click.on(IndexTiendaVirtualUi.BTN_LISTAR_VESTIDOS));

        actor.attemptsTo(ObtenerMayorPrecio.deLaLista());

        actor.attemptsTo(Click.on(IndexTiendaVirtualUi.BTN_IR_A_PAGAR),
                         Click.on(IndexTiendaVirtualUi.BTN_CONTINUAR_A_PAGAR));

        actor.attemptsTo(IniciarSesionTienda.con(modelo.getCorreoUsuario(),modelo.getClaveUsuario()));

        actor.attemptsTo(Click.on(IndexTiendaVirtualUi.BTN_SEGRIR_A_PAGAR));
        WaitUntil.the(IndexTiendaVirtualUi.BX_ACEPTAR_TERMINOS, WebElementStateMatchers.isEnabled());

        actor.attemptsTo(Click.on(IndexTiendaVirtualUi.BX_ACEPTAR_TERMINOS),
                         Click.on(IndexTiendaVirtualUi.BTN_SEGRIR_A_PAGAR_MEDIO_PAGO),
                         Click.on(IndexTiendaVirtualUi.BTN_MEDIO_DE_PAGO),
                         Click.on(IndexTiendaVirtualUi.BTN_CONFIRMAR_ORDEN),
                         Click.on(IndexTiendaVirtualUi.BTN_REGRESAR_A_ORDENES),
                         Click.on(IndexTiendaVirtualUi.DESCARGAR_PAGO)
                         );

    }

    public static ComprarVestido en(IniciarSesionTiendaModel modelo){
        return instrumented(ComprarVestido.class,modelo);
    }
}
