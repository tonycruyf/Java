
public class TestaLacos5 {
	public static void main(String[] args) {
		for (int linha = 0; linha <= 10; linha++) {
			for (int coluna = 10; coluna >= 1; coluna--) {
				if (coluna < linha) {
					break;
				}
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}

	}
}
