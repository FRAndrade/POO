public class amigos<T>{
	private int camisa;
        private T nome;
	public amigos(T nome,int camisa) throws Erro{
		if(nome=="Caralho") throw new Erro(camisa);
		if(camisa==10) throw new Erro(camisa);
		this.camisa=camisa;
		this.nome=nome;
	}
	public void imprime(int i){
		if(i==0) throw new corrida(i);
		System.out.println(nome);
		System.out.println(camisa);
	}
}
