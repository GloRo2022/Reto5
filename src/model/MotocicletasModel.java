
package model;


public class MotocicletasModel {
    
    private int     motId;
    private String  motFabricante;
    private int     motPrecio;
    private int     motAutonomiaBateria;
    private int     proveedor_fk;

    public MotocicletasModel(int motId, String motFabricante, int motPrecio, int motAutonomiaBateria, int proveedor_fk) {
        this.motId = motId;
        this.motFabricante = motFabricante;
        this.motPrecio = motPrecio;
        this.motAutonomiaBateria = motAutonomiaBateria;
        this.proveedor_fk = proveedor_fk;
    }

    /**
     * @return the motId
     */
    public int getMotId() {
        return motId;
    }

    /**
     * @return the motFabricante
     */
    public String getMotFabricante() {
        return motFabricante;
    }

    /**
     * @param motFabricante the motFabricante to set
     */
    public void setMotFabricante(String motFabricante) {
        this.motFabricante = motFabricante;
    }

    /**
     * @return the motPrecio
     */
    public int getMotPrecio() {
        return motPrecio;
    }

    /**
     * @param motPrecio the motPrecio to set
     */
    public void setMotPrecio(int motPrecio) {
        this.motPrecio = motPrecio;
    }

    /**
     * @return the motAutonomiaBateria
     */
    public int getMotAutonomiaBateria() {
        return motAutonomiaBateria;
    }

    /**
     * @param motAutonomiaBateria the motAutonomiaBateria to set
     */
    public void setMotAutonomiaBateria(int motAutonomiaBateria) {
        this.motAutonomiaBateria = motAutonomiaBateria;
    }

    /**
     * @return the proveedor_fk
     */
    public int getProveedor_fk() {
        return proveedor_fk;
    }

    /**
     * @param proveedor_fk the proveedor_fk to set
     */
    public void setProveedor_fk(int proveedor_fk) {
        this.proveedor_fk = proveedor_fk;
    }
    
}
