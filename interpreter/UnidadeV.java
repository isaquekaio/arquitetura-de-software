public class UnidadeV extends Romanos{

	public UnidadeV(){
		super();
	}
	//unidade-v ::= 'I' (6) | 'I' unidade-vi
	@Override
	public int interpret(String entrada) throws FormatoInvalido {
		UnidadeVI unidadeVI = new UnidadeVI();
		if(entrada.charAt(0) == 'I'){
			if(entrada.length() == 1){
				return 6;
			}
			else{
				return unidadeVI.interpret(entrada.substring(1));
			}
		}
		throw new FormatoInvalido();
	}
}
