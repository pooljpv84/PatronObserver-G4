/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.observer2;

/**
 *
 * @author Mauricio Ortiz Ochoa
 */
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
