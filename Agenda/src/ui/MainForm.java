package ui;

import business.ContatoBusiness;
import entity.Contato;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.rmi.server.ExportException;
import java.util.List;

public class MainForm extends JFrame {
    private JPanel rootPanel;
    private JButton botaoNovoContato;
    private JButton botaoRemoverContato;
    private JTable tabelaContatos;
    private JLabel labelTotalContatos;

    private ContatoBusiness contatoBusiness;
    private String nome = "";
    private String telefone = "";

    public MainForm() {
        contatoBusiness = new ContatoBusiness();
        setContentPane(rootPanel); // adiciona o painel a tela
        setSize(500, 250); // width e height do programa
        setVisible(true); // seta a tela como visible

        // posição -> centro da tela
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dimension.width / 2 - getSize().width / 2, dimension.height / 2 - getSize().height / 2);

        // encerra o programa ao clicar no x do windows
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // adiciona os listeners dos botões
        this.setListeners();

        this.listarContatos();
    }

    private void setListeners() {
        botaoNovoContato.addActionListener(e -> {
            new ContatoForm();
            dispose();
        });

        tabelaContatos.getSelectionModel().addListSelectionListener(e -> {
            if (e.getValueIsAdjusting()) {
                if (tabelaContatos.getSelectedRow() != -1) {
                    nome = tabelaContatos.getValueAt(tabelaContatos.getSelectedRow(), 1).toString();
                    telefone = tabelaContatos.getValueAt(tabelaContatos.getSelectedRow(), 0).toString();
                }
            }
        });

        botaoRemoverContato.addActionListener(e -> {
            try {
                contatoBusiness.deletarContato(nome, telefone);
                this.listarContatos();

                nome = "";
                telefone = "";
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(new JFrame(), exception.getMessage());
            }
        });
    }

    private void listarContatos() {
        List<Contato> contatoList = contatoBusiness.getContatoList();

        String[] nomeColunas = {"Nome", "Telefone"};
        DefaultTableModel defaultTableModel = new DefaultTableModel(new Object[0][0], nomeColunas);

        contatoList.forEach(e -> {
            Object[] o = new Object[2];

            o[0] = e.getNome();
            o[1] = e.getTelefone();

            defaultTableModel.addRow(o);
        });

        tabelaContatos.clearSelection();
        tabelaContatos.setModel(defaultTableModel);

        labelTotalContatos.setText(contatoBusiness.getTotalContato() + " contatos");
    }
}
