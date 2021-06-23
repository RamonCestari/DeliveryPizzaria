package controller;

import dao.CadastroPizzaDAO;
import model.Pizzas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroPizzaController {
    private JLabel jLabelCadastroPizza;
    private JTextField jTextFieldSabor;
    private JTextField jTextFieldIngredientes;
    private JTextField jTextFiledValor;
    private JButton jButtonCadastrarPizza;
    private JButton jButtonVoltar;
    private JPanel jPanelCadastroPizza;
    private JButton jButtonLimpar;

    public CadastroPizzaController() {
        JFrame frame = new JFrame("Cadastro de Pizzas");
        frame.setContentPane(jPanelCadastroPizza);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setMinimumSize(new Dimension(800, 800));
        //frame.setJMenuBar(menuBar);
        frame.pack();

        jButtonCadastrarPizza.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pizzas pizza = new Pizzas();
                pizza.setSabor(jTextFieldSabor.getText());
                pizza.setIngredientes(jTextFieldIngredientes.getText());
                pizza.setValor(jTextFiledValor.getText());

                CadastroPizzaDAO dao = new CadastroPizzaDAO();
                dao.salvar(pizza);

            }
        });

        jButtonVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();

            }
        });
        jButtonLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextFieldSabor.setText("Sabor da Pizza");
                jTextFieldIngredientes.setText("Ingrediente");
                jTextFiledValor.setText("Valor");

            }
        });

    }


}
