package dao;

import model.Pedido;
import model.Pizzas;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CadastroPizzaDAO {
    public void salvar(Pizzas pz){
        String insert = "INSERT INTO pizzas (sabor, ingredientes, valor)"+
                "VALUES(?,?,?)";

        PreparedStatement ps = null;
        try {
            ps = ConnectionDataBase.getConnection().prepareStatement(insert);
            ps.setObject(1,pz.getSabor());
            ps.setObject(2,pz.getIngredientes());
            ps.setObject(3,pz.getValor());



            ps.execute();
            ps.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public ArrayList listar(){
        String select = "SELECT * FROM pedidos";

        Statement ps = null;
        ArrayList pizza = new ArrayList<Pizzas>();

        try {
            ps = ConnectionDataBase.getConnection().createStatement();
            ResultSet rs = ps.executeQuery(select);


            while(rs.next()){
                Pizzas pz = new Pizzas();
                pz.setSabor(rs.getString("sabor"));
                pz.setIngredientes(rs.getString("ingredientes"));
                pz.setValor(rs.getString("valor"));

                pizza.add(pz);
            }

            ps.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return pizza;
    }
}
