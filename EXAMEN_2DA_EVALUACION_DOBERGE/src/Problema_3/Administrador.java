package Problema_3;
/**
 *
 * @author Alonso
 */
public class Administrador extends EmpleadoTiempoCompleto implements ElegibleParaBono{
    public double pdb;
    public double pago;
    
    public Administrador(){
        
    }

    public Administrador(double pdb) {
        this.pdb = pdb;
    }

    public double getPdb() {
        return pdb;
    }

    public void setPdb(double pdb) {
        this.pdb = pdb;
    }

    @Override
    public double calcularBono() {
       pago = salario * pdb;
        System.out.println("bono: " + pago );
        return pago;
       
    }
    /**
     *
     * @return
     */

}
