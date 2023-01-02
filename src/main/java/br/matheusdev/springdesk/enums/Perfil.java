package br.matheusdev.springdesk.enums;

public enum Perfil {

    ADMIN("Administrador"),
    CLIENTE("Cliente"),
    TECNICO("Tecnico");

    private String perfil;

    private Perfil(String perfil) {
        this.perfil = perfil;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
}
