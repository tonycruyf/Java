
public class TestaLacos3 {
	public static void main(String[] args) {
        for(int linha = 0; linha < 10; linha++) {

            for(int coluna = 0; coluna <= 10-linha+1; coluna++) {
                System.out.print(" ");
            }

            for(int coluna = 0; coluna <= linha; coluna++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}