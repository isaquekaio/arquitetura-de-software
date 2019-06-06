public class UnidadeVII extends Romanos{

	public UnidadeVII(){
		super();
	}
	//unidade-vii ::= 'I' (8)
	@Override
	public int interpret(String entrada) throws FormatoInvalido {
		if(entrada.charAt(0) == 'I'){
			if(entrada.length() == 1){
				return 8;
			}
			throw new FormatoInvalido();
		}
		throw new FormatoInvalido();
	}
}
