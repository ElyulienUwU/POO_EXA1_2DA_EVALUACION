package Problema_3;

/**
 *
 * @author Alonso
 */
public abstract class Empleados  {
    public String id;
    public String nombre;
    public double salario;

    public Empleados() {
        this.id = "";
        this.nombre = "";
        this.salario = 0.0;
    }

    public Empleados(String id, String nombre, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void imprimirdatos(){
        System.out.println("nombre: "  + nombre);
        System.out.println("id: "  + id);
        System.out.println("salario: "  + salario);
    }
    
    public abstract double Calcularsalario();
    
}
