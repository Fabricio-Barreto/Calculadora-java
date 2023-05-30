package br.com.calc.visao;

import javax.swing.*;
import java.awt.*;

public class Calculadora extends JFrame {
    public  Calculadora() {

        organizarLayout();

        setSize(300, 500); //Define o tamanho da tela.
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Ao fechar a tela do java, finalizará a aplicação.
        setLocationRelativeTo(null); // Abrirá a tela no centro do monitor.
        setVisible(true); // Ativa a visualização da aplicação.
    }

    private void organizarLayout() {
        setLayout(new BorderLayout());

        Display display = new Display();
        Teclado teclado = new Teclado();

        add(display, BorderLayout.NORTH);
        add(teclado, BorderLayout.CENTER);

        display.setPreferredSize(new Dimension(300, 100));
    }

    public static void main(String[] args) {
        new Calculadora();
    }
}
