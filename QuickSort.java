package Controller;

public class Ordenacao {
	
	public Ordenacao() {
		super();
	}
public int [] quickSort (int [] vetor, int inicio, int fim) {
		 if (fim>inicio) {
			 int pivoFixo = dividir(vetor, inicio, fim);
			  quickSort (vetor, inicio, pivoFixo - 1);
			  quickSort (vetor, pivoFixo + 1, fim);
			 }
		 return vetor;
		 }
	
	public int dividir (int [] vetor, int inicio, int fim) {
		int pivo = vetor[inicio];
		int esq = inicio + 1;
		int dir = fim;
		
		while (esq <= dir) {
			while (esq <= dir && vetor[esq] <= pivo) {
				esq++;
			}
		}
		while (dir >= esq  && vetor[dir] > pivo) {
			 dir++;
		}
		if (esq < dir) {
			troca(vetor, dir, esq);
			esq++;
			dir--;
		}
		troca(vetor, inicio, dir);
		return dir;
	}

 	private void troca(int[] vetor, int i, int j) {
 		int aux = vetor[i];
 		vetor[i] = vetor[j];
 		vetor[j] = aux;
 	}
}
