package Aula8;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ex8_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 200);
        frame.setLayout(new FlowLayout());

        JLabel userLabel = new JLabel("Nome de Usuário:");
        JTextField userText = new JTextField(20);
        frame.add(userLabel);
        frame.add(userText);

        JLabel passLabel = new JLabel("Senha:");
        JPasswordField passText = new JPasswordField(20);
        frame.add(passLabel);
        frame.add(passText);

        JButton loginButton = new JButton("Entrar");
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText();
                JOptionPane.showMessageDialog(frame, "Bem-vindo, " + username + "!");
            }
        });
        frame.add(loginButton);

        frame.setVisible(true);

    }
}


