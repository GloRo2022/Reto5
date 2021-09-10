package access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.BicicletasModel;
import utils.ConnectionDB;

public class BicicletasDAO {
    
    private Connection conn = null;    
    public ArrayList<BicicletasModel> obtenerBicicletas(){
        ArrayList<BicicletasModel> bicicletas = new ArrayList<BicicletasModel>();
        try{
        if (conn == null) 
            conn = ConnectionDB.getConnection();
            
        String sql = "SELECT b.idbicicletas, b.fabricante, b.precio_unitario, "
                + "b.anio_contruccion FROM bicicletas b;";  
        Statement statement = conn.createStatement();
        ResultSet result = statement.executeQuery(sql);
        while (result.next()) {
                BicicletasModel bicicleta = new BicicletasModel(result.getInt(1), result.getString(2), result.getDouble(3), result.getInt(4));
                bicicletas.add(bicicleta);
            }
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Código : " + e.getErrorCode() 
                                        + "\nError :" + e.getMessage());
        }
        return null;
    }
    
    public BicicletasModel obtenerBicicleta(int id){
        BicicletasModel bicicleta = null;
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "SELECT b.idbicicletas, b.fabricante, b.precio_unitario, "
                + "b.anio_contruccion FROM bicicletas b;";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                bicicleta = new BicicletasModel(id, result.getString(2), result.getDouble(3), result.getInt(4));
                break;
            }
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
        return bicicleta;
    }
    
    public boolean agregarBicicleta(BicicletasModel bicicleta){
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            String sql = "INSERT INTO bicicletas (idbicicletas, fabricante, "
                    + "precio_unitario, anio_contruccion) VALUES (?, ?"
                    + "?, ?, ?);";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, bicicleta.getBicId());
            statement.setString(2, bicicleta.getBicFabricante());
            statement.setDouble(3, bicicleta.getBicPrecio());
            statement.setInt(4, bicicleta.getBicId());
            int rowsInserted = statement.executeUpdate();
            
            //if(rowsInserted > 0) 
                //JOptionPane.showMessageDialog(null, "El registro fue agregado exitosamente !");
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Código : " + e.getErrorCode() 
                                        + "\nError :" + e.getMessage());
        }
            return true;
    }
    
    public boolean actualizarBicicleta(BicicletasModel bicicleta){
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "UPDATE bicicletas SET anio_contruccion = ? WHERE idbicicletas =? ;";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, bicicleta.getBicAnio());
            statement.setInt(2, bicicleta.getBicId());
            
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) 
                JOptionPane.showMessageDialog(null, "El registro fue actualizado exitosamente !");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
        return true;
    }
    
    public boolean eliminarBicicleta(int id){
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "DELETE FROM bicicletas WHERE idbicicletas=?;";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, id);
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "El registro fue borrado exitosamente !");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : "
                    + ex.getErrorCode() + "\nError :" + ex.getMessage());
        }
        return true;
    }
}

