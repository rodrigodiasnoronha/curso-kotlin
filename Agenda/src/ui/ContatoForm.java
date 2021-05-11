package ui;

import business.ContatoBusiness;
import entity.Contato;

import javax.swing.*;
import java.awt.*;

public class ContatoForm extends JFrame {
    private JPanel rootContato;
    private JTextField inputTelefone;
    private JButton cancelarButton;
    private JButton salvarButton;
    private JTextField inputNome;

    private ContatoBusiness contatoBusiness;

    public ContatoForm() {
        contatoBusiness = new ContatoBusiness();
        setContentPane(rootContato);
        setSize(500, 250);
        setVisible(true);

        // posição -> centro da tela
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dimension.width / 2 - getSize().width / 2, dimension.height / 2 - getSize().height / 2);

        // encerra o programa ao clicar no x do windows
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.setListeners();
    }

    private void setListeners() {
        salvarButton.addActionListener(e -> {
            String nome = inputNome.getText();
            String telefone = inputTelefone.getText();

            try {
                contatoBusiness.salvarContato(nome, telefone);

                new MainForm();
                dispose();
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(new JFrame(), exception.getMessage());
            }
        });

        cancelarButton.addActionListener(e -> {
            new MainForm();
            dispose();
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
