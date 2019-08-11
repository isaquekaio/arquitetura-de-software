import java.util.*;
class Main {
  public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

    System.out.println("\n\t\tCalcular das areas\n");
		System.out.println("Digite dois valores: ");

		int l1 = sc.nextInt();
		int l2 = sc.nextInt();

		GeometriaIF geo = new GeometriaProxy(l1, l2);
		System.out.println();

		geo.calcular();
		System.out.println();

		geo.calcular();
		System.out.println();	
  }
}