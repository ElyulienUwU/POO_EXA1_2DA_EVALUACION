package Problema_2;

public class Manufactura extends Empleados{
	private String nombre;
	private String apellido;
	private double edad;
	//SalBase es por Salario Base
	private double SalBase;
	//Añadimos Horas para poder hacer el calculo del salario que le corresponde en cuestion de lo que trabajo
	private double Horas;
	
	public Manufactura() {
		
	}
	//Constructor sin parametros que inicia los valores que nosotros declaramos, es decir, los valores iniciales
	public void ValoresIniciales() {
		nombre = "Julian";
		apellido = "Ortiz";
		edad = 19;
		SalBase = 40;
		Horas = 0;
	}
	//Horas es la cantidad de horas que asistio a la semana, con eso se hace el calculo del salario merecido
	public void AsignarValores(String nombre, String apellido, double edad, double SalBase, double Horas) {
	this.nombre = nombre;
	this.apellido = apellido;
	this.edad = edad;
	this.SalBase = SalBase;
	this.Horas = Horas;
	
	}

	
	//ImprimirDatos es sobre todo para hacer pruebas, pero lo dejamos por no tener idea de como hacer el inciso C
	public void ImprimirDatos() {
		//Calculo de su pago por las horas que trabajo, hubiesemos puesto dias, pero no todos trabajan todo el dia.
		//5 dias a la semana 8 horas diarias
		double SalCal = Horas * 40;
		//SalCal es por SALario CALculado
		System.out.println("En manufactura: ");
		System.out.println("Nombre del empleado:  " + nombre);
		System.out.println("Apellido:  " + apellido);
		System.out.println("Edad:  " + edad);
		System.out.println("Salario Base: "  + SalBase + " Pesos");
		System.out.println("Salario Calculado: " + SalCal + " Pesos\n");
	}
}
