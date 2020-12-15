package model;

public class IniciarSesionTiendaModel {

    String correoUsuario;
    String claveUsuario;

    public IniciarSesionTiendaModel(String correoUsuario,String claveUsuario){
        this.correoUsuario=correoUsuario;
        this.claveUsuario=claveUsuario;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public String getClaveUsuario() {
        return claveUsuario;
    }

    public void setClaveUsuario(String claveUsuario) {
        this.claveUsuario = claveUsuario;
    }
}
