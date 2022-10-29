/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.observer2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mauricio Ortiz Ochoa
 */
public abstract class Sujeto {
    private List<SolicitarGraduacion> pagoGraduacionList = new ArrayList<SolicitarGraduacion>();
    
    public abstract void attach(SolicitarGraduacion pagoFactura);
    
    public abstract void detach(SolicitarGraduacion pagoFactura);
    
    public abstract void notificar();


    public List<SolicitarGraduacion> getpagoGraduacionList() {
        return pagoGraduacionList;
    }

    public void setpagoGraduacionList(List<SolicitarGraduacion> pagoGraduacionList) {
        this.pagoGraduacionList = pagoGraduacionList;
    }
    
    
    
}
