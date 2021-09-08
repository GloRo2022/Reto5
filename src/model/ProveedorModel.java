/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author EQ01
 */
public class ProveedorModel {
    
    private int provId;
    private String provNombre;
    private String provDireccion;
    private String provTelefono;

    public ProveedorModel(int provId, String provNombre, String provDireccion, String provTelefono) {
        this.provId = provId;
        this.provNombre = provNombre;
        this.provDireccion = provDireccion;
        this.provTelefono = provTelefono;
    }

    /**
     * @return the provId
     */
    public int getProvId() {
        return provId;
    }

    /**
     * @return the provNombre
     */
    public String getProvNombre() {
        return provNombre;
    }

    /**
     * @param provNombre the provNombre to set
     */
    public void setProvNombre(String provNombre) {
        this.provNombre = provNombre;
    }

    /**
     * @return the provDireccion
     */
    public String getProvDireccion() {
        return provDireccion;
    }

    /**
     * @param provDireccion the provDireccion to set
     */
    public void setProvDireccion(String provDireccion) {
        this.provDireccion = provDireccion;
    }

    /**
     * @return the provTelefono
     */
    public String getProvTelefono() {
        return provTelefono;
    }

    /**
     * @param provTelefono the provTelefono to set
     */
    public void setProvTelefono(String provTelefono) {
        this.provTelefono = provTelefono;
    }
}
