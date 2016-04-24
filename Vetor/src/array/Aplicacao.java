package array;

public class Aplicacao implements MetodosArray {

	public static void main(String[] args) {
		
		// Declaração de um vetor
		int vetorTeste[] = {2,5,8,9,10,11,12,85,95};
		
		// Chamada ao método
		int x = MetodosArray.buscaLinear(vetorTeste, 100);
		
		// Testa para identificar se o valor foi encontrado ou não.
		if (x < 0){
			System.out.println ("Esse valor não se encontra no vetor");
		} else {
			System.out.println ("Está na posição: " + x);
		}
	}
}
