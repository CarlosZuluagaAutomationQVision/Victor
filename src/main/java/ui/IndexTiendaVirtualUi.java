package ui;


import net.serenitybdd.screenplay.targets.Target;

public class IndexTiendaVirtualUi {

    public static final Target BTN_VESTIDOS = Target.the("Boton vestidos").locatedBy("(//a[@title=\"Dresses\"])[2]");
    public static final Target BTN_LISTAR_VESTIDOS = Target.the("Mostrar en una lista").locatedBy("//i[@class='icon-th-list']");
    public static final Target LISTA_DE_VESTIDOS = Target.the("Lista de vestidos").locatedBy("//ul[@class='product_list row list']");
    public static final Target PRECIO_VESTIDO = Target.the("Precio del vestido").locatedBy("(//div[@id=\"center_column\"]/descendant::ul[@class=\"product_list row list\"]/li)[{0}]//div[@class=\"content_price col-xs-5 col-md-12\"]/span");
    public static final Target BTN_ADD_TO_CART = Target.the("Boton agregar a carrito").locatedBy("(//span[contains(text(),'Add to cart')])[{0}]");
    public static final Target BTN_IR_A_PAGAR= Target.the("Ir a pagar").locatedBy("//span[contains(text(),'Proceed to checkout')]");
    public static final Target BTN_CONTINUAR_A_PAGAR =Target.the("Ir a pagar interfaz tienda").locatedBy("//p[@class=\"cart_navigation clearfix\"]//*[contains(@title,'Proceed to checkout')]");
    public static final Target BTN_SEGRIR_A_PAGAR = Target.the("Boton ir a pagar interfaz login").locatedBy("//button[@name='processAddress']");
    public static final Target BX_ACEPTAR_TERMINOS = Target.the("Aceptar terminos").locatedBy("//input[@id='cgv']");
    public static final Target BTN_SEGRIR_A_PAGAR_MEDIO_PAGO = Target.the("Boton ir a pagar interfaz login").locatedBy("//button[@name='processCarrier']");
    public static final Target BTN_MEDIO_DE_PAGO = Target.the("Boton pago por transferencia").locatedBy("//a[@class='bankwire']");
    public static final Target BTN_CONFIRMAR_ORDEN=Target.the("Confirmar la orden").locatedBy("//span[contains(text(),'I confirm my order')]");
    public static final Target BTN_REGRESAR_A_ORDENES=Target.the("Regresar a las ordenes").locatedBy("//a[@class='button-exclusive btn btn-default']");
    public static final Target DESCARGAR_PAGO=Target.the("Descargar factura pdf").locatedBy("//tr[contains(@class,'first_item')]//td[@class='history_invoice']//a[1]");
    public static final Target IR_A_GMAIL=Target.the("Ir a gmail").locatedBy("//li[@class='google-plus']//a");
}
