package provas;
public class Prova{
	MultiplaEscolha [] questoes;
	private int q = 0,qtes=0;
	public Prova(int q,int i,String enunciado){// só add o numero de questões 
		questoes = new MultiplaEscolha [i];
		this.q=q;
	}
	public void addquest(MultiplaEscolha quest)throws Exception{
		if(q==qtes) throw new Exception("Número máximo de Questões");
		questoes[qtes]=quest;
		qtes++;
	}
	public void imprimirpergunta(){
		System.out.println("-----Prova-----");
		for(MultiplaEscolha elemento : this.questoes)
			elemento.imprimirpergunta();
	}
}
