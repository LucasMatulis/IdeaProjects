package Pilha;

import javax.swing.*;

public class MexerPilha {
        public static void main(String[] args) {
            Pilha obj = new Pilha();
            int opcao;

            do {
                opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o que deseja fazer\n1. Adicionar\n2. Excluir\n3. Mostrar a pilha\n4. Encerrar aplicacao"));

                switch(opcao) {
                    case 1:
                        obj.push(JOptionPane.showInputDialog("Informe um caracter").charAt(0));
                        break;
                    case 2:
                        char elemento;
                        elemento = obj.pop();
                        if(elemento != 0) {
                            JOptionPane.showMessageDialog(null, "Elemento removido: " + elemento, "Remoção", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        String caracteres;
                        caracteres = obj.getPilha();
                        JOptionPane.showMessageDialog(null, "Pilha completa: \n" + caracteres, "Impressao", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 4:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção Inválida", "Erro", JOptionPane.ERROR_MESSAGE);
                        break;
                }
            } while(opcao != 5);
        }
}
