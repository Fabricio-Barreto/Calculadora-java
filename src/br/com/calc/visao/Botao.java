package br.com.calc.visao;

import javax.swing.*;
import java.awt.*;

public class Botao extends JButton {

    public Botao(String texto, Color cor) {
        setText(texto);
        setFont(new Font("courier", Font.PLAIN, 25));
        setOpaque(true);
        setBackground(cor); //Cor do fundo
        setForeground(Color.WHITE); // Cor da fonte
        setBorder(BorderFactory.createLineBorder(Color.BLACK)); // Cor das linhas de espaçamento entre cada botão.
    }
}
