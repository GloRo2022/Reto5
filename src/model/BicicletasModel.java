package model;

public class BicicletasModel {
    
    private int bicId;
    private String bicFabricante;
    private double bicPrecio;
    private int bicAnio;
    
    
    /**
     * Contructor para manejo de la tabla.
     * @param bicId
     * @param bicFabricante
     * @param bicPrecio
     * @param bicAnio 
     */
    
    
    public BicicletasModel(int bicId, String bicFabricante, double bicPrecio, int bicAnio) {
        this.bicId = bicId;
        this.bicFabricante = bicFabricante;
        this.bicPrecio = bicPrecio;
        this.bicAnio = bicAnio;
    }
    public BicicletasModel(String bicFabricante, double bicPrecio, int bicAnio) {
        this.bicFabricante = bicFabricante;
        this.bicPrecio = bicPrecio;
        this.bicAnio = bicAnio;
    }
    
    public int getBicId() {
        return bicId;
    }

    /**
     * @return the bicFabricante
     */
    public String getBicFabricante() {
        return bicFabricante;
    }

    /**
     * @param bicFabricante the bicFabricante to set
     */
    public void setBicFabricante(String bicFabricante) {
        this.bicFabricante = bicFabricante;
    }

    /**
     * @return the bicPrecio
     */
    public double getBicPrecio() {
        return bicPrecio;
    }

    /**
     * @param bicPrecio the bicPrecio to set
     */
    public void setBicPrecio(double bicPrecio) {
        this.bicPrecio = bicPrecio;
    }

    /**
     * @return the bicAnio
     */
    public int getBicAnio() {
        return bicAnio;
    }

    /**
     * @param bicAnio the bicAnio to set
     */
    public void setBicAnio(int bicAnio) {
        this.bicAnio = bicAnio;
    }
    
}
