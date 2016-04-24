package array;

// Interface que possui os métodos para manipular um vetor
public interface MetodosArray { 
	
	// Método que corresponde a uma busca linear
	// Recebe como parâmetro um vetor e o valor que se deseja encontrar.
	public static int buscaLinear (int[]vetor, int valorProcurado){
		
		// Estrutura de repetição que percorre o vetor a procura de um determinado número.
		for (int i = 0 ; i < vetor.length ; i++ ){
			if (vetor [i] == valorProcurado){
				return i;
			}
		}
		/* Se não houver correspondência com nenhum elemento do vetor, 
		   indica um índice inválido */
		return -1;
	}
	
	public static int buscaBinaria(int []vetor, int valorProcurado){
		
		int indiceEsq = 0;
		int indiceDir = vetor.length-1;
		int indiceMeio = 0;
		
		while (indiceEsq <= indiceDir){
			indiceMeio = (indiceEsq + indiceDir)/2;
			if (vetor[indiceMeio] < valorProcurado){
				indiceEsq = indiceMeio+1;
			} else if (vetor[indiceMeio] > valorProcurado){
				indiceDir = indiceMeio-1;
			} else {
				return indiceMeio;
			}	
		}
		return -1;
	}
}





