package controller;

import dao.PedidosDAO;
import model.Pedido;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VisualizacaoController {
    private JPanel jPanelVisualização;
    private JLabel JLabelCofira;
    private JButton jButtonConfirmar;
    private JLabel jLabelPizza;
    private JLabel jLabelTamanho;
    private JLabel jLabelNome;
    private JLabel jLabelEndereco;
    private JLabel jLabelTelefone;


    public VisualizacaoController(Pedido pedido){
        JFrame frame = new JFrame("Confirmação de Pedido");
        jLabelPizza.setText(pedido.getSeuPedido());
        jLabelTamanho.setText(pedido.getTamanho());
        jLabelNome.setText(pedido.getNome());
        jLabelTelefone.setText(pedido.getTelefone());
        jLabelEndereco.setText(pedido.getEndereco());

        frame.setContentPane(jPanelVisualização);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        frame.setMinimumSize(new Dimension(800, 800));
        //frame.setJMenuBar(menuBar);
        frame.pack();


        jButtonConfirmar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PedidosDAO dao = new PedidosDAO();
                dao.salvar(pedido);

            }
        });
    }
}
