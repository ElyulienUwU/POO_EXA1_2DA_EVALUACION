package Problema_3;

/**
 *
 * @author Alonso
 */
public class Empleado_tiempo_parcial extends Empleados {
    public double ph;
    public int ht;

        public Empleado_tiempo_parcial() {
    }
    public Empleado_tiempo_parcial(double ph, int ht) {
        this.ph = ph;
        this.ht = ht;
    }

    public double getPh() {
        return ph;
    }

    public void setPh(double ph) {
        this.ph = ph;
    }

    public int getHt() {
        return ht;
    }

    public void setHt(int ht) {
        this.ht = ht;
    }
    

    @Override
    public double Calcularsalario() {
        salario = ph*ht;
        return 0;
        
    }
    
}
