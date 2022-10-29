package observer2;

public class Graduacion extends Sujeto {
    
    private boolean facturaPagada;

    @Override
       public void attach(SolicitarGraduacion pagoFactura){
        this.getpagoGraduacionList().add(pagoFactura);
    }
    
    @Override
    public void detach(SolicitarGraduacion pagoFactura){
        this.getpagoGraduacionList().remove(pagoFactura);
    }

    @Override
    public void notificar() {
        for (var pagoFactura : this.getpagoGraduacionList()) {
            if (pagoFactura instanceof Materia) {
                pagoFactura.updatePago(this.facturaPagada);
            }
            if (pagoFactura instanceof Contabilidad) {
                pagoFactura.updatePago(this.facturaPagada);
            }
            if (pagoFactura instanceof Biblioteca) {
                pagoFactura.updatePago(this.facturaPagada);
            }
            if (pagoFactura instanceof Laboratorio) {
                pagoFactura.updatePago(this.facturaPagada);
            }
        }
    }

    public boolean isFacturaPagada() {
        return facturaPagada;
    }

    public void setFacturaPagada(boolean facturaPagada) {
        this.facturaPagada = facturaPagada;
    }

   
    
    
    
}
