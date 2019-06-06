public abstract class Romanos{
	public abstract int interpret(String entrada) throws FormatoInvalido;

	public static int start(String entrada) throws FormatoInvalido{
		entrada = entrada.toUpperCase();
		if(entrada.charAt(0) == 'I' || entrada.charAt(0) == 'V'){
			Unidade unidade = new Unidade();
			return unidade.interpret(entrada);
		}else if(entrada.charAt(0) == 'X'){
			Dezena dezena = new Dezena();
			return dezena.interpret(entrada);
		}else{
			throw new FormatoInvalido();
		}
	}
}
