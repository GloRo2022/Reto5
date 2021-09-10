package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.BicicletasModel;
import access.BicicletasDAO;
import javax.swing.JOptionPane;
import view.viewbicicleta;


public class BiciController implements ActionListener {

    private BicicletasModel bicicleta;
    private BicicletasDAO bicicletadao;
    private viewbicicleta bicicletavista;

    public BiciController(BicicletasModel bicicleta, BicicletasDAO bicicletadao, viewbicicleta bicicletavista) {
        this.bicicleta    = bicicleta;
        this.bicicletadao = bicicletadao;
        this.bicicletavista = bicicletavista;

        this.bicicletavista.btncrearBicicleta.addActionListener(this);
        this.bicicletavista.btnactualizarBicicleta.addActionListener(this);
        this.bicicletavista.btneliminarBicicleta.addActionListener(this);

    }

    public void iniciar() {
        bicicletavista.setTitle("BICICLETA");
        bicicletavista.setLocationRelativeTo(null);
        //bicicletavista.txtId.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bicicletavista.btncrearBicicleta) {
            bicicleta.setBicId(Integer.parseInt(bicicletavista.txtBicId.getText()));
            bicicleta.setBicFabricante(bicicletavista.txtBicFabricante.getText());
            bicicleta.setBicPrecio(Double.parseDouble(bicicletavista.txtBicPrecio.getText()));
            bicicleta.setBicAnio(Integer.parseInt(bicicletavista.txtBicAnio.getText()));

            if (bicicletadao.agregarBicicleta(bicicleta)) {
                JOptionPane.showMessageDialog(null, "Se agregó el registro a la base de datos");
                //limpiar;

            } else {
                JOptionPane.showMessageDialog(null, "No se agregó el registro a la base de datos");
            }
        }
        if (e.getSource() == bicicletavista.btnactualizarBicicleta) {
            bicicleta.setBicId(Integer.parseInt(bicicletavista.txtBicId.getText()));
            bicicleta.setBicFabricante(bicicletavista.txtBicFabricante.getText());
            bicicleta.setBicPrecio(Double.parseDouble(bicicletavista.txtBicPrecio.getText()));
            bicicleta.setBicAnio(Integer.parseInt(bicicletavista.txtBicAnio.getText()));

            if (bicicletadao.actualizarBicicleta(bicicleta)) {
                JOptionPane.showMessageDialog(null, "Bicicleta actualizada");
                //limpiar;

            } else {
                JOptionPane.showMessageDialog(null, "No se actualizó la Bicicleta");
            }
        }
        if (e.getSource() == bicicletavista.btneliminarBicicleta) {
            bicicleta.setBicId(Integer.parseInt(bicicletavista.txtBicId.getText()));

            if (bicicletadao.eliminarBicicleta(bicicleta.getBicId())) {
                JOptionPane.showMessageDialog(null, "Bicicleta eliminada");
                //limpiar;

            } else {
                JOptionPane.showMessageDialog(null, "No se eliminó la Bicicleta");
            }
        }

//    public void limpiar ()
//    {
//        bicicletavista.tsxtId.setText(null);
//        bicicletavista.tsxtCodigo.setText(null);
//        bicicletavista.tsxtFabricante.setText(null);
//        bicicletavista.tsxtPrecio.setText(null);
//        bicicletavista.tsxtAnio.setText(null);
//        
//    }
//    
//    }
//    if (e.getSource() == bicicletavista.btnLimpiar) {
//        limpiar ();
//}
    }
}