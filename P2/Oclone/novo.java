public class novo implements Cloneable{
	private int [] num = int [20];
	private String nome;
	public novo(String nome,int num){
		this.nome= nome;		
		for(int i =0;i<20;i++){
			num[i]=i;
		}
	}

	public void setNome(String nome){
		this.nome= nome;	
		for(int i =19;i>-1;i--){
			num[i]=i;
		}
	}
	public String imprime(){
		return nome + " " + num[0];
	}
	@Override
	public novo clone() throws CloneNotSupportedException{
		novo neunovo = (novo)super.clone();
		return neunovo;
	}
}
