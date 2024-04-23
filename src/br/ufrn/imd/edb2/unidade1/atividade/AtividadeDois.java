package br.ufrn.imd.edb2.unidade1.atividade;

public class AtividadeDois {
	
	/*Exercicio 2
	 * Dado um vetor A de tamanho N, ordenado de forma crescente:
		- Implemente o algoritmo de busca binária na forma iterativa.
		- A complexidade temporal no pior caso e melhor caso é a
		mesma que a versão recursiva?
		- Qual a complexidade espacial e temporal para a versão
		recursiva e iterativa?
		- Teste o algoritmo para diferentes casos de entrada,
		variando o tamanho e conteúdo do vetor.
	 * */
	
	public static int buscaBinariaIterativa(int[] v, int x) {
        int e = 0;
        int d = v.length - 1;

        while (e <= d) {
            int meio = e + (d - e) / 2;
            
            //olha se o 'meio' é igal a x e retorna o indice dele e dps descarta a as partes dependendo do valor do 'meio'.
            if (v[meio] == x) {
                return meio;
            } else if (v[meio] < x) {
                e = meio + 1;
            } else {
                d = meio - 1;
            }
        }
        
        return -1; 
    }
	
	public static void analisarResultadoBuscaBinaria(int resultado, int x) {
		if (resultado != -1) {
            System.out.println("O elemento " + x + " foi encontrado no indice " + resultado);
        } else {
            System.out.println("O elemento " + x + " nao foi encontrado no vetor.");
        }
	}
	
	public static void main(String[] args) {
        int[] vet = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        int x = 12;

        int resultado = buscaBinariaIterativa(vet, x);
        analisarResultadoBuscaBinaria(resultado, x);
        
        x = 19;
        int[] vet2 = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
        resultado = buscaBinariaIterativa(vet2, x);
        analisarResultadoBuscaBinaria(resultado, x);
        
        x = 100;
        int[] vet3 = { 1, 1, 1};
        resultado = buscaBinariaIterativa(vet3, x);
        analisarResultadoBuscaBinaria(resultado, x);
        
	}

}
