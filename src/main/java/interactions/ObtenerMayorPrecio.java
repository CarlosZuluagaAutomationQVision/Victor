package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import ui.IndexTiendaVirtualUi;

import java.util.ArrayList;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ObtenerMayorPrecio implements Interaction {

    private ArrayList<Double> precios = new ArrayList<Double>();

    @Override
    public <T extends Actor> void performAs(T actor) {
        capturarPrecios(actor);
        int indiceItem = calcularMayor();
        actor.attemptsTo(Click.on(IndexTiendaVirtualUi.BTN_ADD_TO_CART.of(String.valueOf(indiceItem))));
    }
    public void capturarPrecios(Actor actor){
        int contador=1;
        String precio="";
        while (IndexTiendaVirtualUi.PRECIO_VESTIDO.of(String.valueOf(contador)).resolveFor(actor).isPresent()){
            precio= IndexTiendaVirtualUi.PRECIO_VESTIDO.of(String.valueOf(contador)).resolveFor(actor).getText();
            precios.add(Double.parseDouble(precio.substring(1, precio.length())));
            contador++;
        }
    }

    public int calcularMayor() {
        int indice = 0;
        double mayor = precios.get(0);
        for (int i = 0; i < precios.size(); i++) {
            if (precios.get(i)>mayor) {
                mayor = precios.get(i);
            }
        }

        for (int i = 0; i < precios.size(); i++) {
            if (precios.get(i) == mayor) {
                indice = i+1;
            }
        }
        return indice;
    }
    public static ObtenerMayorPrecio deLaLista(){
        return instrumented(ObtenerMayorPrecio.class);
    }
}
