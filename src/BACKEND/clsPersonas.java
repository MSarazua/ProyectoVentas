/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BACKEND;

/**
 *
 * @author geovanni
 */
public class clsPersonas {
    //constructr
    public clsPersonas() {
    }
    
    //Atributos
    private int CODIGO;
    private String NOMBRE;
    private String APELLIDO;
    private String SEXO;
    private int TIPO_PERSONA;
    private String Usuario;
    private String Pass;

    public int getCODIGO() {
        return CODIGO;
    }

    public void setCODIGO(int CODIGO) {
        this.CODIGO = CODIGO;
    }

  
    
    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getAPELLIDO() {
        return APELLIDO;
    }

    public void setAPELLIDO(String APELLIDO) {
        this.APELLIDO = APELLIDO;
    }

    public String getSEXO() {
        return SEXO;
    }

    public void setSEXO(String SEXO) {
        this.SEXO = SEXO;
    }

    public int getTIPO_PERSONA() {
        return TIPO_PERSONA;
    }

    public void setTIPO_PERSONA(int TIPO_PERSONA) {
        this.TIPO_PERSONA = TIPO_PERSONA;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }
    
    
}
