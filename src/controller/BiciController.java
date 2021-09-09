package controller;

import access.BicicletasDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.BicicletasModel;
import view.viewbicicleta;

/**
 *
 * @author FAMILIAGGG
 */
public class BiciController implements ActionListener {
    private BicicletasModel bicicleta;
    private BicicletasDAO bicicletadao;
    private viewbicicleta bicicletavista;
    
    public BiciController (BicicletasModel bicicleta, BicicletasDAO bicicletadao, viewbicicleta bicicletavista) {
       this.bicicleta = bicicleta;
       this.bicicletadao = bicicletadao;
       this.bicicletavista = bicicletavista;
       
       
       this.bicicletavista.btncrearBicicleta.addActionListener(this);
       this.bicicletavista.btnactualizarBicicleta.addActionListener(this);
       this.bicicletavista.btneliminarBicicleta.addActionListener(this);
     
}
    public void iniciar () {
       bicicletavista.setTitle("BICICLETA");
       bicicletavista.setLocationRelativeTo(null);
       bicicletavista.txtId.setVisible(false);
    }
    
    @Override
    public void actionPerformed (ActionEvent e)
    {
    if (e.getSource() == bicicletavista.btncrearBicicleta)
    {
        bicicletavista.setCodigo(Integer.parseInt(bicicletavista.txtCodigo.getText()));
        bicicletavista.setFabricante(bicicletavista.txtFabricante.getText());
        bicicletavista.setPrecio(Double.parseDouble(bicicletavista.txtPrecio.getText()));
        bicicletavista.setAnio(Integer.parseInt(bicicletavista.txtAnio.getText());
     
        if (registros > 0){
                JOptionPane.showMessageDialog (null, "Se agregó el registro a la base de datos");
            limpiar;
              
        } else {
                JOptionPane.showMessageDialog (null, "No se agregó el registro a la base de datos");
            }
    }
    if (e.getSource() == bicicletavista.btnactualizarBicicleta)
    {   bicicletavista.setCodigo(Integer.parseInt(bicicletavista.txtCodigo.getText()));
        bicicletavista.setFabricante(bicicletavista.txtFabricante.getText());
        bicicletavista.setPrecio(Double.parseDouble(bicicletavista.txtPrecio.getText()));
        bicicletavista.setAnio(Integer.parseInt(bicicletavista.txtAnio.getText());
     
        if (registros > 0){
                JOptionPane.showMessageDialog (null, "Bicicleta actualizada");
            limpiar;
              
        } else {
                JOptionPane.showMessageDialog (null, "No se actualizó la Bicicleta");
            }
    }
    if (e.getSource() == bicicletavista.btneliminarBicicleta)
    {
        bicicletavista.setCodigo(Integer.parseInt(bicicletavista.txtCodigo.getText()));
        bicicletavista.setFabricante(bicicletavista.txtFabricante.getText());
        bicicletavista.setPrecio(Double.parseDouble(bicicletavista.txtPrecio.getText()));
        bicicletavista.setAnio(Integer.parseInt(bicicletavista.txtAnio.getText());
     
        if (registros > 0){
                JOptionPane.showMessageDialog (null, "Bicicleta eliminada");
            limpiar;
              
        } else {
                JOptionPane.showMessageDialog (null, "No se eliminó la Bicicleta");
            }
    }
            
    public void limpiar ()
    {
        bicicletavista.tsxtId.setText(null);
        bicicletavista.tsxtCodigo.setText(null);
        bicicletavista.tsxtFabricante.setText(null);
        bicicletavista.tsxtPrecio.setText(null);
        bicicletavista.tsxtAnio.setText(null);
        
    }
    
    }
    if (e.getSource() == bicicletavista.btnLimpiar) {
        limpiar ();
}
}