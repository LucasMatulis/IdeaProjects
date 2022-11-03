package Pilha;

import javax.swing.*;


public class Pilha {
    private int topo = -1;
    private int tamanho = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o tamanho da pilha", "TESTEEEE", JOptionPane.QUESTION_MESSAGE));
    private char elementos[] = new char[tamanho];

    public void push(char elemento) {
        boolean teste = false;
        topo++;
        teste = verificaPilha();

        if(teste == true) {
            topo--;
            JOptionPane.showMessageDialog(null, "A Pilha está cheia", "Pilha", JOptionPane.ERROR_MESSAGE);
        } else {
            elementos[topo] = elemento;
        }
    }

    public char pop() {
        boolean teste = false;
        char elemento = 0;
        teste = verificaPilha2();

        if(teste == true) {
            JOptionPane.showMessageDialog(null, "A Pilha está vazia", "Pilha", JOptionPane.ERROR_MESSAGE);
        } else {
            elemento = elementos[topo];
            elementos[topo] = 0;
            topo--;
        }

        return elemento;
    }

    public String getPilha() {
        String texto = "";
        for(int i = 0; i < elementos.length; i++) {
            if(elementos[i] != 0) {
                texto = elementos[i] + "\n" + texto;
            }
        }

        return texto;
    }

    public boolean verificaPilha() {
        if(topo == tamanho) {
            return true;
        } else {
            return false;
        }
    }

    public boolean verificaPilha2() {
        if(topo == -1) {
            return true;
        } else {
            return false;
        }
    }

}
