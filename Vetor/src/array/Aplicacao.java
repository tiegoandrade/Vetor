package array;

public class Aplicacao implements MetodosArray {

	public static void main(String[] args) {
		
		// Declaração de um vetor
		int vetorTeste[] = {2,5,8,9,10,11,12,85,95};
		
		// Chamada ao método
		int y = MetodosArray.buscaBinaria(vetorTeste, 11);
		
		// Testa para identificar se o valor foi encontrado ou não.
		if (y < 0){
			System.out.println ("Pesquisa Binária: Esse valor não se encontra no vetor");
		} else {
			System.out.println ("Pesquisa Binária: Está na posição: " + y);
		}
		
		// Chamada ao método
		int x = MetodosArray.buscaLinear(vetorTeste, 95);
		
		// Testa para identificar se o valor foi encontrado ou não.
		if (x < 0){
			System.out.println ("\n\nPesquisa Sequencial: Esse valor não se encontra no vetor");
		} else {
			System.out.println ("\nPesquisa Sequencial: Está na posição: " + x);
		}
	}
}
