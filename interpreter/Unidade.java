public class Unidade extends Romanos{

	public Unidade(){
		super();
	}
	//unidade ::= 'I' (1) | 'V' (5) | 'I' unidade-i | 'V' unidade-v 
	@Override
	public int interpret(String entrada) throws FormatoInvalido {
		UnidadeI unidadeI = new UnidadeI();
		UnidadeV unidadeV = new UnidadeV();
		if(entrada.charAt(0) == 'I'){
			if(entrada.length() == 1){
				return 1;
			}else{
				return unidadeI.interpret(entrada.substring(1));
			}
		}
		//throw new FormatoInvalido();
		if(entrada.charAt(0) == 'V'){
			if(entrada.length() == 1){
				return 5;
			}else{
				return unidadeV.interpret(entrada.substring(1));
			}
		}	
		throw new FormatoInvalido();
	}
}
