package ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class IniciarSesionCorreoUi {

    public static final Target CORREO_USUARIO=Target.the("Correo de usuario").locatedBy("//*[@id=\"identifierId\"]");
    public static final Target CLAVE_USUARIO=Target.the("Clave de correo usuario").locatedBy("//input[@name='password']");
    public static final Target BTN_SIGUIENTE=Target.the("Boton siguiente").locatedBy("//*[@class='VfPpkd-RLmnJb']");
    public static final Target BTN_LOGIN_GMAIL=Target.the("Boton login de gmail").locatedBy("//*[@id=\"passwordNext\"]/div/button");
    public static final Target BTN_REDACTAR = Target.the("Boton redactar nuevo correo").locatedBy("/html[1]/body[1]/div[7]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]");
    public static final Target DESTINATARIO = Target.the("Campo destinatario").locatedBy("//textarea[@name='to']");
    public static final Target ASUNTO = Target.the("Campo asunto").locatedBy("//input[@name='subjectbox']");
    public static final Target CONTENIDO= Target.the("Contenido del correo").locatedBy("(//table/tbody/tr/td[2]/div[2]/div)[1]");
    public static final Target BTN_ENVIAR = Target.the("Boton enviar").locatedBy("(//table/tbody/tr/td[1]/div/div[2]/div[1])[2]");
    public static final Target CONFIRM_MESSAGE = Target.the("Mensaje de confirmación de correo enviado").locatedBy("//div[@class='b8 UC bAp']//div[@class='vh']");
}
