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
        JMenu menuPedidos = new JMenu("Fazer Pedido");

        JMenuItem menuItemCadastroCliente = new JMenuItem("Cadastro de Cliente");
        JMenuItem menuItemCadastroPizza = new JMenuItem("Cadastro de Pizzas");

        menuCadastro.add(menuItemCadastroCliente);
        menuCadastro.add(menuItemCadastroPizza);


        menuBar.add(menuCadastro);
        menuBar.add(menuPedidos);



        return menuBar;


    }

}
