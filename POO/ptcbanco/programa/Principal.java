package programa;
import banco.*;
public class Principal{
	public static void main(String[] args){
		conta c1= new conta();
		conta c2= new conta();
		conta c3= new conta();
		c1.setid("Honória");
		c1.setsaldo("10000000");
		c2.setid("Maria");
		c2.setsaldo("500");
		c1.imprimirSaldo();
		c2.imprimirSaldo();
	}
}
