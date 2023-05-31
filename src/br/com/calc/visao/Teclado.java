package br.com.calc.visao;

import br.com.calc.modelo.Memoria;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Teclado extends JPanel implements ActionListener {

    private final Color COR_CINZA_ESCURO = new Color(68,68,68);
    private final Color COR_CINZA_CLARO = new Color(97,100,99);
    private final Color COR_LARANJA = new Color(242,163,60);

    public Teclado() {

        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints constraint = new GridBagConstraints();

        setLayout(layout);

        constraint.weightx = 1;
        constraint.weighty = 1;
        constraint.fill = GridBagConstraints.BOTH;

        constraint.gridwidth = 3;
        adicionarBotao("AC", COR_CINZA_ESCURO, constraint, 0, 0);
        constraint.gridwidth = 1;
        adicionarBotao("/", COR_LARANJA, constraint, 3, 0);

        adicionarBotao("7", COR_CINZA_CLARO, constraint, 0, 1);
        adicionarBotao("8", COR_CINZA_CLARO, constraint, 1, 1);
        adicionarBotao("9", COR_CINZA_CLARO, constraint, 2, 1);
        adicionarBotao("*", COR_LARANJA, constraint, 3, 1);

        adicionarBotao("4", COR_CINZA_CLARO, constraint, 0, 2);
        adicionarBotao("5", COR_CINZA_CLARO, constraint, 1, 2);
        adicionarBotao("6", COR_CINZA_CLARO, constraint, 2, 2);
        adicionarBotao("-", COR_LARANJA, constraint, 3, 2);

        adicionarBotao("1", COR_CINZA_CLARO, constraint, 0, 3);
        adicionarBotao("2", COR_CINZA_CLARO, constraint, 1, 3);
        adicionarBotao("3", COR_CINZA_CLARO, constraint, 2, 3);
        adicionarBotao("+", COR_LARANJA, constraint, 3, 3);

        constraint.gridwidth = 2;
        adicionarBotao("0", COR_CINZA_CLARO, constraint, 0, 4);
        constraint.gridwidth = 1;
        adicionarBotao(",", COR_CINZA_CLARO, constraint, 2, 4);
        adicionarBotao("=", COR_CINZA_CLARO, constraint, 3, 4);



    }

    private void adicionarBotao(String texto, Color cor, GridBagConstraints constraint, int x, int y) {
        constraint.gridx = x;
        constraint.gridy = y;
        Botao botao = new Botao(texto, cor);
        botao.addActionListener(this);
        add(botao, constraint);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() instanceof  JButton) {
            JButton botao = (JButton) e.getSource();
            Memoria.getInstance().processarComando(botao.getText());
        }
    }
}
