import java.util.*;
public class Principal{
	public static void main(String []  args){
		try{
		teste neu = new teste();
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		neu.iai(i);
		}catch(errado e){
			System.out.println(e);
		}catch(DeuErro e){
			System.out.println(e);
		}
	}
}
