package Aula8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ex8_3 {
    JFrame janela = new JFrame("Calculadora");
    JPanel painel = new JPanel();
    JTextField campo1 = new JTextField(10);
    JTextField campo2 = new JTextField(10);
    JComboBox<String> operacoes = new JComboBox<>(new String[]{"Somar", "Subtrair", "Multiplicar", "Dividir"});
    JCheckBox mostrarResultado = new JCheckBox("Mostrar Resultado");
    JButton botaoCalcular = new JButton("Calcular");

    public ex8_3() {
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(300, 200);
        janela.setLayout(new FlowLayout());

        painel.add(campo1);
        painel.add(operacoes);
        painel.add(campo2);
        painel.add(mostrarResultado);
        painel.add(botaoCalcular);
        janela.add(painel);

        botaoCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcular();
            }
        });

        janela.setVisible(true);
    }

    private void calcular() {
        double num1 = Double.parseDouble(campo1.getText());
        double num2 = Double.parseDouble(campo2.getText());
        String operacao = (String) operacoes.getSelectedItem();
        double resultado = 0;

        switch (operacao) {
            case "Somar":
                resultado = num1 + num2;
                break;
            case "Subtrair":
                resultado = num1 - num2;
                break;
            case "Multiplicar":
                resultado = num1 * num2;
                break;
            case "Dividir":
                resultado = num1 / num2;
                break;
        }

        if (mostrarResultado.isSelected()) {
            JOptionPane.showMessageDialog(janela, "Resultado: " + resultado);
        } 
    }

    public static void main(String[] args) {
        new ex8_3();
    }
}

