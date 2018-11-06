public class principal{
	public static void main(String [] args){
	try{
	novo neunuevo = new novo("FR",10);
	System.out.println(neunuevo.imprime());
	novo neunovo = neunuevo.clone();
	neunuevo.setNome("Andrade");
	System.out.println(neunuevo.imprime());	
	System.out.println(neunovo.imprime());	
	}catch(CloneNotSupportedException e){
		System.out.println(e);	
	}
	}
}
