import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, cont, pares;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		int[] vet = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println("NUMEROS PARES: ");
		
		for (int i = 0; i < n; i++) {
			if (vet[i] % 2 == 0) {
				System.out.print(vet[i] + " ");
			}
		}
		System.out.println();
		
		cont = 0;
		
		for (int i = 0; i < n; i++) {
			if (vet[i] % 2 == 0) {
				cont++;
			}
		}
		System.out.println();
		System.out.println("QUANTIDADE DE PARES: " + cont);
		
		
		
		
		sc.close();
	}
}