package Problema_1;

public class Formula_1 extends Movimiento {
	private double V0;
	private double a;
	private double t;

	public Formula_1() {
		
	}
	//Colocamos Asignar valores en cada Clase Formula, para poder asignar los valores a los atributos
	@Override
	public void AsignarValores(double V0, double Vf, double a, double t) {
		// TODO Auto-generated method stub
		super.AsignarValores(V0, Vf, a, t);
		this.V0 = V0;
		this.a = a;
		this.t = t;
	}
	//La primera formula para calcular la distancia
	@Override
	public double CalcularDistancia() {
		double d = V0 * t + ( a * (t*t) /2);
		return d;
	}

	
}
