package state;

public class EstadoDesbloqueado extends Estado {


    public EstadoDesbloqueado(Telefono telefono) {
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
