public class GeometriaProxy implements GeometriaIF{
	
	private GeometriaReal geo;
	private int l1, l2;

	public GeometriaProxy(int l1, int l2){
		this.l1 = l1;
		this.l2 = l2;
	}

	public void calcular(){
		if(geo == null){
			System.out.println("Instância não existia...");
			System.out.println("Criando instância de GeometriaReal...\n");
			geo = new GeometriaReal(l1, l2);
		}else{
			System.out.println("Recuperando valores da instância: "+l1+" e "+l2);
		}
	}
}