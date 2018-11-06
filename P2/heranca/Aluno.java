public class Aluno extends Pessoa{
	private String curso;
	public Aluno(String curso,String nome){
		super(nome);
		this.curso=curso;
	}
	@Override
	public String getDados(){
	return "Aluno "+ nome + ". Faz o curso: " + curso;
	}
}
