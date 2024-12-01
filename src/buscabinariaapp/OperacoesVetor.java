/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buscabinariaapp;

/**
 *
 * @author REGYANE
 */
public class OperacoesVetor {
    
 /**
     * Ordena um vetor de inteiros em ordem crescente usando Bubble Sort.
     * @param vetor O vetor de inteiros a ser ordenado.
     */
    public void ordenar(int[] vetor) {
        int tamanho = vetor.length;
        int aux;

        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
    }

    /**
     * Realiza uma busca binária em um vetor ordenado.
     * @param vetor O vetor de inteiros ordenado.
     * @param chave O número que deseja encontrar.
     * @return A posição da chave no vetor (0-indexado), ou -1 se não for encontrado.
     */
    public int buscaBinaria(int[] vetor, int chave) {
        int inicio = 0;
        int fim = vetor.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (vetor[meio] == chave) {
                return meio; // Retorna o índice encontrado
            } else if (vetor[meio] > chave) {
                fim = meio - 1; // Ajusta o limite superior
            } else {
                inicio = meio + 1; // Ajusta o limite inferior
            }
        }

        return -1; // Não encontrado
    }
}