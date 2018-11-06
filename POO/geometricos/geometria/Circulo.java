package geometria;
public class Circulo extends FiguraPlana{
	private double raio;
	public Circulo(double raio){
		this.raio=raio;
		tipo = "Circulo";
	}
	@Override
	public double perimetro(){
		return 2 * 3.14 * raio;
	}
	@Override
	public double area(){
		return 3.14 * raio * raio;
	}
}
