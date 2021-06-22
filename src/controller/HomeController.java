package controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeController {
    private JPanel jPanelHome;

    public static void main(String[] args) {

        JMenuBar menuBar = getMenuBar();

        JFrame frame = new JFrame("Delivery");
        frame.setContentPane(new HomeController().jPanelHome);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setMinimumSize(new Dimension(800, 800));
        frame.setJMenuBar(menuBar);
        frame.pack();

    }

    private static JMenuBar getMenuBar() {
        JMenuBar menuBar = new JMenuBar();

        JMenu menuCadastro = new JMenu("Cadastro");
        JMenu menuPedidos = new JMenu("Pedidos");

        JMenuItem menuItemCadastroPizza = new JMenuItem("Cadastro de Pizzas");
        JMenuItem menuItemCadastroPedido = new JMenuItem("Fazer Pedido");

        menuCadastro.add(menuItemCadastroPizza);
        menuPedidos.add(menuItemCadastroPedido);


        menuBar.add(menuCadastro);
        menuBar.add(menuPedidos);

        menuItemCadastroPizza.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CadastroPizzaController cadastro = new CadastroPizzaController();

            }
        });

        menuItemCadastroPedido.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PedidosController pedidos = new PedidosController();
            }
        });





        return menuBar;


    }

}
