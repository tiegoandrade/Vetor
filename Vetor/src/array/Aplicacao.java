package array;

public class Aplicacao implements MetodosArray {

	public static void main(String[] args) {
		
		// Declara��o de um vetor
		int vetorTeste[] = {2,5,8,9,10,11,12,85,95};
		
		// Chamada ao m�todo
		int x = MetodosArray.buscaLinear(vetorTeste, 100);
		
		// Testa para identificar se o valor foi encontrado ou n�o.
		if (x < 0){
			System.out.println ("Esse valor n�o se encontra no vetor");
		} else {
			System.out.println ("Est� na posi��o: " + x);
		}
	}
}
