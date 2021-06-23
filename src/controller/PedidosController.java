package controller;

import dao.PedidosDAO;
import model.Cliente;
import model.Pedido;

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
                Pedido pedido = new Pedido();
                pedido.setSeuPedido(jTextDFieldPedido.getText());
                pedido.setNome(jTextFieldNome.getText());
                pedido.setEndereco(jTextFieldEndereco.getText());
                pedido.setTelefone(jTextFieldTelefone.getText());

                PedidosDAO dao = new PedidosDAO();
                dao.salvar(pedido);


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
