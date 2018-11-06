public class Professor extends Pessoa{
	private String Sala;
	public void setSala(String Sala){
		this.Sala=Sala;
	}
	public String getSala(){
		return this.Sala;
	}
	@Override
	public String getNome(){
		return "Prof" + super.getNome();
	}
}	
