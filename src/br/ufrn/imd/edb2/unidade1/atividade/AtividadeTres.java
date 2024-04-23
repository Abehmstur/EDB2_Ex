package br.ufrn.imd.edb2.unidade1.atividade;

public class AtividadeTres {
	
	/*Requisitos
	 * Exercício 3
		Dado um vetor de entrada A de tamanho N.
		- Implemente um algoritmo que verifica se o vetor está
		ordenado na forma crescente.
		- Caso o vetor esteja ordenado o algoritmo retorna
		verdadeiro.
		- Caso contrário o algoritmo retorna falso.
		- Faça uma análise de complexidade do algoritmo para o pior
		e melhor caso.
	 * */
	
    public static boolean ordemCrescente(int[] v) {
        int n = v.length;
        
        for (int i = 0; i < n - 1; i++) {
        	
            if (v[i] > v[i + 1]) {
                return false; 
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] vetor1 = {1, 2, 3, 4, 5};
        int[] vetor2 = {0, 0, 0, 0, 0};

        System.out.printf("Vetor 1 ta ordenado? %b" , ordemCrescente(vetor1));
        System.out.printf("Vetor 2 ta ordenado? %b" , ordemCrescente(vetor2));
    }

}
