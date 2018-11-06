package geometria;
public class FiguraPlana{

	protected String tipo = "?";

	public double perimetro(){
		return 0;
	}

	public double area(){
		return 0;
	}

	@Override
	public String toString(){
	return 	"Tipo= " + tipo + "Area= "+ area() +"Perimetro= "+ perimetro();
	}

}
