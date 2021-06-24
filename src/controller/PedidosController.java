package controller;

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
                if (jRadioButtonPequena.isSelected()) {
                    pedido.setTamanho("Pequena");
                    pedido.setValor(20.00);
                } else if (jRadioButtonMedia.isSelected()){
                    pedido.setTamanho("Média");
                    pedido.setValor(30.00);
                } else {
                    pedido.setTamanho("Grande");
                    pedido.setValor(40.00);
                }

                VisualizacaoController vc = new VisualizacaoController(pedido);



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
