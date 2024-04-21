package br.ufrn.imd.edb2.unidade1.atividade;

import java.util.ArrayList;

public class AtividadeUm {
	
	/*Requisitos:
	 -Exercício 1
		Dado um vetor A de tamanho N, com valores inteiros e um valor inteiro X.
		● Implemente um algoritmo de busca sequencial recursivo que
		retorna o indice do vetor caso X seja encontrado e -1 caso contrário.
			○ Qual a complexidade temporal de busca no pior caso?
			Demonstre matematicamente.
			○ A complexidade no pior caso é a mesma da versão iterativa?
			○ Teste o algoritmo para diferentes casos de entrada, variando o
			tamanho e conteúdo do vetor.
	 */
	public static int buscaSequencial(int[] vet, int x, int i) {
        
		if (i >= vet.length) {
            return -1;
        }

        if (vet[i] == x) {
            return i;
        }

        return buscaSequencial(vet, x, i + 1);
	}

	
	public static void main(String[] args) {
        int[] v = { 3, 7, 1, 9, 5 };
        int x = 1;

        int resultadoI = buscaSequencial(v, x, 0);

        if (resultadoI != -1) {
            System.out.println("O elemento " + x + " foi encontrado no indice " + resultadoI);
        } else {
            System.out.println("O elemento " + x + " nao foi encontrado no vetor.");
        }
		
	}

}
