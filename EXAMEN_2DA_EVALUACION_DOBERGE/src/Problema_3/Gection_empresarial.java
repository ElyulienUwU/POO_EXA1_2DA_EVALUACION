package Problema_3;

/**
 *
 * @author Alonso
 */
public class Gection_empresarial {

    public static void main(String[] args) {
        Empleado_tiempo_parcial em = new Empleado_tiempo_parcial();
        em.setNombre("pancho pantera");
        em.setId("id6548654864");
        em.setHt(8);
        em.setPh(200.00);
        em.Calcularsalario();
        em.imprimirdatos();
        
        Administrador bono = new Administrador();
        bono.setNombre("miguel");
        bono.setId("id5446565");
        bono.setSalario(6000.00);
        bono.setPdb(0.20);
        bono.imprimirdatos();
        bono.calcularBono();
    }
}
