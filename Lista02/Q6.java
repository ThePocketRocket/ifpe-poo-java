package lista02;

public class Q6 {
	public static void main(String[] args) {
		double[] vetor1 = {1,2,3,4,5}, vetor2 = {1,2,3,4,5};
		int vetoresIguais = 0;
		
		if (vetor1.length == vetor2.length) {
			for (int i = 0; i < 5; i++) {
				if (vetor1[i] == vetor2[i]) {
					vetoresIguais++;
				}
			}
		}
		
		
		if (vetoresIguais == 5) {
			System.out.println("Os vetores são iguais.");
		} else {
			System.out.println("Os vetores são diferentes.");
		}
	}
}
