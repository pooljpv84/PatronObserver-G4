package p61.observer2;

import java.util.ArrayList;
import java.util.List;

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
