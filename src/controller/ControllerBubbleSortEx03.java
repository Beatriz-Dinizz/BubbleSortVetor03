package controller;

import br.edu.fateczl.BubbleSort.OrdenacaoBubbleSort;

public class ControllerBubbleSortEx03 {

	public ControllerBubbleSortEx03() {
		super();
	}
	
	public void ordenarVetor03() {
		OrdenacaoBubbleSort bubbleSortEx03 = new OrdenacaoBubbleSort();
		
		int[] vetor = {101, 102, 103, 125, 124, 123, 104, 105, 106, 122};
		
		bubbleSortEx03.ordenacaoBubbleSort(vetor);
		
		int tamanho = vetor.length;
		for(int i = 0; i < tamanho; i ++) {
			System.out.println(vetor[i]);
		}
	}
}
