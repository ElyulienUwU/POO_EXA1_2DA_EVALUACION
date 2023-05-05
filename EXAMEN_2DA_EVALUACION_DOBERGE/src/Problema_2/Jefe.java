package Problema_2;

public class Jefe extends Empleados{

	public Jefe() {
		// TODO Auto-generated constructor stub
	}

	private String nombre;
	private String apellido;
	private double edad;
	//SalBase es por Salario Base
	private double SalBase;
	//Al jefe no le hace falta las Horas

	//Constructor sin parametros que inicia los valores que nosotros declaramos, es decir, los valores iniciales
	public void ValoresIniciales() {
		nombre = "Banjoo";
		apellido = "Kazzooei";
		edad = 19;
		SalBase = 40;
	}
	
	public void AsignarValores(String nombre, String apellido, double edad, double SalBase) {
	this.nombre = nombre;
	this.apellido = apellido;
	this.edad = edad;
	this.SalBase = SalBase;
	}
	
	//ImprimirDatos es sobre todo para hacer pruebas
	public void ImprimirDatos() {
		System.out.println("El Jefe: ");
		System.out.println("Nombre del Jefe:  " + nombre);
		System.out.println("Apellido:  " + apellido);
		System.out.println("Edad:  " + edad);
		System.out.println("Salario Base: "  + SalBase + "\n");
	}
}
