package provas;
public class MultiplaEscolha extends Pergunta{
	private alternativa [] escolhas;
	private int i=0;
	private int qte = 0 ;

	public MultiplaEscolha (int i,String enunciado){
		super(enunciado);
		escolhas = new alternativa[i];
		this.i=i;
	}

		public void adicionaAlternativa(String novaAlternativa)throws Exception {
		adicionaAlternativa(new alternativa(novaAlternativa));
	}
	
	public void adicionaAlternativa(alternativa novaAlternativa) throws Exception {
		boolean conseguiuAdicionar = false;
		
		for (int i = 0; i < escolhas.length && !conseguiuAdicionar; i++)
			if (escolhas[i] == null) {
				escolhas[i] = novaAlternativa;
				conseguiuAdicionar = true;
			}
			
		if (conseguiuAdicionar)
			throw new Exception("Nao adicionou alternativa.");
	}
	@Override
	public void imprimirpergunta(){
		super.imprimirpergunta();
		for(alternativa elemento : this.escolhas)
			System.out.println("- " + elemento.getalternativa());
	}
}
