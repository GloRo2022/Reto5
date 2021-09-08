
package model;


public class IntencionCompraModel {
    
    private int intId;
    private String clientes_fk;
    private int bicicletas_fk;
    private int motocicletas_fk;
    private String intFechaHora;

    public IntencionCompraModel(int intId, String clientes_fk, int bicicletas_fk, int motocicletas_fk, String intFechaHora) {
        this.intId = intId;
        this.clientes_fk = clientes_fk;
        this.bicicletas_fk = bicicletas_fk;
        this.motocicletas_fk = motocicletas_fk;
        this.intFechaHora = intFechaHora;
    }

    /**
     * @return the intId
     */
    public int getIntId() {
        return intId;
    }

    /**
     * @return the clientes_fk
     */
    public String getClientes_fk() {
        return clientes_fk;
    }

    /**
     * @param clientes_fk the clientes_fk to set
     */
    public void setClientes_fk(String clientes_fk) {
        this.clientes_fk = clientes_fk;
    }

    /**
     * @return the bicicletas_fk
     */
    public int getBicicletas_fk() {
        return bicicletas_fk;
    }

    /**
     * @param bicicletas_fk the bicicletas_fk to set
     */
    public void setBicicletas_fk(int bicicletas_fk) {
        this.bicicletas_fk = bicicletas_fk;
    }

    /**
     * @return the motocicletas_fk
     */
    public int getMotocicletas_fk() {
        return motocicletas_fk;
    }

    /**
     * @param motocicletas_fk the motocicletas_fk to set
     */
    public void setMotocicletas_fk(int motocicletas_fk) {
        this.motocicletas_fk = motocicletas_fk;
    }

    /**
     * @return the intFechaHora
     */
    public String getIntFechaHora() {
        return intFechaHora;
    }

    /**
     * @param intFechaHora the intFechaHora to set
     */
    public void setIntFechaHora(String intFechaHora) {
        this.intFechaHora = intFechaHora;
    }
    
}
