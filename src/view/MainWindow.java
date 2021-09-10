package view;

import access.BicicletasDAO;
import controller.BiciController;
import model.BicicletasModel;

public class MainWindow {
      
    
    public static void main (String[] args){
      BicicletasModel bicicleta     = new BicicletasModel();
      BicicletasDAO bicicletadao    = new BicicletasDAO();
      viewbicicleta bicicletavista  = new viewbicicleta();
      BiciController controlador    = new BiciController (bicicleta, bicicletadao, bicicletavista);
      
      controlador.iniciar();
      bicicletavista.setVisible(true); 
      
      
}
}
     
