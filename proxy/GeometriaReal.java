public class GeometriaReal implements GeometriaIF{
	
	private int l1, l2;

	public GeometriaReal(int l1, int l2){
		this.l1 = l1;
		this.l2 = l2;
		areaQuadrado();
		areaTriangulo();
	}

	public void calcular(){
		System.out.println("Os lados são: "+l1+" e "+l2);
	}

	public void areaQuadrado(){
		if(l1 == l2){
			System.out.println("A área do Quadrado é: "+(l1*l2));
		}else{
			System.out.println("A área do Retângulo é: "+(l1*l2));
		}
		
	}

	public void areaTriangulo(){
		System.out.println("A área do Triangulo é: "+(l1*l2/2));
	}
}