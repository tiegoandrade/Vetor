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
		
		// Corresponde ao 1° valor do vetor.
		int indiceEsq = 0;
		
		// Corresponde ao último valor do vetor.
		int indiceDir = vetor.length-1;
		
		//Corresponde ao índice que se encontra no meio do vetor.
		int indiceMeio = 0;
		
		// Estrutura de repetição que verifica quando o vetor acaba.
		while (indiceEsq <= indiceDir){
			indiceMeio = (indiceEsq + indiceDir)/2;
			
			// Descarta parte inferior
			if (vetor[indiceMeio] < valorProcurado){
				indiceEsq = indiceMeio+1;
				
			// Descarta a parte superior	
			} else if (vetor[indiceMeio] > valorProcurado){
				indiceDir = indiceMeio-1;
			
			// Retorna o valor procurado	
			} else {
				return indiceMeio;
			}	
		}
		// É executado se o valor procurado não for encontrado.
		return -1;
	}
}





