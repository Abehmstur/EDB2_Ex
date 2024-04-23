package br.ufrn.imd.edb2.unidade1.atividade;

public class AtividadeQuatro {

	/*Exercício 4
	Dado um valor inteiro positivo N.
	- Implemente o algoritmo iterativo de fibonacci. De modo a
	retornar o valor inteiro X na posição N da sequência de
	fibonacci.
	- Qual a complexidade do algoritmo no pior caso?
	- Compare as complexidades do algoritmo iterativo e da
	versão recursiva apresentada (próxima página).
	- É possível implementar uma versão recursiva
	mais eficiente em termos de complexidade
	temporal?
	 * */
	
	public static int fibonaciIterativo(int n) {
        
        int a = 0, b = 1;
        int resultado = 0;

        for (int i = 2; i <= n; i++) {
            resultado = a + b;
            a = b;
            b = resultado;
        }

        return resultado;
    }
	
	
	
	public static void main(String[] args) {
		int n = 20;
        int fibo = fibonaciIterativo(n);
        System.out.println("O " + n + "º numero da sequenciai eh: " + fibo);

	}

}
