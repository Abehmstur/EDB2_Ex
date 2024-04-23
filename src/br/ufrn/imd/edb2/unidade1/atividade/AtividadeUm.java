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
	
	public static void analisarResultadoBuscaSequencial(int resultado, int x) {
		if (resultado != -1) {
            System.out.println("O elemento " + x + " foi encontrado no indice " + resultado);
        } else {
            System.out.println("O elemento " + x + " nao foi encontrado no vetor.");
        }
	}

	
	public static void main(String[] args) {
		int[] v = { 3, 7, 1, 9, 5 };
        int x = 1;

        int resultadoI = buscaSequencial(v, x, 0);
        //Teste 1
        analisarResultadoBuscaSequencial(resultadoI, x);
		
        //Teste 2
        int[] v2 = { 0, 8, 1, 9, 15, 40, 70, 90 };
        x = 15;
        resultadoI = buscaSequencial(v2, x, 0);
        analisarResultadoBuscaSequencial(resultadoI, x);
        
        //Teste 3
        x = 1;
        int[] v3 = {};
        resultadoI = buscaSequencial(v3, x, 0);
        analisarResultadoBuscaSequencial(resultadoI, x);
	}

}
