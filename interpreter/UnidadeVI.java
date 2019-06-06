public class UnidadeVI extends Romanos{

	public UnidadeVI(){
		super();
	}
	//unidade-vi ::= 'I' (7) | 'I' unidade-vii
	@Override
	public int interpret(String entrada) throws FormatoInvalido {
		UnidadeVII unidadeVII = new UnidadeVII();
		if(entrada.charAt(0) == 'I'){
			if(entrada.length() == 1){
				return 7;
			}else{
				return unidadeVII.interpret(entrada.substring(1));
			}
		}
		throw new FormatoInvalido();
	}
}
