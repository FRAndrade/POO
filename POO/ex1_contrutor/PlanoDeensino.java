public class PlanoDeensino{
	private Aula [] listadeAula;
	private String disciplina;
	private int numeroDeAulas=0;
	private int qte =0;
	private static int qtedeplanos = 0;

	public PlanoDeensino(){
		qtedeplanos++;
	}

	public PlanoDeensino(int numeroDeAulas){
		listadeAula= new Aula[numeroDeAulas];
		this.numeroDeAulas=numeroDeAulas;
		qtedeplanos++;
	}

	public PlanoDeensino(int numeroDeAulas, String disciplina){
		listadeAula= new Aula[numeroDeAulas];
		this.disciplina=disciplina;
		this.numeroDeAulas=numeroDeAulas;
		qtedeplanos++;
	}

	public void adicionarAula(Aula parametro)throws Exception{
		if(qte==numeroDeAulas){
			throw new Exception ("quantidade de aulas acima do limite");
		}
		listadeAula[qte]=parametro;
		qte++;
	}
	public void adicionarAula(String nome)throws Exception{
		if(qte==numeroDeAulas){
			throw new Exception ("quantidade de aulas acima do limite");
		}
		listadeAula[qte]= new Aula(nome);
		qte++;
	}
	public void imprimeAula(){
		for(int s = 0;s<qte;s++)
			System.out.println(listadeAula[s].getnomedaaula());
	}
	public static int getqte(){
		return qtedeplanos;
	}
}
