package Aula8;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ex8_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Janela");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Bem-vindo a Janela");
        frame.add(label);

        JButton button = new JButton("Fechar");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        frame.add(button);

        frame.setVisible(true);
    }
}
