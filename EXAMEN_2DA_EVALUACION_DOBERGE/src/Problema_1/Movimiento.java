package Problema_1;

public abstract class Movimiento implements Captura{
	private double V0;
	private double Vf;
	private double a;
	private double t;
	
	public Movimiento() {
		// TODO Auto-generated constructor stub

	}
	@Override
	public void setV0(double x) {
	}
	@Override
	public double getV0() {
		return V0;
	}
	@Override
	public void setVf(double y) {
	}
	@Override
	public double getVf() {
	return Vf;
	}
	@Override
	public void setA(double z) {	
	}
	@Override
	public double getA() {
		return a;
	}
	@Override
	public void setT(double a) {
	}
	@Override
	public double getT() {
		return t;
	}
	//Constructor sin parametros que establece los valores iniciales
	public void ValoresIniciales() {
		V0 = 10;
		Vf = 16;
		a = 2;
		t = 4;
	}
	//Constructor con parametros para que el usuario asigne los valores
	public void AsignarValores(double V0,double Vf,double a,double t) {}
	public abstract double CalcularDistancia();
}	
