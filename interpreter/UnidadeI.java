public class UnidadeI extends Romanos{

	public UnidadeI(){
		super();
	}
	//unidade-i ::= 'I' (2) | 'V' (4) | 'X' (9) | 'I' unidade-ii
	@Override
	public int interpret(String entrada) throws FormatoInvalido {
		UnidadeII unidadeII = new UnidadeII();
		if(entrada.charAt(0) == 'I'){
			if(entrada.length() == 1){
				return 2;
			}else{
				return unidadeII.interpret(entrada.substring(1));
			}
		}
		if(entrada.charAt(0) == 'V'){
			if(entrada.length() == 1){
				return 4;
			}
			throw new FormatoInvalido();
		}
		if(entrada.charAt(0) == 'X'){
			if(entrada.length() == 1){
				return 9;
			}
			throw new FormatoInvalido();
		}
		throw new FormatoInvalido();
	}
}
