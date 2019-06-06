import java.util.*;

public class Dezena extends Romanos{

	public Dezena(){
		super();
	}
	//dezena ::= 'X' (10) | 'XX' (20) | 'X' unidade | 'XX' unidade
	@Override
	public int interpret(String entrada) throws FormatoInvalido{
		Unidade unidade = new Unidade();
		if(entrada.length() == 1){
			return 10;
		}
		if(entrada.charAt(1) == 'X'){
			if(entrada.length() == 2){
				return 20;
			}
				return 20 + unidade.interpret(entrada.substring(2));
		}
		return 10 + unidade.interpret(entrada.substring(1));
	}
}
