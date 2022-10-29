package p61.observer2;

public class Contabilidad implements SolicitarGraduacion {

    private boolean pagoMayorizado;

    public boolean isPagoMayorizado() {
        return pagoMayorizado;
    }

    public void setPagoMayorizado(boolean pagoMayorizado) {
        this.pagoMayorizado = pagoMayorizado;
    }

    @Override
    public void updatePago(boolean estadoPago) {
        this.pagoMayorizado=estadoPago;
    }

    @Override
    public String toString() {
        return "Contabilidad{" + "No tiene deudas contabilidad=" + pagoMayorizado + '}';
    }
    
    
    
    
}
