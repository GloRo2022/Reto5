package access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.BicicletasModel;
import utils.ConnectionDB;

public class BicicletasDAO {
    
    private Connection conn = null;
    public ArrayList<BicicletasModel> obtenerBicicletas(){
        ArrayList <BicicletasModel> bicicletas = new ArrayList <> ();
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            String sql = "SELECT * FROM bicicletas ";
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet resultado = statement.executeQuery();
        while (resultado.next()) {
            int Id = resultado.getInt(1);
            String fabricante = resultado.getString(2);
            Double precio = resultado.getDouble(3);
            int anio = resultado.getInt (4);
            
            BicicletasModel bicicleta = new BicicletasModel (Id, fabricante, precio, anio);
            bicicletas.add(bicicleta);
        }
        
        }   
        catch (SQLException ex) {
            Logger.getLogger(BicicletasDAO.class.getName()).log(Level.SEVERE, null, ex);
        
        }
        return bicicletas;
    }
    
    public BicicletasModel obtenerBicicleta(){
    }   
    public void agregarBicicleta(BicicletasModel bicicleta){
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            String sql = "INSERT INTO bicicletas (fabricante, "
                    + "precio_unitario, anio_contruccion) VALUES (?"
                    + "?, ?);";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, bicicleta.getBicFabricante());
            statement.setDouble(2, bicicleta.getBicPrecio());
            statement.setInt(3, bicicleta.getBicAnio());
            int registros = statement.executeUpdate();
            
            if (registros > 0){
                JOptionPane.showMessageDialog (null, "Se agregó el registro a la base de datos");
            }
            else {
                JOptionPane.showMessageDialog (null, "No se agregó el registro a la base de datos");
            }
            
        }catch (SQLException e) {
        }
    }
    
    public void actualizarBicicleta(){
        
    }
    
    public void eliminarBicicleta(int bicId){
        
    }
}
