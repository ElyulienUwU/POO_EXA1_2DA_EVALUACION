package Problema_1;

public class Formula_3 extends Movimiento{
	private double Vf;
	private double V0;
	private double a;

	public Formula_3() {
		// TODO Auto-generated constructor stub
	}
	//Colocamos Asignar valores en cada Clase Formula, para poder asignar los valores a los atributos 
	@Override
	public void AsignarValores(double V0, double Vf, double a, double t) {
		// TODO Auto-generated method stub
		super.AsignarValores(V0, Vf, a, t);
		this.V0 = V0;
		this.Vf = Vf;
		this.a = a;
	}
	//La tercera formula para calcular la distancia
	@Override
	public double CalcularDistancia() {
		double d = (Vf - V0) / (2 * a);
		return d;
	}
	
}
