package array;

public class Aplicacao implements MetodosArray {

	public static void main(String[] args) {
		
		// Declara��o de um vetor
		int vetorTeste[] = {2,5,8,9,10,11,12,85,95};
		
		// Chamada ao m�todo
		int y = MetodosArray.buscaBinaria(vetorTeste, 11);
		
		// Testa para identificar se o valor foi encontrado ou n�o.
		if (y < 0){
			System.out.println ("Pesquisa Bin�ria: Esse valor n�o se encontra no vetor");
		} else {
			System.out.println ("Pesquisa Bin�ria: Est� na posi��o: " + y);
		}
		
		// Chamada ao m�todo
		int x = MetodosArray.buscaLinear(vetorTeste, 95);
		
		// Testa para identificar se o valor foi encontrado ou n�o.
		if (x < 0){
			System.out.println ("\n\nPesquisa Sequencial: Esse valor n�o se encontra no vetor");
		} else {
			System.out.println ("\nPesquisa Sequencial: Est� na posi��o: " + x);
		}
	}
}
