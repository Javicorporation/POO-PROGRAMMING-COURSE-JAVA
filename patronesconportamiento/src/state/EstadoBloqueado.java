package state;

public class EstadoBloqueado extends Estado {

    public EstadoBloqueado(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {
        telefono. cambiarEstado(new EstadoBloqueado( telefono));
        return "desbloqueomovil desbloqueado";
    }

    @Override
    public String abrirCamara() {
        return "abrieron la camara esta bloqueadda,  desbloquea el movil" ;
    }

    @Override
    public String tomarFoto() {
        return "";
    }
}
