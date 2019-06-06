public class UnidadeII extends Romanos{

	public UnidadeII(){
		super();
	}
	//unidade-ii ::= 'I' (3) 
	@Override
	public int interpret(String entrada) throws FormatoInvalido {
		if(entrada.charAt(0) == 'I'){
			if(entrada.length() == 1){
				return 3;
				}
			}
		throw new FormatoInvalido();	
	}
}
