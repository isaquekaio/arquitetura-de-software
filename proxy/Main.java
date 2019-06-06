class Main {
  public static void main(String[] args) {
    AudioIF meuAudio = new ProxyAudio("meuArquivo.mp3");

		System.out.println();
		
		meuAudio.play();
		System.out.println();

		meuAudio.play();
		System.out.println();
  }
}
//ProxyDemo