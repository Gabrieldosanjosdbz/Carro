package exercicios_array_matriz;

import java.util.*;
import javax.swing.JOptionPane;

public class ex4_GabrielSantana {

    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Digite a quantidade de carros que você quer criar: ");
        int quant = Integer.parseInt(input);

        //Aqui, criarei um objeto chamado automoveis a partir da classe carro. Estou instanciando a classe carro
        carro[] automoveis = new carro[quant];
        
        String tabela = "";

        for (int i = 0; i < quant; i++) {

            String nome = JOptionPane.showInputDialog("Digite o nome do " + (i+1) + "º carro: ");
            String marca = JOptionPane.showInputDialog("Digite a marca do " + (i+1) + "º carro: ");
            String cor = JOptionPane.showInputDialog("Digite a cor do " + (i+1) + "º carro: ");

            carro Automovel = new carro(nome, marca, cor);

            automoveis[i] = Automovel;
        }
        
        for (int i = 0; i < automoveis.length; i++) {
            
        	tabela += "Carro número "+(i+1)+": \n\nNome: " + automoveis[i].getNome() + 
        	" | Modelo: " + automoveis[i].getMarca() + " | Cor " + automoveis[i].getCor() + "\n\n";      
        		
        }
        
        JOptionPane.showConfirmDialog(null, "E os carros são: \n" + tabela);
    }
 
}

