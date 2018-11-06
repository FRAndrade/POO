public class Professor extends Pessoa{
	private String sala;
	public Professor(String sala,String nome){
		super(nome);
		this.sala=sala;
	}
	@Override
	public String getDados(){
	return "Prof. "+ nome + " " + sala;
	}
}
