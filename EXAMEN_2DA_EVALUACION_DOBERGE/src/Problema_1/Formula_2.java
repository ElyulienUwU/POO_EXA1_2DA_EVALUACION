package Problema_1;

public class Formula_2 extends Movimiento{
	private double V0;
	private double t;
	private double Vf;
	
	public Formula_2() {
		// TODO Auto-generated constructor stub
	}
	//Colocamos Asignar valores en cada Clase Formula, para poder asignar los valores a los atributos
	@Override
	public void AsignarValores(double V0, double Vf, double a, double t) {
		// TODO Auto-generated method stub
		super.AsignarValores(V0, Vf, a, t);
		this.V0 = V0;
		this.Vf = Vf;
		this.t = t;
	}
	//La segunda formula para calcular la distancia
	@Override
	public double CalcularDistancia() {
		double d = (V0 + Vf) / 2 * t;
		return d;
	}

}
