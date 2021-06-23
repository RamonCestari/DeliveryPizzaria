package dao;

import model.Cliente;
import model.Pedido;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PedidosDAO {
    public void salvar(Pedido pd){
        String insert = "INSERT INTO pedidos (seu_pedido, nome, endereco, telefone)"+
            "VALUES(?,?,?,?)";

        PreparedStatement ps = null;
        try {
            ps = ConnectionDataBase.getConnection().prepareStatement(insert);
            ps.setObject(1,pd.getSeuPedido());
            ps.setObject(2,pd.getNome());
            ps.setObject(3,pd.getEndereco());
            ps.setObject(4,pd.getTelefone());


            ps.execute();
            ps.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public ArrayList listar(){
        String select = "SELECT * FROM pedidos";

        Statement ps = null;
        ArrayList pedido = new ArrayList<Pedido>();

        try {
            ps = ConnectionDataBase.getConnection().createStatement();
            ResultSet rs = ps.executeQuery(select);


            while(rs.next()){
                Pedido pd = new Pedido();
                pd.setSeuPedido(rs.getString("seu_pedido"));
                pd.setNome(rs.getString("nome"));
                pd.setEndereco(rs.getString("endereco"));
                pd.setTelefone(rs.getString("telefone"));

                pedido.add(pd);
            }

            ps.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return pedido;

    }

}
