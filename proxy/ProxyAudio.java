public class ProxyAudio implements AudioIF{
	
	private TipoRealAudio meuAudio;//***
	private String nomeArquivo;

	public ProxyAudio(String nomeArquivo){
		this.nomeArquivo = nomeArquivo;
	}

	public void play(){
		if(meuAudio == null){
			System.out.println("Instância não existia... Criando instância do TipoRealAudio...");
			meuAudio = new TipoRealAudio(nomeArquivo);
		}else{
			System.out.println("Recuperando instância anteriormente criada de TipoRealAudio...");
		}
	} 
}