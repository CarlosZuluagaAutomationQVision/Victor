package model;



public class EnviarCorreoModel {
    String emailUsuario;
    String claveDeUsuario;
    String emailDestino;
    String asunto;
    String dato;

    public EnviarCorreoModel(String correoUsuario,String claveUsuario,String correoPara,String asunto,String dato){
        this.emailUsuario=correoUsuario;
        this.claveDeUsuario=claveUsuario;
        this.emailDestino=correoPara;
        this.asunto=asunto;
        this.dato=dato;
    }

    public String getCorreoUsuario() {
        return emailUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.emailUsuario = correoUsuario;
    }

    public String getClaveUsuario() {
        return claveDeUsuario;
    }

    public void setClaveUsuario(String claveUsuario) {
        this.claveDeUsuario = claveUsuario;
    }

    public String getCorreoPara() {
        return emailDestino;
    }

    public void setCorreoPara(String correoPara) {
        this.emailDestino = correoPara;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }
}
