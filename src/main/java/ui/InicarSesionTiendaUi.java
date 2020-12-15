package ui;

import net.serenitybdd.screenplay.targets.Target;

public class InicarSesionTiendaUi {

    public static final Target LBL_EMAIL=Target.the("Correo usuario").locatedBy("//input[@id='email']");
    public static final Target LBL_PASSWORD=Target.the("Contraseña usuario").locatedBy("//input[@id='passwd']");
    public static final Target BTN_SIGN_IN=Target.the("Boton iniciar sesion").locatedBy("//button[@id = 'SubmitLogin']");
}
