/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.observer2;

/**
 *
 * @author Mauricio Ortiz Ochoa
 */
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
