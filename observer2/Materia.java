
package p61.observer2;

public class Materia implements SolicitarGraduacion {

    public boolean isSeguimientoIniciado() {
        return seguimientoIniciado;
    }

    public void setSeguimientoIniciado(boolean seguimientoIniciado) {
        this.seguimientoIniciado = seguimientoIniciado;
    }

    private boolean seguimientoIniciado;
    
    @Override
    public void updatePago(boolean estadoPago) {
        this.seguimientoIniciado=estadoPago;
    }

    @Override
    public String toString() {
        return "Estado materias{" + "Materias aprobadas=" + seguimientoIniciado + '}';
    }
    
    
    
}
