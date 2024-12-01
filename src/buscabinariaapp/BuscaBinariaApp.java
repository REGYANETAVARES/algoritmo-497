/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buscabinariaapp;
import javax.swing.JOptionPane;

/**
 *
 * @author REGYANE
 */
public class BuscaBinariaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OperacoesVetor operacoes = new OperacoesVetor();
        int[] numeros = new int[10];

        // Entrada de números
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(
                null, "Digite o número " + (i + 1) + ":"
            ));
        }

        // Entrada do número de busca
        int numeroBusca = Integer.parseInt(JOptionPane.showInputDialog(
            null, "Digite o número que deseja buscar:"
        ));

        // Ordenar o vetor
        operacoes.ordenar(numeros);

        // Realizar a busca binária
        int posicao = operacoes.buscaBinaria(numeros, numeroBusca);

        // Exibir o vetor ordenado
        StringBuilder vetorOrdenado = new StringBuilder("VETOR ORDENADO:\n");
        for (int i = 0; i < numeros.length; i++) {
            vetorOrdenado.append((i + 1)).append(" - ").append(numeros[i]).append("\n");
        }

        // Exibir o resultado da busca
        if (posicao != -1) {
            JOptionPane.showMessageDialog(null,
                vetorOrdenado +
                "\nNúmero encontrado na posição: " + (posicao + 1)
            );
        } else {
            JOptionPane.showMessageDialog(null,
                vetorOrdenado + "\nNúmero NÃO encontrado."
            );
        }
    }
}
