package p61.observer2;


public class Biblioteca implements SolicitarGraduacion {

    private boolean librosdevueltos;

    public boolean isLibrosdevueltos() {
        return librosdevueltos;
    }

    public void setLibrosdevueltos(boolean librosdevueltos) {
        this.librosdevueltos = librosdevueltos;
    }

    @Override
    public void updatePago(boolean estadoPago) {
        this.librosdevueltos=estadoPago;
    }

    @Override
    public String toString() {
        return "Biblioteca{" + "No tiene deudas biblioteca=" + librosdevueltos + '}';
    }
    
    
    
    
}
