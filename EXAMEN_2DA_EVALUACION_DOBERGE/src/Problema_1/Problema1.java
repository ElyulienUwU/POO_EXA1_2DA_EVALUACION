package Problema_1;

public class Problema1 {

	public Problema1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pruebas de la primera formula
	Formula_1 F1 = new Formula_1();
				//	  |Velocidad Inicial
				//	  |   |Velocidad Final   Lo mismo para todo lo demas
				//	  |	  |	 |Aceleracion
				//	  |	  |	 |	 |Tiempo
	F1.AsignarValores(15, 0, 30, 22);
	System.out.println("Distancia Usando la primera formula: " + F1.CalcularDistancia());
	//Pruebas de la segunda Formula
	Formula_2 F2 = new Formula_2();
	F2.AsignarValores(30, 15, 0, 78);
	System.out.println("Distancia Usando la segunda Formula: " + F2.CalcularDistancia());
	//Pruebas de la tercera formula
	Formula_3 F3 = new Formula_3();
	F3.AsignarValores(-12, 10, 5, 5);
	System.out.println("Distancia Usando la tercera Formula: " + F3.CalcularDistancia());
	}
	

}
