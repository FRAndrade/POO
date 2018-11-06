package provas;
public class Pergunta{
	String enunciado;
	public Pergunta(String texto){
		this.enunciado=texto;
	}
	public String getPergunta(){
		return this.enunciado;
	}
	public void imprimirpergunta(){
	System.out.println("Enunciado: " + this.enunciado);
	}
}
