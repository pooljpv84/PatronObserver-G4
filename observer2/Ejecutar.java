package p61.observer2;



public class Ejecutar
{
    public static void main(String[] args)
    {
        System.out.println("Observer");

        var graduacion= new Graduacion();
        //
        var materia = new Materia();
        var contabilidad = new Contabilidad();
        var biblioteca = new Biblioteca();
        var laboratorio = new Laboratorio();

        graduacion.attach(materia);
        graduacion.attach(contabilidad);
        graduacion.attach(biblioteca);
        graduacion.attach(laboratorio);
        graduacion.setFacturaPagada(true);
        graduacion.notificar();
        System.out.println("Materias:  = " + materia);
        System.out.println("Contabilidad:  = " + contabilidad);
        System.out.println("Biblioteca:  = " + biblioteca);
        System.out.println("Laboratorio:  = " + laboratorio);

        if (materia.isSeguimientoIniciado() && contabilidad.isPagoMayorizado() && biblioteca.isLibrosdevueltos() && laboratorio.isInsumosdevueltos())
        {
            System.out.println("El estudiante se puede graduar");
        }
        else
        {
            System.out.println("El estudiante NO se puede graduar");
        }
    }
}
