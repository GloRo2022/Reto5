package model;

public class ClientesModel {
    
    private String clienUser;
    private String clienNombres;
    private String clienApellidos;
    private String clienEmail;
    private String clienCelular;
    private String clienContrasena;
    private String clienFechaNacimiento;

    public ClientesModel(String clienUser, String clienNombres, String clienApellidos, String clienEmail, String clienCelular, String clienContrasena, String clienFechaNacimiento) {
        this.clienUser = clienUser;
        this.clienNombres = clienNombres;
        this.clienApellidos = clienApellidos;
        this.clienEmail = clienEmail;
        this.clienCelular = clienCelular;
        this.clienContrasena = clienContrasena;
        this.clienFechaNacimiento = clienFechaNacimiento;
    }

    /**
     * @return the clienUser
     */
    public String getClienUser() {
        return clienUser;
    }

    /**
     * @return the clienNombres
     */
    public String getClienNombres() {
        return clienNombres;
    }

    /**
     * @param clienNombres the clienNombres to set
     */
    public void setClienNombres(String clienNombres) {
        this.clienNombres = clienNombres;
    }

    /**
     * @return the clienApellidos
     */
    public String getClienApellidos() {
        return clienApellidos;
    }

    /**
     * @param clienApellidos the clienApellidos to set
     */
    public void setClienApellidos(String clienApellidos) {
        this.clienApellidos = clienApellidos;
    }

    /**
     * @return the clienEmail
     */
    public String getClienEmail() {
        return clienEmail;
    }

    /**
     * @param clienEmail the clienEmail to set
     */
    public void setClienEmail(String clienEmail) {
        this.clienEmail = clienEmail;
    }

    /**
     * @return the clienCelular
     */
    public String getClienCelular() {
        return clienCelular;
    }

    /**
     * @param clienCelular the clienCelular to set
     */
    public void setClienCelular(String clienCelular) {
        this.clienCelular = clienCelular;
    }

    /**
     * @return the clienContrasena
     */
    public String getClienContrasena() {
        return clienContrasena;
    }

    /**
     * @param clienContrasena the clienContrasena to set
     */
    public void setClienContrasena(String clienContrasena) {
        this.clienContrasena = clienContrasena;
    }

    /**
     * @return the clienFechaNacimiento
     */
    public String getClienFechaNacimiento() {
        return clienFechaNacimiento;
    }

    /**
     * @param clienFechaNacimiento the clienFechaNacimiento to set
     */
    public void setClienFechaNacimiento(String clienFechaNacimiento) {
        this.clienFechaNacimiento = clienFechaNacimiento;
    }
}
