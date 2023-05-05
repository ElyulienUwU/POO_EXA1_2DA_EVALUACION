package Problema_2;
/*
c) Tener un SOLO método ESTÁTICO el cual imprimirá el salario de cualquier objeto creado de 
CUALQUIERA de las clases de empleados. (5 puntos).
 */
public class Problema_2 {

	public Problema_2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//E1 Empleado 1
		Manufactura E1 = new Manufactura();
		E1.AsignarValores("Fernan", "El Crack", 26, 40, 30);
		E1.ImprimirDatos();
		
		Jefe E2 = new Jefe();
		E2.AsignarValores("Tajin", "De Limon", 2, 5000);
		E2.ImprimirDatos();
		
		Apoyo E3 = new Apoyo();
		E3.AsignarValores("ICe", "Cube", 35, 50, 40);
		E3.ImprimirDatos();
	}
	
}
