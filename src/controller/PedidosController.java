package controller;

import model.Cliente;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PedidosController {
    private JTextField jTextDFieldPedido;
    private JLabel jLabelSeuPedido;
    private JLabel jLabelTamanho;
    private JRadioButton jRadioButtonPequena;
    private JRadioButton jRadioButtonMedia;
    private JRadioButton jRadioButtonGrande;
    private JTextField jTextFieldNome;
    private JTextField jTextFieldTelefone;
    private JTextField jTextFieldEndereco;
    private JLabel jLabelNome;
    private JLabel jLabelTelefone;
    private JLabel jLabelEndereco;
    private JPanel jPanelPedidos;
    private JButton jButtonCadastrarPedido;
    private JButton jButtonLimparPedido;
    private JButton jButtonVoltarPedido;

    public PedidosController(){
        JFrame frame = new JFrame("Pedidos");
        frame.setContentPane(jPanelPedidos);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setMinimumSize(new Dimension(800, 800));
        //frame.setJMenuBar(menuBar);
        frame.pack();


        jButtonCadastrarPedido.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cliente cliente = new Cliente();
                cliente.setNome(jTextFieldNome.getText());
                cliente.setEndereco(jTextFieldEndereco.getText());
                cliente.setTelefone(jTextFieldTelefone.getText());

                Cliente clienteDAO = new Cliente();
                Cliente.salvar(cliente)


            }
        });

        jButtonLimparPedido.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextDFieldPedido.setText("");
                jTextFieldNome.setText("");
                jTextFieldEndereco.setText("");
                jTextFieldTelefone.setText("");

            }
        });

        jButtonVoltarPedido.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();

            }
        });
    }
}
