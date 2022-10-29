package p61.observer2;


public class Laboratorio implements SolicitarGraduacion {

    private boolean insumosdevueltos;

    public boolean isInsumosdevueltos() {
        return insumosdevueltos;
    }

    public void setInsumosdevueltos(boolean insumosdevueltos) {
        this.insumosdevueltos = insumosdevueltos;
    }

    @Override
    public void updatePago(boolean estadoPago) {
        this.insumosdevueltos=estadoPago;
    }

    @Override
    public String toString() {
        return "Biblioteca{" + "No tiene deudas biblioteca=" + insumosdevueltos + '}';
    }
    
    
    
    
}
