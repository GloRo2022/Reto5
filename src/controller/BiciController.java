package controller;

import access.BicicletasDAO;
import model.BicicletasModel;
import view.viewbicicleta;

/**
 *
 * @author FAMILIAGGG
 */
public class BiciController {
    private BicicletasModel bicicleta;
    private BicicletasDAO bicicletadao;
    private viewbicicleta bicicletavista;
    
    public BiciController (BicicletasModel bicicleta, BicicletasDAO bicicletadao, viewbicicleta bicicletavista) {
       this.bicicleta = bicicleta;
       this.bicicletadao = bicicletadao;
       this.bicicletavista = bicicletavista;
}
}