import java.util.*;

class Main {
  public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int result;
		System.out.println("Digite um algorismo romano (1 a 29)");
		String valor = entrada.nextLine();
		try{
			result = Romanos.start(valor);
			System.out.println("Resultado = "+result);
		}catch(FormatoInvalido e){
			System.out.println("Foi informado um algorismo romano inválido");
		}
		entrada.close();
  }
}
