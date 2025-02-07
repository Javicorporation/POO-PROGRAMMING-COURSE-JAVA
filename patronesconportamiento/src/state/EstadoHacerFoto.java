package state;

public class EstadoHacerFoto extends Estado {
    public EstadoHacerFoto(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return "";
    }

    @Override
    public String abrirCamara() {
        return "";
    }

    @Override
    public String tomarFoto() {
        return "";
    }

}
